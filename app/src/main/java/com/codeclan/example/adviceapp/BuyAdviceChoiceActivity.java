package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyAdviceChoiceActivity extends AppCompatActivity {
    Button buyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_choice);
        buyButton = (Button)findViewById(R.id.buy_button);
    }
    public void onBuyButtonClick(View button) {
        Intent intent = new Intent(this, BuyAnswerActivity.class);
        startActivity(intent);
    }

}
