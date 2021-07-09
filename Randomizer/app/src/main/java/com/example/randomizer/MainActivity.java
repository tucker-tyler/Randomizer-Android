package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void coinFlipOpener(View view) {
        Intent intent = new Intent(this, CoinFlip.class);
        startActivity(intent);
    }

    public void diceRollOpener(View view) {
        Intent intent = new Intent(this, DiceRoll.class);
        startActivity(intent);
    }

    public void randomNumberOpener(View view) {
        Intent intent = new Intent(this, RandomNumber.class);
        startActivity(intent);
    }

    public void playingCardOpener(View view) {
        Intent intent = new Intent(this, PlayingCard.class);
        startActivity(intent);
    }
}