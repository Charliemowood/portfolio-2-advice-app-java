package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Objects;

public class AdviceChoiceActivity extends AppCompatActivity {
    private Button houseButton;
    private HouseAnswerProvider answers;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice_choice);
        houseButton = (Button) findViewById(R.id.house_button);
        spinner = (Spinner) findViewById(R.id.house_spinner);
    }

    public void onHouseButtonClicked(View button) {
        Log.d(getClass().toString(), "Shake button was clicked");
        HouseAnswerProvider houseAnswerProvider = new HouseAnswerProvider();
        String text = spinner.getSelectedItem().toString();
        if (Objects.equals(text, "I like to be at one with nature.")) {
            String answer = houseAnswerProvider.getAnswerAtIndex(0);
            getAnswerOpenIntent(answer);
        } else if (Objects.equals(text, "I am not afraid of fires.")) {
            String answer = houseAnswerProvider.getAnswerAtIndex(1);
            getAnswerOpenIntent(answer);
        } else {
            String answer = houseAnswerProvider.getAnswerAtIndex(2);
            getAnswerOpenIntent(answer);
        }

    }

    private void getAnswerOpenIntent(String answer) {
        Intent intent = new Intent(this, AnswerActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }
}
