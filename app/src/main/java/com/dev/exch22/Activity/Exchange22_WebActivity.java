package com.dev.exch22.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.dev.exch22.R;

public class Exchange22_WebActivity extends AppCompatActivity {
WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        mWebView = (WebView) findViewById(R.id.webView);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebSettings webSettings = mWebView.getSettings();

        mWebView.loadUrl("https://www.exchange22.com/index.html");
    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();

        }
        return super.onOptionsItemSelected(item);
    }
}