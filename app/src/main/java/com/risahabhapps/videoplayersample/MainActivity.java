package com.risahabhapps.videoplayersample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.potyvideo.library.AndExoPlayerView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndExoPlayerView andExoPlayerView = findViewById(R.id.andExoPlayerView);
        andExoPlayerView.setSource("https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");
    }
}
