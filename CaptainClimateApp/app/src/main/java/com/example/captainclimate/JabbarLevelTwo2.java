package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JabbarLevelTwo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jabbar_level_two2);
    }

    public void completeLevel2(View view) {
        Intent intent = new Intent(JabbarLevelTwo2.this, Level2Complete.class);
        startActivity(intent);
    }
}