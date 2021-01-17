package com.example.soundabspiel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();


        //Songs einfügen mit name singer und song
        arrayList.add(new Music("Sound 1","1",R.raw.sound1));
        arrayList.add(new Music("Sound 2","2",R.raw.sound4));

        adapter = new CustomMusicAdapter(this,R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);

    }
}