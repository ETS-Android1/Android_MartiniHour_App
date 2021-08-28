package com.app.martinihour.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.martinihour.R;

public class VodkaTypeScreen extends AppCompatActivity {
    public Button vodkaClassicBtn, vodkaModernBtn, backBtnScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vodka_type_screen);
        // fetching id's from design
        vodkaClassicBtn = findViewById(R.id.vodkaClassicBtn);
        vodkaModernBtn = findViewById(R.id.vodkaModernBtn);
        backBtnScreen = findViewById(R.id.backBtn);

        // making click listener for button
        vodkaClassicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VodkaTypeScreen.this, VodkaClassicScreen.class));
                VodkaTypeScreen.this.finish();
            }
        });
        vodkaModernBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VodkaTypeScreen.this, VodkaModernScreen.class));
                VodkaTypeScreen.this.finish();
            }
        });

        backBtnScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VodkaTypeScreen.this, MainActivity.class));
                VodkaTypeScreen.this.finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(VodkaTypeScreen.this, MainActivity.class));
        VodkaTypeScreen.this.finish();

    }
}