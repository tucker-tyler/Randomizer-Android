package com.example.randomizer;

/*
 * Makes a random number 1-6
 * Returns the random number to the user
 */

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DiceRoll extends AppCompatActivity {

    Button buttonDiceRoll;
    TextView answerDiceRoll;
    ImageView imageDiceRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roll);

        // assigns button class to XML button
        buttonDiceRoll = (Button) findViewById(R.id.button_dice_roll);
        // assigns textview class to XML textview
        answerDiceRoll = (TextView) findViewById(R.id.answer_dice_roll);

        imageDiceRoll = (ImageView) findViewById(R.id.imageview_dice);

        buttonDiceRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int diceRoll = (random.nextInt(6)) + 1;

                // TODO: Get icons for each die side and return that instead
                // TODO: Find a dice roll animation and put it in

                switch (diceRoll) {
                    case 1:
                        answerDiceRoll.setText(R.string.dice_roll_1);
                        imageDiceRoll.setImageResource(R.drawable.dice_1_light);
                        break;
                    case 2:
                        answerDiceRoll.setText(R.string.dice_roll_2);
                        imageDiceRoll.setImageResource(R.drawable.dice_2_light);
                        break;
                    case 3:
                        answerDiceRoll.setText(R.string.dice_roll_3);
                        imageDiceRoll.setImageResource(R.drawable.dice_3_light);
                        break;
                    case 4:
                        answerDiceRoll.setText(R.string.dice_roll_4);
                        imageDiceRoll.setImageResource(R.drawable.dice_4_light);
                        break;
                    case 5:
                        answerDiceRoll.setText(R.string.dice_roll_5);
                        imageDiceRoll.setImageResource(R.drawable.dice_5_light);
                        break;
                    case 6:
                        answerDiceRoll.setText(R.string.dice_roll_6);
                        imageDiceRoll.setImageResource(R.drawable.dice_6_light);
                        break;
                }
            }
        });
    }
}