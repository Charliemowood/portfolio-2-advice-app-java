package com.codeclan.example.adviceapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 5/28/17.
 */
public class HouseAnswerProviderTest {

    @Test
    public void defaultAnswer1() {
        HouseAnswerProvider provider = new HouseAnswerProvider();
        assertEquals("You should build a house with earth bags.", provider.getAnswerAtIndex(0));
    }

    @Test
    public void defaultAnswer2() {
        HouseAnswerProvider provider = new HouseAnswerProvider();
        assertEquals("You should build a house made of wood.", provider.getAnswerAtIndex(1));
    }

    @Test
    public void defaultAnswer3() {
        HouseAnswerProvider provider = new HouseAnswerProvider();
        assertEquals("You should build a house made of bricks.", provider.getAnswerAtIndex(2));
    }


}