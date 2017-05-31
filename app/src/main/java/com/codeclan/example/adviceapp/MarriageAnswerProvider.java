package com.codeclan.example.adviceapp;

import java.util.ArrayList;

/**
 * Created by home on 5/29/17.
 */

public class MarriageAnswerProvider {

    private ArrayList<String> answers;

    public MarriageAnswerProvider() {
        this.answers = new ArrayList<>();
        setupDefaultAnswers();
    }

    private void setupDefaultAnswers() {
        String[] defaultAnswers = {
                "Yep, definitely get married!",
                "You need to spend more time on this decision.",
                "Sorry, this is not the right time to get married."
        };
        for (String answer : defaultAnswers) {
            this.answers.add(answer);
        }
    }


    public String getAnswerAtIndex(int i) {
        return this.answers.get(i);
    }


}
