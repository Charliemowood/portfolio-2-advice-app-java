package com.codeclan.example.adviceapp;

import java.util.ArrayList;

/**
 * Created by home on 5/29/17.
 */

public class BuyAnswerProvider {
    private ArrayList<String> answers;

    public BuyAnswerProvider() {
        this.answers = new ArrayList<>();
        setupDefaultAnswers();
    }

    private void setupDefaultAnswers() {
        String[] defaultAnswers = {
                "Buy it now, you need it and you deserve it.",
                "You can buy that if you still want it in a month.",
                "No, you are not buying that, no way Pedro! Put the wallet down."
        };
        for (String answer : defaultAnswers) {
            this.answers.add(answer);
        }
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<>(this.answers);

    }

    public int getNumberOfAnswers() {
        return this.answers.size();
    }

    public void add(String answer) {
        this.answers.add(answer);
    }

    public String getAnswerAtIndex(int i) {
        return this.answers.get(i);
    }
}
