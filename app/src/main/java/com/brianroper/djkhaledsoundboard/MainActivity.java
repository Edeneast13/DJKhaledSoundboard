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
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView1;
    private MediaPlayer mPlayer;

    public void buttonClicked(View v){

        int buttonId = v.getId();

        /*if(mPlayer.isPlaying()){

            mPlayer.stop();
        }*/

        if(buttonId == R.id.ciroc1){

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);

            if(mPlayer.isPlaying()) {

                mPlayer.stop();
                mPlayer.reset();
            }
            else {

                mPlayer.start();
                Log.i("Id", buttonId + "");
            }
        }

        else if(buttonId == R.id.ciroc2){

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
            mPlayer.start();
            Log.i("Id", buttonId + "");
        }

        else if(buttonId == R.id.ciroc3){

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
            mPlayer.start();
            Log.i("Id", buttonId + "");
        }

        else if(buttonId == R.id.ciroc4){

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
            mPlayer.start();
            Log.i("Id", buttonId + "");
        }

        else if(buttonId == R.id.ciroc5){

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
            mPlayer.start();
            Log.i("Id", buttonId + "");
        }

        else if(buttonId == R.id.ciroc6){

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
            mPlayer.start();
            Log.i("Id", buttonId + "");
        }

        else if(buttonId == R.id.ciroc7){

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
            mPlayer.start();
            Log.i("Id", buttonId + "");
        }

        else if(buttonId == R.id.ciroc8){

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
            mPlayer.start();
            Log.i("Id", buttonId + "");
        }
        else{

            mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.song);
            mPlayer.start();
            Log.i("Id", buttonId + "");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mImageView1 = (ImageView)findViewById(R.id.ciroc1);
    }
}
