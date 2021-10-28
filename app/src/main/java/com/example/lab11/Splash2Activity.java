package com.example.lab11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Splash2Activity extends AppCompatActivity{

    private ImageView imageView;
    private ProgressBar progressBar;
    private ConstraintLayout layout;

    private static final int SPLASH_DURATION = 2500;

    @Override protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState); setContentView(R.layout.splashscreen);

        progressBar = findViewById(R.id.progressBar);

        layout = findViewById(R.id.splashLayout);
    }

    private void initFunctionality()
    {
        layout.postDelayed(new Runnable()
    {
        @Override public void run()
            { progressBar.setVisibility(View.GONE);
                Intent intent = new Intent(Splash2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        }, SPLASH_DURATION);
    }
    @Override protected void onResume()
    {
        super.onResume();
        initFunctionality();
    }
}
