package com.example.randomizer;

/*
 * Makes a random number 0-1
 * Uses a conditional to make 0 = heads and 1 = tails
 * Returns 'heads' or 'tails' to the user
 */

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class CoinFlip extends AppCompatActivity {

    Button buttonFlipCoin;
    TextView answerCoinFlip;
    ImageView imageViewCoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // creates instance
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_flip);

        // assigns button class to XML button
        buttonFlipCoin = (Button) findViewById(R.id.button_coin_flip);
        // assigns textview class to XML textview
        answerCoinFlip = (TextView) findViewById(R.id.answer_coin_flip);

        imageViewCoin = (ImageView) findViewById(R.id.imageview_coin);

        // sets what happens when the button is pressed
        buttonFlipCoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int coinFlip = random.nextInt(2);

                if (coinFlip == 0) {
                    answerCoinFlip.setText(R.string.coin_flip_heads);
                    imageViewCoin.setImageResource(R.drawable.heads);
                } else if (coinFlip == 1){
                    answerCoinFlip.setText(R.string.coin_flip_tails);
                    imageViewCoin.setImageResource(R.drawable.tails);
                } else {
                    answerCoinFlip.setText(R.string.coin_flip_error);
                }
            }
        });
    }
}