package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash3);
        getSupportActionBar().hide();
    }
    public void btnNextS3(View view) {
        Intent intent = new Intent(Splash3.this, Splash4.class);
        startActivity(intent);
        this.finish();
    }
}