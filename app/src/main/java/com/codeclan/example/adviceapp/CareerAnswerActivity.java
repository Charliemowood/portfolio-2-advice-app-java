package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CareerAnswerActivity extends AppCompatActivity {
    private TextView answerText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_answer);
        answerText = (TextView)findViewById(R.id.career_answer_textview);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("answer");

        answerText.setText(answer);
    }
}
