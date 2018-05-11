package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        Button button1 = (Button) findViewById(R.id.now_playing_button1);
        button1.setBackgroundColor(getColor(R.color.category_now_playing));
        button1.setText(getString(R.string.track));
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tracksIntent = new Intent(NowPlayingActivity.this, TracksActivity.class);
                startActivity(tracksIntent);
            }
        });
        Button button2 = (Button) findViewById(R.id.now_playing_button2);
        button2.setBackgroundColor(getColor(R.color.category_now_playing));
        button2.setText(getString(R.string.mainActivity));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        Button button3 = (Button) findViewById(R.id.now_playing_button3);
        button3.setBackgroundColor(getColor(R.color.category_now_playing));
        button3.setText(getString(R.string.paymentText));
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(NowPlayingActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
        Button button4 = (Button) findViewById(R.id.now_playing_button4);
        button4.setBackgroundColor(getColor(R.color.category_now_playing));
        button4.setText(getString(R.string.artist));
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(NowPlayingActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });
    }
}
