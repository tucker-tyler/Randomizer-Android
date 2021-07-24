package com.example.randomizer;

/*
 * Makes a random number 0-3
 * Assign the number to the index of the card suit
 * Makes a random number 0-12
 * Assign the number to the index of the card number
 * Returns the number and suit to the user
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PlayingCard extends AppCompatActivity {

    Button buttonPlayingCard;
    TextView answerPlayingCardNum;
    TextView answerPlayingCardSuit;

    String[] suits = {"Spade", "Club", "Heart", "Diamond"};
    String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_card);

        // assigns button class to XML button
        buttonPlayingCard = (Button) findViewById(R.id.button_playing_card);
        // assigns textview class to XML textview
        answerPlayingCardNum = (TextView) findViewById(R.id.answer_playing_card_num);
        answerPlayingCardSuit = (TextView) findViewById(R.id.answer_playing_card_suit);

        buttonPlayingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int pickACardSuit = random.nextInt(4);
                int pickACardNum = random.nextInt(13);

                // TODO: Return the actual card to the user. Get 52 playing card icons? OR get the symbol icons and make your own XML card
                // TODO: Get an animation of a deck shuffling

                // Sets the TextViews to the index [randomNumber] of the arrays
                answerPlayingCardSuit.setText(suits[pickACardSuit]);
                answerPlayingCardNum.setText(cardNumbers[pickACardNum]);

            }
        });

    }
}