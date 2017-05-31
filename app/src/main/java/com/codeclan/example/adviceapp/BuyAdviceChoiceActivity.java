package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Objects;

public class BuyAdviceChoiceActivity extends AppCompatActivity {
    private Button buyButton;
    private Spinner buySpinner;
    private BuyAnswerProvider provider = new BuyAnswerProvider();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_choice);
        buyButton = (Button)findViewById(R.id.buy_button);
        buySpinner =(Spinner)findViewById(R.id.buy_spinner_input);
    }
    public void onBuyButtonClick(View button) {
        String number = buySpinner.getSelectedItem().toString();
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
        Intent intent = new Intent(this, BuyAnswerActivity.class);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }

}
