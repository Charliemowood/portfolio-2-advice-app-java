package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LauncherActivity extends AppCompatActivity {
    private Button buildButton;
    private Button marriageButton;
    private Button buyButton;
    private Button careerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        buildButton = (Button) findViewById(R.id.build_button);
        marriageButton = (Button) findViewById(R.id.marriage_button);
        buyButton = (Button) findViewById(R.id.buy_button);
        careerButton = (Button) findViewById(R.id.career_button);

    }

    public void onBuildButtonClick(View button) {
        Intent intent = new Intent(this, AdviceChoiceActivity.class);
        startActivity(intent);
    }

    public void onMarriageButtonClick(View button) {
        Intent intent = new Intent(this, MarriageAdviceChoiceActivity.class);
        startActivity(intent);
    }

    public void onBuyButtonClick(View button) {
        Intent intent = new Intent(this, BuyAdviceChoiceActivity.class);
        startActivity(intent);
    }

    public void onCareerButtonClick(View button) {
        Intent intent = new Intent(this, CareerAdviceChoiceActivity.class);
        startActivity(intent);
    }




}
