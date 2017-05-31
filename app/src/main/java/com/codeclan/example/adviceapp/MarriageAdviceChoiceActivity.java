package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Objects;

public class MarriageAdviceChoiceActivity extends AppCompatActivity {
    private Button marriageButtonSubmit;
    private Spinner spinnerMarriage;
    private MarriageAnswerProvider provider = new MarriageAnswerProvider();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriage_advice_choice);
        marriageButtonSubmit = (Button) findViewById(R.id.marriage_submit_button);
        spinnerMarriage = (Spinner) findViewById(R.id.marriage_spinner);
    }

    public void onMarriageButtonSubmitClick(View button) {
        String number = spinnerMarriage.getSelectedItem().toString();
        if (Objects.equals(number, "5")) {
            String answer = provider.getAnswerAtIndex(0);
            intentMethod(answer);
        } else if (Objects.equals(number, "4")){
            String answer = provider.getAnswerAtIndex(1);
            intentMethod(answer);
        } else {
            String answer = provider.getAnswerAtIndex(2);
            intentMethod(answer);
        }


    }

    private void intentMethod(String answer) {
        Intent intent = new Intent(this, MarriageAnswerActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }

}
