package com.example.exchange22_sportstokeexchangeanalysis.Adapter;

import android.app.usage.UsageEvents;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.exchange22_sportstokeexchangeanalysis.Model.Match;
import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.MatchSampleLayoutBinding;
import java.util.List;



public class Matches_Adapter extends RecyclerView.Adapter<Matches_Adapter.ViewHolder> {
    List<Match> codebeautifyArrayList;
    String newDateString;

    public Matches_Adapter(List<Match> codebeautifyArrayList) {
        this.codebeautifyArrayList = codebeautifyArrayList;

    }
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.match_sample_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(  Matches_Adapter.ViewHolder holder, int position) {

        holder.binding.textView67.setText(codebeautifyArrayList.get(position).getTeam1());
        holder.binding.textView68.setText(codebeautifyArrayList.get(position).getTeam2());

        String dateInString = codebeautifyArrayList.get(position).getDate().toString();

        holder.binding.textView69.setText(dateInString);


    }

    @Override
    public int getItemCount() {

        return codebeautifyArrayList.size();
    }

    public void setList(List<Match> versionList) {
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
