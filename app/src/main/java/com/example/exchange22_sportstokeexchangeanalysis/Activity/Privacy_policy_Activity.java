package com.example.exchange22_sportstokeexchangeanalysis.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityPrivacyPolicyBinding;

public class Privacy_policy_Activity extends AppCompatActivity {
ActivityPrivacyPolicyBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrivacyPolicyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Privacy policy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.imageView26.setOnClickListener(v -> {

            if ( binding.textView65.getVisibility() == View.VISIBLE) {
                binding.textView65.setVisibility(View.GONE);
                binding.imageView26.setImageResource(R.drawable.ic_bottom_top_foreground);

            } else {
                 binding.textView65.setVisibility(View.VISIBLE);
                 binding.imageView26.setImageResource(R.drawable.ic_bottom_foreground);


            }


        });


        binding.imageView30.setOnClickListener(v -> {
            if ( binding.textView70.getVisibility() == View.VISIBLE) {
                binding.textView70.setVisibility(View.GONE);
                binding.imageView30.setImageResource(R.drawable.ic_bottom_top_foreground);

            } else {
                binding.textView70.setVisibility(View.VISIBLE);
                binding.imageView30.setImageResource(R.drawable.ic_bottom_foreground);


            }
        });
        binding.imageView31.setOnClickListener(v -> {
            if ( binding.textView71.getVisibility() == View.VISIBLE) {
                binding.textView71.setVisibility(View.GONE);
                binding.imageView31.setImageResource(R.drawable.ic_bottom_top_foreground);

            } else {
                binding.textView71.setVisibility(View.VISIBLE);
                binding.imageView31.setImageResource(R.drawable.ic_bottom_foreground);


            }
        });
        binding.imageView32.setOnClickListener(v -> {
            if ( binding.textView72.getVisibility() == View.VISIBLE) {
                binding.textView72.setVisibility(View.GONE);
                binding.imageView32.setImageResource(R.drawable.ic_bottom_top_foreground);

            } else {
                binding.textView72.setVisibility(View.VISIBLE);
                binding.imageView32.setImageResource(R.drawable.ic_bottom_foreground);


            }
        });
        binding.imageView33.setOnClickListener(v -> {
            if ( binding.textView73.getVisibility() == View.VISIBLE) {
                binding.textView73.setVisibility(View.GONE);
                binding.imageView33.setImageResource(R.drawable.ic_bottom_top_foreground);

            } else {
                binding.textView73.setVisibility(View.VISIBLE);
                binding.imageView33.setImageResource(R.drawable.ic_bottom_foreground);


            }
        });
        binding.imageView34.setOnClickListener(v -> {
            if ( binding.textView74.getVisibility() == View.VISIBLE) {
                binding.textView74.setVisibility(View.GONE);
                binding.imageView34.setImageResource(R.drawable.ic_bottom_top_foreground);

            } else {
                binding.textView74.setVisibility(View.VISIBLE);
                binding.imageView34.setImageResource(R.drawable.ic_bottom_foreground);


            }
        });
        binding.imageView35.setOnClickListener(v -> {
            if ( binding.textView75.getVisibility() == View.VISIBLE) {
                binding.textView75.setVisibility(View.GONE);
                binding.imageView35.setImageResource(R.drawable.ic_bottom_top_foreground);

            } else {
                binding.textView75.setVisibility(View.VISIBLE);
                binding.imageView35.setImageResource(R.drawable.ic_bottom_foreground);


            }
        });









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