package com.dg.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupListeners();
    }

    private void setupListeners() {
        findViewById(R.id.spotify_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This will launch my Spotify app", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.scores_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This will launch my Scores app", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.library_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This will launch my Library app", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.build_bigger_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This will launch my Build Bigger app", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.xyz_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This will launch my XYZ Reader app", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.capstone_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This will launch my Capstone Project app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
