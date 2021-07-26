package com.example.exchange22_sportstokeexchangeanalysis.Adapter;

import android.app.usage.UsageEvents;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exchange22_sportstokeexchangeanalysis.Events;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Demo;
import com.example.exchange22_sportstokeexchangeanalysis.Model.EVV;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Event;
import com.example.exchange22_sportstokeexchangeanalysis.Model.T1;
import com.example.exchange22_sportstokeexchangeanalysis.Model.T2;
import com.example.exchange22_sportstokeexchangeanalysis.Model.TeamOne;
import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.MatchSampleLayoutBinding;

import java.util.ArrayList;
import java.util.List;

import static android.media.CamcorderProfile.get;

public class Matches_Adapter extends RecyclerView.Adapter<Matches_Adapter.ViewHolder> {
    List<Demo> codebeautifyArrayList;


    public Matches_Adapter(List<Demo> codebeautifyArrayList) {
        this.codebeautifyArrayList = codebeautifyArrayList;

    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.match_sample_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(  Matches_Adapter.ViewHolder holder, int position) {


 //  holder.binding.textView68.setText(codebeautifyArrayList.get(position).getCcd());
   holder.binding.textView66.setText(codebeautifyArrayList.get(position).getSnm());

  /* T1 eev=codebeautifyArrayList.get(position).events.get(position).t1.get(position);
        String name = eev.getNm();*/

   try {
       T1 eev=codebeautifyArrayList.get(position).events.get(0).t1.get(0);
       T2 eev2=codebeautifyArrayList.get(position).events.get(0).t2.get(0);


       String name= eev.getNm();
       String name2 = eev2.getNm();
    //  String name =  codebeautifyArrayList.get(position).events.get(position).t1.get(position).getNm();
       holder.binding.textView67.setText(name);
       holder.binding.textView68.setText(name2);

       Log.d("myTag", "onBindViewHolder: "+name);
   }
   catch (Exception e){
       Log.d("myTag", "onBindViewHolder: "+e.getLocalizedMessage());

       e.printStackTrace();
   }



       // holder.binding.textView67.setText(nnnnamwe);
     //   holder.binding.textView67.setText("vishal"+nnnnamwe+"vishal");
      //  Log.d("myTag", "onBindViewHolder: "+nnnnamwe);


   holder.binding.textView69.setText(codebeautifyArrayList.get(position).getCsnm());
      //  holder.binding.textView66.setText(codebeautifyArrayList.get(1).getCcd());

    }

    @Override
    public int getItemCount() {

        return codebeautifyArrayList.size();
    }

    public void setList(List<Demo> versionList) {
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
