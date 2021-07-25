package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        setupHyperlink();
    }
    private void setupHyperlink() {
        TextView iconLink = findViewById(R.id.credits_icons);
        iconLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView githubLink = findViewById(R.id.credits_github);
        githubLink.setMovementMethod(LinkMovementMethod.getInstance());
    }
}