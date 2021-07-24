package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RandomNumber extends AppCompatActivity {

    Button buttonRandomNumber;
    TextView answerRandomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_number);

        // assigns button class to XML button
        buttonRandomNumber = (Button) findViewById(R.id.button_random_number);
        // assigns textview class to XML textview
        answerRandomNumber = (TextView) findViewById(R.id.answer_random_num);

        // sets what happens when the button is pressed
        buttonRandomNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int randomNumGenerator = (random.nextInt(100)) + 1;

                String answerFinal = Integer.toString(randomNumGenerator);

                answerRandomNumber.setText(answerFinal);
            }
        });
    }
}