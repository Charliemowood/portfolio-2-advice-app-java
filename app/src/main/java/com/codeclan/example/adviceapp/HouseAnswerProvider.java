package com.codeclan.example.adviceapp;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by home on 5/28/17.
 */

public class HouseAnswerProvider {
    private ArrayList<String> answers;

    public HouseAnswerProvider() {
        this.answers = new ArrayList<>();
        setupDefaultAnswers();
    }

    private void setupDefaultAnswers() {
        String[] defaultAnswers = {
                "You should build a house with earth bags.",
                "You should build a house made of wood.",
                "You should build a house made of bricks."
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

    public String getAnswer() {
        Random rand = new Random();
        int index = rand.nextInt(getNumberOfAnswers());
        return getAnswerAtIndex(index);
    }
}
