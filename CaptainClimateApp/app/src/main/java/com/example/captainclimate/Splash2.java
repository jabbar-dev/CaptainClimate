package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Splash2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);
        getSupportActionBar().hide();
    }

    public void btnNextS2(View view) {
        Intent intent = new Intent(Splash2.this, JabbarLevelOne.class);
        startActivity(intent);
        this.finish();
    }
}