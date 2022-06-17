package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class JabbarLevel2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jabbar_level2);
    }


    public void completeLevel(View view) {
        Intent intent = new Intent(JabbarLevel2.this, LevelOneComplete.class);
        startActivity(intent);
    }
}