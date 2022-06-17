package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JabbarLevelTwo1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jabbar_level_two1);
    }

    public void lvlTwoBTN(View view) {
        Intent intent = new Intent(JabbarLevelTwo1.this, JabbarLevelTwo2.class);
        startActivity(intent);
    }
}