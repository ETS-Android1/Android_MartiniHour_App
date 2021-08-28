package com.app.martinihour.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.app.martinihour.R;

public class SplashScreen extends AppCompatActivity {
    public ProgressBar progressBar;
    public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // getting id of progressBar from design
        progressBar = findViewById(R.id.progressBar);
        // getting id of image
        imageView = findViewById(R.id.imageView);


        // making code for animation and start of splash screen that will run for limited time

        final Animation animShake = AnimationUtils.loadAnimation(this, android.R.anim.fade_in);
        // fade image
        animShake.setDuration(2000);
        imageView.startAnimation(animShake);
        // lambda expression
        new Handler().postDelayed(() -> {
            // start main Activity after splash screen
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            SplashScreen.this.finish();
        }, 6000);


    }
}