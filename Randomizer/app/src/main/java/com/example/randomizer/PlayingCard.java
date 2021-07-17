package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class PlayingCard extends AppCompatActivity {

    Button buttonPlayingCard;
    TextView answerPlayingCard;

    String[] suits = {"Spade", "Club", "Heart", "Diamond"};
    String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_card);

        // assigns button class to XML button
        buttonPlayingCard = (Button) findViewById(R.id.button_dice_roll);
        // assigns textview class to XML textview
        answerPlayingCard = (TextView) findViewById(R.id.answer_dice_roll);

        buttonPlayingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int pickACardNum = random.nextInt(12);
                int pickACardSuit = random.nextInt(3);

                switch (pickACardSuit) {
                    case 0:
                        answerPlayingCard.setText(R.string.suit_spade);
                        break;
                    case 1:
                        answerPlayingCard.setText(R.string.suit_club);
                        break;
                    case 2:
                        answerPlayingCard.setText(R.string.suit_heart);
                        break;
                    case 3:
                        answerPlayingCard.setText(R.string.suit_diamond);
                        break;
                }

                switch (pickACardNum) {
                    case 0:
                        answerPlayingCard.setText(R.string.dice_roll_1);
                        break;
                    case 1:
                        answerPlayingCard.setText(R.string.dice_roll_2);
                        break;
                    case 2:
                        answerPlayingCard.setText(R.string.dice_roll_3);
                        break;
                    case 3:
                        answerPlayingCard.setText(R.string.dice_roll_4);
                        break;
                    case 4:
                        answerPlayingCard.setText(R.string.dice_roll_5);
                        break;
                    case 5:
                        answerPlayingCard.setText(R.string.dice_roll_6);
                        break;
                }
            }
        });

    }
}