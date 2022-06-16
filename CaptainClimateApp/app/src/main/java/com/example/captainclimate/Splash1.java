package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash1);
        getSupportActionBar().hide();

    }

    public void nextS1(View view) {
        Intent intent = new Intent(Splash1.this, Splash2.class);
        startActivity(intent);
        this.finish();
    }
}