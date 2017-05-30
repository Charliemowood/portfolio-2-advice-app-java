package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MarriageAdviceChoiceActivity extends AppCompatActivity {
    Button marriageButtonSubmit;
    Spinner spinnerMarriage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriage_advice_choice);
        marriageButtonSubmit = (Button) findViewById(R.id.marriage_submit_button);
        spinnerMarriage = (Spinner) findViewById(R.id.marriage_spinner);
    }

    public void onMarriageButtonSubmitClick(View button) {
        MarriageAnswerProvider provider = new MarriageAnswerProvider();
        String answer = provider.getAnswerAtIndex(0);
        Intent intent = new Intent(this, MarriageAnswerActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }

}
