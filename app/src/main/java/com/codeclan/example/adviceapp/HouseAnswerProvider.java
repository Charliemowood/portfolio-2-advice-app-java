package com.codeclan.example.adviceapp;

import java.util.ArrayList;

/**
 * Created by home on 5/28/17.
 */

public class HouseAnswerProvider {
    private ArrayList<String> answers;

    public HouseAnswerProvider() {
        this.answers = new ArrayList<>();
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<>(this.answers);
    }
}
