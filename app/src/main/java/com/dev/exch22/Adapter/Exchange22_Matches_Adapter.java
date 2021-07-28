package com.dev.exch22.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.dev.exch22.Model.Exchange22_Match;
import com.dev.exch22.R;
import com.dev.exch22.databinding.MatchSampleLayoutBinding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static android.media.CamcorderProfile.get;

public class Exchange22_Matches_Adapter extends RecyclerView.Adapter<Exchange22_Matches_Adapter.ViewHolder> {
    List<Exchange22_Match> codebeautifyArrayList;
    String newDateString;
    boolean isSize=false;

    public Exchange22_Matches_Adapter(List<Exchange22_Match> codebeautifyArrayList) {
        this.codebeautifyArrayList = codebeautifyArrayList;

    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.match_sample_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(Exchange22_Matches_Adapter.ViewHolder holder, int position) {
        if (isSize){
            Toast.makeText(holder.itemView.getContext(), "Please Check your Internet", Toast.LENGTH_LONG).show();
        }else {
            holder.binding.textView67.setText(codebeautifyArrayList.get(position).getTeam1());
            holder.binding.textView68.setText(codebeautifyArrayList.get(position).getTeam2());

            String dateInString = codebeautifyArrayList.get(position).getDateTimeGMT().toString();


            Date date=null;
            SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy");
            String temp = codebeautifyArrayList.get(position).getDateTimeGMT().toString();
            try {
                date = formatter.parse(temp);
                Log.e("formated date ", date + "");
            } catch (ParseException e) {
                e.printStackTrace();
            }

            String formateDate = new SimpleDateFormat("MM-dd-yyyy -- HH:mm:ss").format(date);
            Log.v("output date ",formateDate);
            holder.binding.textView69.setText(formateDate);


        }


    }

    @Override
    public int getItemCount() {
        if (codebeautifyArrayList.size()==0) {
            isSize = true;
        }
            return codebeautifyArrayList.size();


    }

    public void setList(List<Exchange22_Match> versionList) {
        codebeautifyArrayList= versionList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        MatchSampleLayoutBinding binding;
        public ViewHolder(  View itemView) {
            super(itemView);
            binding =MatchSampleLayoutBinding.bind(itemView);
        }
    }
}
