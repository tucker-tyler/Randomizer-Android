package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;

public class PlayingCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_card);

        allCards getCard = new allCards();
    }

    static class allCards {

        // all of the card numbers and suits are put into an array
        String[] cardNum = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cardSuit = {"Clubs", "Hearts", "Diamonds", "Spades"};

        // random number between
        Random rand = new Random();
//        Random randomSuit = new Random();

        int randomNumInt = rand.nextInt(13);
        int randomSuitInt = rand.nextInt(4);

        String finalNum = cardNum[randomNumInt];
        String finalSuit = cardSuit[randomSuitInt];

        return finalNum + " of " + finalSuit;
    }
}