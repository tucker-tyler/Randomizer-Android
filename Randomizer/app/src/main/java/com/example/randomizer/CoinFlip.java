package com.example.randomizer;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class CoinFlip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_flip);

        // transition info from another activity(?)
//        Intent intent = getIntent();
    }

    // TODO -- add a way for the random number (either 0 or 1) to be converted to heads and tails
    // TODO -- find out how to make a separate function to make the coin flip
    public class flipMe() {
        Random rand = new Random();

//        int coin;
//        int rando;

        int coin = 1;
        int rando = rand.nextInt(coin);


    }

    // TODO -- find a way to call the flipMe function and display the answer in the textView
    public class coinFlipper extends View {
        Button button = (Button) findViewById(R.id.flip_btn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                new flipMe();
            }
        }

        public coinFlipper(Context context) {
            super(context);
        }

        public coinFlipper(Context context, @Nullable AttributeSet attrs) {
            super(context, attrs);
        }

        public coinFlipper(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
        }

        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        public coinFlipper(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
        }
    }


}