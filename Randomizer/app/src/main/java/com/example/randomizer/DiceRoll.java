package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class DiceRoll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_roll);
    }

    class rollDice {
        Random random = new Random();

        int randomRoll = random.nextInt(6);
    }
}