package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Set the content of the activity to use the song_list.xml layout file
        setContentView(R.layout.song_list);
        //Arraylist to store all the song details
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(getString(R.string.song1), getString(R.string.artist1)));
        songs.add(new Song(getString(R.string.song2), getString(R.string.artist2)));
        songs.add(new Song(getString(R.string.song3), getString(R.string.artist3)));
        songs.add(new Song(getString(R.string.song4), getString(R.string.artist4)));
        songs.add(new Song(getString(R.string.song5), getString(R.string.artist5)));
        //Custom adapter to display the arraylist in list
        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_tracks);
        ListView listView = (ListView) findViewById(R.id.list);
        //Sets the adapter
        listView.setAdapter(adapter);
        TextView textView = (TextView) findViewById(R.id.list_text_header);
        textView.setText(R.string.tracks_text);
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setBackgroundColor(getColor(R.color.category_tracks));
        button1.setText(getString(R.string.nowPlaying));
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(TracksActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setBackgroundColor(getColor(R.color.category_tracks));
        button2.setText(getString(R.string.paymentText));
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(TracksActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setBackgroundColor(getColor(R.color.category_tracks));
        button3.setText(getString(R.string.mainActivity));
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(TracksActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setBackgroundColor(getColor(R.color.category_tracks));
        button4.setText(getString(R.string.artist));
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(TracksActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });
    }
}
