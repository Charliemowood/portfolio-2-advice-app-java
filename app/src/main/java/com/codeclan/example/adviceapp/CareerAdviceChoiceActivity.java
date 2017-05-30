package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Objects;

public class CareerAdviceChoiceActivity extends AppCompatActivity {
    Button careerButton;
    Spinner careerSpinner;
    CareerAnswerProvider provider = new CareerAnswerProvider();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_advice_choice);
        careerButton = (Button)findViewById(R.id.career_answer_button);
        careerSpinner = (Spinner)findViewById(R.id.spinner_buy);
    }

    public void onCareerButtonClick(View button) {
        String text = careerSpinner.getSelectedItem().toString();
        if (Objects.equals(text, "I like to be at one with nature.")) {
            String answer = provider.getAnswerAtIndex(0);
            getAnswerOpenIntent(answer);
        } else if (Objects.equals(text, "I am not afraid of fires.")) {
            String answer = provider.getAnswerAtIndex(1);
            getAnswerOpenIntent(answer);
        } else {
            String answer = provider.getAnswerAtIndex(2);
            getAnswerOpenIntent(answer);
        }
    }

    private void getAnswerOpenIntent(String answer) {
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }
}
