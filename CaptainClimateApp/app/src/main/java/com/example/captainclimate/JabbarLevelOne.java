package com.example.captainclimate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class JabbarLevelOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jabbar_level_one);
        YouTubePlayerView youTubePlayerView = new YouTubePlayerView(this);
        youTubePlayerView.enterFullScreen();
    }
}