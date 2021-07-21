package com.example.exchange22_sportstokeexchangeanalysis.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityAboutBinding;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityTermAndConditionBinding;

public class Term_and_condition_Activity extends AppCompatActivity {
ActivityTermAndConditionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTermAndConditionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Term and contition");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }  @Override
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