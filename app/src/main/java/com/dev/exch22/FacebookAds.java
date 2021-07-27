package com.dev.exch22;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;

public class FacebookAds {


    public void banner(final Context context, final ViewGroup viewGroup) {
        try {
            final NativeBannerAd nativeBannerAd = new NativeBannerAd(context,context.getResources().getString(R.string.fb_banner));
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                public void onAdClicked(Ad ad) {
                }

                public void onLoggingImpression(Ad ad) {
                }

                public void onMediaDownloaded(Ad ad) {
                }

                public void onError(Ad ad, AdError adError) {

                }

                public void onAdLoaded(Ad ad) {
                    try {
                        View render = NativeBannerAdView.render(context, nativeBannerAd, NativeBannerAdView.Type.HEIGHT_120);
                        Log.e("Native Ad", "Loaded");
                        viewGroup.removeAllViews();
                        viewGroup.addView(render);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).build());
            nativeBannerAd.loadAd();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void nativead(Context context, ViewGroup viewGroup, ImageView imageView) {

        Log.d("myReceiver", "myreceivercalled");
        try {
            NativeAd nativeAd = new NativeAd(context,context.getResources().getString(R.string.fb_banner));
            final Context context2 = context;
            final ViewGroup viewGroup2 = viewGroup;
            final NativeAd nativeAd2 = nativeAd;
            final ImageView imageView2 = imageView;
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new NativeAdListener() {
                public void onAdClicked(Ad ad) {
                }

                public void onLoggingImpression(Ad ad) {
                }

                public void onMediaDownloaded(Ad ad) {
                }

                public void onError(Ad ad, AdError adError) {


                }

                public void onAdLoaded(Ad ad) {
                    try {
                        View render = NativeAdView.render(context2, nativeAd2, NativeAdView.Type.HEIGHT_300);
                        Log.e("Native Ad", "Loaded");
                        imageView2.setVisibility(View.GONE);
                        viewGroup2.removeAllViews();
                        viewGroup2.addView(render);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).build());
            nativeAd.loadAd();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
