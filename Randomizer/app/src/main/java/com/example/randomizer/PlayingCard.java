package com.example.randomizer;

/*
 * Makes a random number 0-3
 * Assign the number to the index of the card suit
 * Makes a random number 0-12
 * Assign the number to the index of the card number
 * Returns the number and suit to the user
 */

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class PlayingCard extends AppCompatActivity {

    Button buttonPlayingCard;
    TextView answerPlayingCardNum;
    TextView answerPlayingCardSuit;

    ImageView imageCardNumber;
    ImageView imageCardSuit;

    String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};
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

        // assign to imageview XML
        imageCardSuit = (ImageView) findViewById(R.id.img_card_suit);
        imageCardNumber = (ImageView) findViewById(R.id.img_card_number);

        buttonPlayingCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int pickACardSuit = random.nextInt(4);
                int pickACardNum = random.nextInt(13);

                // TODO: Return the actual card to the user. Get 52 playing card icons? OR get the symbol icons and make your own XML card
                // TODO: Get an animation of a deck shuffling -- or at least an animation of the cards changing?

                // Sets the TextViews to the index [randomNumber] of the arrays
                answerPlayingCardSuit.setText(suits[pickACardSuit]);

                // switch statement to change suit image
                switch(pickACardSuit) {
                    case 0:
                        imageCardSuit.setImageResource(R.drawable.spades);
                        break;
                    case 1:
                        imageCardSuit.setImageResource(R.drawable.clubs);
                        break;
                    case 2:
                        imageCardSuit.setImageResource(R.drawable.hearts);
                        break;
                    case 3:
                        imageCardSuit.setImageResource(R.drawable.diamonds);
                        break;
                    default:
                        imageCardSuit.setImageResource(R.drawable.playing_cards);
                        break;
                }

                answerPlayingCardNum.setText(cardNumbers[pickACardNum]);

                // switch statement to change number image
                switch(pickACardNum) {
                    case 0:
                        imageCardNumber.setImageResource(R.drawable.two);
                        break;
                    case 1:
                        imageCardNumber.setImageResource(R.drawable.three);
                        break;
                    case 2:
                        imageCardNumber.setImageResource(R.drawable.four);
                        break;
                    case 3:
                        imageCardNumber.setImageResource(R.drawable.five);
                        break;
                    case 4:
                        imageCardNumber.setImageResource(R.drawable.six);
                        break;
                    case 5:
                        imageCardNumber.setImageResource(R.drawable.seven);
                        break;
                    case 6:
                        imageCardNumber.setImageResource(R.drawable.eight);
                        break;
                    case 7:
                        imageCardNumber.setImageResource(R.drawable.nine);
                        break;
                    case 8:
                        imageCardNumber.setImageResource(R.drawable.ten);
                        break;
                    case 9:
                        imageCardNumber.setImageResource(R.drawable.jack);
                        break;
                    case 10:
                        imageCardNumber.setImageResource(R.drawable.queen);
                        break;
                    case 11:
                        imageCardNumber.setImageResource(R.drawable.king);
                        break;
                    case 12:
                        imageCardNumber.setImageResource(R.drawable.ace_of_clubs__1_);
                        break;
                    default:
                        imageCardNumber.setImageResource(R.drawable.playing_cards);
                        break;
                }
            }
        });

    }
}