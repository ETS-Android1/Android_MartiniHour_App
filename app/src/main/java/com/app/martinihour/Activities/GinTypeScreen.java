package com.app.martinihour.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.martinihour.R;

public class GinTypeScreen extends AppCompatActivity {
    public Button ginClassicBtnScreen, ginModernBtnScreen, backBtnScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gin_type_screen);


        // fetching id's from the design

        ginClassicBtnScreen = findViewById(R.id.ginClassicBtn);
        ginModernBtnScreen = findViewById(R.id.ginModernBtn);
        backBtnScreen = findViewById(R.id.backBtn);

        // making click listner

        ginClassicBtnScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GinTypeScreen.this, GinClassicScreen.class));
                GinTypeScreen.this.finish();
            }
        });

        ginModernBtnScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GinTypeScreen.this, GinModernScreen.class));
                GinTypeScreen.this.finish();
            }
        });

        backBtnScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GinTypeScreen.this, MainActivity.class));
                GinTypeScreen.this.finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(GinTypeScreen.this, MainActivity.class));
        GinTypeScreen.this.finish();
    }
}