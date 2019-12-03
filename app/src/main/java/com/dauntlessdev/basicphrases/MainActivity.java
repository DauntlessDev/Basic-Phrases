package com.dauntlessdev.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public void playIt(View view){
        Button bview = (Button) view;
        MediaPlayer mp  = MediaPlayer.create(this, getResources().getIdentifier((bview.getTag().toString()), "raw", getPackageName()));
        mp.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
