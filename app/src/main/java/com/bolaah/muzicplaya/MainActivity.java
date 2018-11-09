package com.bolaah.muzicplaya;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private MusicService musicSrv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Song List when Title is selected
        TextView songTitleList = (TextView) findViewById(R.id.title);

        // Set a click listener on that View
        songTitleList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, SongList.class);
                startActivity(songIntent);
            }
        });

        // Find the View that shows the Song List when Artist is selected
        TextView songArtistList = (TextView) findViewById(R.id.artist);

        // Set a click listener on that View
        songArtistList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, SongList.class);
                startActivity(songIntent);
            }
        });

        // Find the View that shows the Song List when Album is selected
        TextView songAlbumList = (TextView) findViewById(R.id.album);

        // Set a click listener on that View
        songAlbumList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, SongList.class);
                startActivity(songIntent);
            }
        });

        // Find the View that shows the Song List when Album is selected
        ImageView songList = (ImageView) findViewById(R.id.playlist);

        // Set a click listener on that View
        songList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, SongList.class);
                startActivity(songIntent);
            }
        });

    }

    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
