package com.codeclan.example.adviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LauncherActivity extends AppCompatActivity {
    private Button buildButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        buildButton = (Button) findViewById(R.id.build_button);
    }

    public void onBuildButtonClick(View button) {
        Intent intent = new Intent(this, AdviceChoiceActivity.class);
        startActivity(intent);
    }
}
