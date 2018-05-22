package com.example.therussells.scoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int madridScore = 0;
    int liverpoolScore = 0;
    int scoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Increase the score for Real Madrid by 1 point when goal scored.
     */
    public void addOneForRealGoal(View view) {
        madridScore= madridScore + 1;
        displayForRealMadrid(madridScore);
        Toast.makeText(MainActivity.this, "Hala Madrid!..Gooooal!!!", Toast.LENGTH_SHORT).show();


    }


    /**
     * Increase the score for Real Madrid by 1 point if penalty scored.
     */
    public void addOneForRealPenalty(View view) {
        madridScore = madridScore + 1;
        displayForRealMadrid(madridScore);
        Toast.makeText(MainActivity.this, "Hala Madrid!..Gooooal!!!", Toast.LENGTH_SHORT).show();
    }


    /**
     * Increase the score for Liverpool by 1 point when goal scored.
     */
    public void addOneForLivGoal(View view) {
        liverpoolScore = liverpoolScore + 1;
        displayForLiverpool(liverpoolScore);
        Toast.makeText(MainActivity.this, "Gooooaaaal!", Toast.LENGTH_SHORT).show();

    }


    /**
     * Increase the score for Liverpool by 1 point if penalty scored.
     */
    public void addOneForLivPenalty(View view) {
        liverpoolScore = liverpoolScore + 1;
        displayForLiverpool(liverpoolScore);
        Toast.makeText(MainActivity.this, "Gooooaaaal!", Toast.LENGTH_SHORT).show();

    }


    /**
     * Displays the score for Real Madrid.
     */
    public void displayForRealMadrid(int madridScore) {
        TextView scoreView = (TextView) findViewById(R.id.madrid_score);
        scoreView.setText( String.valueOf(madridScore));
    }

    /**
     * Displays the score for Liverpool.
     */
    public void displayForLiverpool(int liverpoolScore) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_score);
        scoreView.setText( String.valueOf( liverpoolScore));
    }

    /** Match Replay
     *
      * @param view
     */
    public void ResetScore(View view) {
        madridScore = 0;
        liverpoolScore = 0;
        displayForRealMadrid(madridScore);
        displayForLiverpool(liverpoolScore);
        Toast.makeText(MainActivity.this, "Replay!", Toast.LENGTH_SHORT).show();

 }

 }


