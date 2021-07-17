package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class DiceRoll extends AppCompatActivity {

    Button buttonDiceRoll;
    TextView answerDiceRoll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roll);

        // assigns button class to XML button
        buttonDiceRoll = (Button) findViewById(R.id.button_dice_roll);
        // assigns textview class to XML textview
        answerDiceRoll = (TextView) findViewById(R.id.answer_dice_roll);

        buttonDiceRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int diceRoll = random.nextInt(5);

                switch (diceRoll) {
                    case 0:
                        answerDiceRoll.setText(R.string.dice_roll_1);
                        break;
                    case 1:
                        answerDiceRoll.setText(R.string.dice_roll_2);
                        break;
                    case 2:
                        answerDiceRoll.setText(R.string.dice_roll_3);
                        break;
                    case 3:
                        answerDiceRoll.setText(R.string.dice_roll_4);
                        break;
                    case 4:
                        answerDiceRoll.setText(R.string.dice_roll_5);
                        break;
                    case 5:
                        answerDiceRoll.setText(R.string.dice_roll_6);
                        break;
                }
            }
        });
    }
}