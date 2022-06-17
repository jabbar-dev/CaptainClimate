package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Level2Complete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_complete);
    }

    public void Logout(View view) {
        Intent intent = new Intent(Level2Complete.this, LoginActivity.class);
        startActivity(intent);
        this.finish();
    }
}