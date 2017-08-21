package com.example.android.muscialstrcuture;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     TextView play=(TextView)findViewById(R.id.playlist);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x= new Intent(MainActivity.this, Playlist.class);
                startActivity(x);
            }
        });
        TextView artist=(TextView)findViewById(R.id.artists);
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y= new Intent(MainActivity.this, Artists.class);
                startActivity(y);
            }
        });
        TextView recent=(TextView)findViewById(R.id.recent);
        recent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z= new Intent(MainActivity.this, Recent.class);
                startActivity(z);
            }
        });
        TextView album=(TextView)findViewById(R.id.album);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z= new Intent(MainActivity.this, Recent.class);
                startActivity(z);
            }
        });
        final ImageView start=(ImageView)findViewById(R.id.change_Image);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start.setImageResource(R.drawable.pause);
            }
        });
    }
}


