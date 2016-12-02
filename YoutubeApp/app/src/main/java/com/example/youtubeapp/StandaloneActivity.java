package com.example.youtubeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity implements
    View.OnClickListener


{


    private String Google_API_Key = "AIzaSyA4pZyj-Pa-5dHB4A9-Tk55pnEJ9du3q_s";
    private String Youtube_Video_ID = "Jbu8WT-naW4";
    private Button btnPlayVideo;
    private Button btnViewPlayList;
    private String Youtube_Playlist = "PLPrREYqN5WqahHhyx7Eg-A42TI5BHEdSW";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnPlayVideo = (Button) findViewById(R.id.btnPlayVideo);
        btnViewPlayList = (Button) findViewById(R.id.btnViewplaylist);

        btnPlayVideo.setOnClickListener(this);
        btnViewPlayList.setOnClickListener(this);



//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public void onClick(View v) {


        Intent intent = null;

        switch (v.getId()){

            case R.id.btnPlayVideo:

                intent = YouTubeStandalonePlayer.createVideoIntent(this,Google_API_Key,Youtube_Video_ID);
                break;

            case R.id.btnViewplaylist:

                intent = YouTubeStandalonePlayer.createPlaylistIntent(this,Google_API_Key,Youtube_Playlist);
                break;

        }

            startActivity(intent);

    }
}
