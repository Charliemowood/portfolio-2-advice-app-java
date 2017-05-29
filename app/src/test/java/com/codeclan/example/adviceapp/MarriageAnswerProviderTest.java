package com.codeclan.example.adviceapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 5/29/17.
 */
public class MarriageAnswerProviderTest {

    @Test
    public void answerAreNotNull() {
        MarriageAnswerProvider provider = new MarriageAnswerProvider();
        assertNotNull(provider.getAnswers());
    }

    @Test
    public void defaultAnswer1() {
        MarriageAnswerProvider provider = new MarriageAnswerProvider();
        assertEquals("Yep, definitely get married!", provider.getAnswerAtIndex(0));
    }

    @Test
    public void defaultAnswer2() {
        MarriageAnswerProvider provider = new MarriageAnswerProvider();
        assertEquals("You need time time to make sure you are sure.", provider.getAnswerAtIndex(1));
    }

    @Test
    public void defaultAnswer3() {
        MarriageAnswerProvider provider = new MarriageAnswerProvider();
        assertEquals("Sorry, this is not the right time to get married.", provider.getAnswerAtIndex(2));
    }





}