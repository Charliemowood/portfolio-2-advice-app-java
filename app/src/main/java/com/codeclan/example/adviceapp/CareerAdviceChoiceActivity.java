package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CareerAdviceChoiceActivity extends AppCompatActivity {
    Button careerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_advice_choice);
        careerButton = (Button)findViewById(R.id.career_answer_button);
    }

    public void onCareerButtonClick(View button) {
        Intent intent = new Intent(this, CareerAnswerActivity.class);
        startActivity(intent);
    }
}
