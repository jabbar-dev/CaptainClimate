package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash4);
        getSupportActionBar().hide();
    }

    public void btnNextS4(View view) {
        Intent intent = new Intent(Splash4.this, Dashboard.class);
        startActivity(intent);
        this.finish();
    }
}