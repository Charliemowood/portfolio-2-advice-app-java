package com.codeclan.example.adviceapp;

import java.util.ArrayList;

/**
 * Created by home on 5/29/17.
 */

public class CareerAnswerProvider {

    private ArrayList<String> answers;

    public CareerAnswerProvider() {
        this.answers = new ArrayList<>();
        setupDefaultAnswers();
    }

    private void setupDefaultAnswers() {
        String[] defaultAnswers = {
                "You should pursue a career using computers.",
                "You should consider working as a gardener.",
                "You might like to work as a professional gambler."
        };
        for (String answer : defaultAnswers) {
            this.answers.add(answer);
        }
    }


    public String getAnswerAtIndex(int i) {
        return this.answers.get(i);
    }

}
