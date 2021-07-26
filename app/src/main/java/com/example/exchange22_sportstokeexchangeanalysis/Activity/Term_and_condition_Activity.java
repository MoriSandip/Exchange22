package com.example.exchange22_sportstokeexchangeanalysis.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.exchange22_sportstokeexchangeanalysis.R;
import com.example.exchange22_sportstokeexchangeanalysis.databinding.ActivityTermAndConditionBinding;

public class Term_and_condition_Activity extends AppCompatActivity {

    ActivityTermAndConditionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityTermAndConditionBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Term and contition");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.imageView36intro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro1.getVisibility() == View.VISIBLE) {
                    binding.textView77intro1.setVisibility(View.GONE);
                    binding.imageView36intro1.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro1.setVisibility(View.VISIBLE);

                    binding.imageView36intro1.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro2.getVisibility() == View.VISIBLE) {
                    binding.textView77intro2.setVisibility(View.GONE);
                    binding.imageView36intro2.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro2.setVisibility(View.VISIBLE);

                    binding.imageView36intro2.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro3.getVisibility() == View.VISIBLE) {
                    binding.textView77intro3.setVisibility(View.GONE);
                    binding.imageView36intro3.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro3.setVisibility(View.VISIBLE);

                    binding.imageView36intro3.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro4.getVisibility() == View.VISIBLE) {
                    binding.textView77intro4.setVisibility(View.GONE);
                    binding.imageView36intro4.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro4.setVisibility(View.VISIBLE);

                    binding.imageView36intro4.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro5.getVisibility() == View.VISIBLE) {
                    binding.textView77intro5.setVisibility(View.GONE);
                    binding.imageView36intro5.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro5.setVisibility(View.VISIBLE);

                    binding.imageView36intro5.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro6.getVisibility() == View.VISIBLE) {
                    binding.textView77intro6.setVisibility(View.GONE);
                    binding.imageView36intro6.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro6.setVisibility(View.VISIBLE);

                    binding.imageView36intro6.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro7.getVisibility() == View.VISIBLE) {
                    binding.textView77intro7.setVisibility(View.GONE);
                    binding.imageView36intro7.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro7.setVisibility(View.VISIBLE);

                    binding.imageView36intro7.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro8.getVisibility() == View.VISIBLE) {
                    binding.textView77intro8.setVisibility(View.GONE);
                    binding.imageView36intro8.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro8.setVisibility(View.VISIBLE);

                    binding.imageView36intro8.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77.getVisibility() == View.VISIBLE) {
                    binding.textView77.setVisibility(View.GONE);
                    binding.imageView36.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77.setVisibility(View.VISIBLE);

                    binding.imageView36.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro10.getVisibility() == View.VISIBLE) {
                    binding.textView77intro10.setVisibility(View.GONE);
                    binding.imageView36intro10.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro10.setVisibility(View.VISIBLE);

                    binding.imageView36intro10.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro11.getVisibility() == View.VISIBLE) {
                    binding.textView77intro11.setVisibility(View.GONE);
                    binding.imageView36intro11.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro11.setVisibility(View.VISIBLE);

                    binding.imageView36intro11.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro12.getVisibility() == View.VISIBLE) {
                    binding.textView77intro12.setVisibility(View.GONE);
                    binding.imageView36intro12.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro12.setVisibility(View.VISIBLE);

                    binding.imageView36intro12.setImageResource(R.drawable.ic_bottom_foreground);


                }


            }
        });
        binding.imageView36intro13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( binding.textView77intro13.getVisibility() == View.VISIBLE) {
                    binding.textView77intro13.setVisibility(View.GONE);
                    binding.imageView36intro13.setImageResource(R.drawable.ic_bottom_top_foreground);

                } else {



                    binding.textView77intro13.setVisibility(View.VISIBLE);

                    binding.imageView36intro13.setImageResource(R.drawable.ic_bottom_foreground);


                }


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