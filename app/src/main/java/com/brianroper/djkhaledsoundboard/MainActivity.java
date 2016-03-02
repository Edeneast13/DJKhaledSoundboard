package com.brianroper.djkhaledsoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView1;
    private MediaPlayer mPlayer;
    private Button mPlaybackButton;

    public void buttonClicked(View v){

        int buttonId = v.getId(); //get which button was pressed

        if (mPlayer != null) {
            checkIfAlreadyPlaying(); // see if sound is already playing
        }

        switch (buttonId) { //Switch case for choosing correct music based on button press

            case R.id.ciroc1: {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.accurate);
            } break;

            case R.id.ciroc2: {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anotheronecut);
            } break;

            case R.id.ciroc3: {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.blessup);
            } break;

            case R.id.ciroc4: {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.breakfast);
            } break;

            case R.id.ciroc5: {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.changedalot);
            } break;

            case R.id.ciroc6: {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cirocboi);
            } break;

            case R.id.ciroc7: {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.jewlery);
            } break;

            case R.id.ciroc8: {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lion);
            } break;

            case R.id.ciroc9: {
                mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.playyourself);
            } break;
        }
        playMusic();
    }

    public void checkIfAlreadyPlaying() {
        if(mPlayer.isPlaying()) {
            stopMusic();
        }
    }

    public void stopMusic() {
        mPlayer.release();
    }

    public void playMusic() {

            mPlaybackButton.setText("Pause");
            mPlaybackButton.setVisibility(View.VISIBLE);
            mPlayer.start();

           // long currentTime = System.currentTimeMillis();
           // int lengthmPlayer.getDuration();
    }

    public void pausePlayback(View v){ //pause/play button

        mPlaybackButton.setText("Pause");

        if(mPlayer.isPlaying()){

            mPlaybackButton.setText("Play");
            mPlayer.pause();
        }
        else{

            mPlaybackButton.setText("Pause");
            mPlayer.start();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mImageView1 = (ImageView)findViewById(R.id.ciroc1);
        mPlaybackButton = (Button)findViewById(R.id.playback_button);
    }
}
