package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LevelOneComplete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one_complete);
    }

    public void goClick(View view) {
        Intent intent = new Intent(LevelOneComplete.this, JabbarLevelTwo1.class);
        startActivity(intent);
    }
}