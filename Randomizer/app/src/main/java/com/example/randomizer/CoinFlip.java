package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class CoinFlip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_flip);
    }

    class getFlip {
        Random random = new Random();

        int coinFlip = random.nextInt(2);

        String flipResult;

        class convertFlip {
            if (coinFlip == 0) {
                flipResult = "Heads";
            } else {
                flipResult = "Tails";
            }
        }
    }
}