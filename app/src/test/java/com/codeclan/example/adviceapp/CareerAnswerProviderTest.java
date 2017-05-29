package com.codeclan.example.adviceapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 5/29/17.
 */
public class CareerAnswerProviderTest {
    @Test
    public void answerAreNotNull() {
        CareerAnswerProvider provider = new CareerAnswerProvider();
        assertNotNull(provider.getAnswers());
    }

    @Test
    public void defaultAnswer1() {
        CareerAnswerProvider provider = new CareerAnswerProvider();
        assertEquals("You should pursue a career using computers.", provider.getAnswerAtIndex(0));
    }

    @Test
    public void defaultAnswer2() {
        CareerAnswerProvider provider = new CareerAnswerProvider();
        assertEquals("You should consider working as a gardener.", provider.getAnswerAtIndex(1));
    }

    @Test
    public void defaultAnswer3() {
        CareerAnswerProvider provider = new CareerAnswerProvider();
        assertEquals("You might like to work as a professional gambler.", provider.getAnswerAtIndex(2));
    }


}