package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class JabbarLevelOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jabbar_level_one);
        YouTubePlayerView youTubePlayerView = new YouTubePlayerView(this);
//        youTubePlayerView.enterFullScreen();
    }

    public void lvlOneBTN(View view) {
        Intent intent = new Intent(JabbarLevelOne.this, JabbarLevel2.class);
        startActivity(intent);
    }
}