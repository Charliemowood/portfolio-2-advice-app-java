package com.codeclan.example.adviceapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 5/28/17.
 */
public class HouseAnswerProviderTest {

    @Test
    public void answerAreNotNull() {
        HouseAnswerProvider provider = new HouseAnswerProvider();
        assertNotNull(provider.getAnswers());
    }


}