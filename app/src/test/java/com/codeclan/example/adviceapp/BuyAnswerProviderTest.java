package com.codeclan.example.adviceapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 5/29/17.
 */
public class BuyAnswerProviderTest {


    @Test
    public void defaultAnswer1() {
        BuyAnswerProvider provider = new BuyAnswerProvider();
        assertEquals("Buy it now, you need it and you deserve it.", provider.getAnswerAtIndex(0));
    }

    @Test
    public void defaultAnswer2() {
        BuyAnswerProvider provider = new BuyAnswerProvider();
        assertEquals("You can buy that if you still want it in a month.", provider.getAnswerAtIndex(1));
    }

    @Test
    public void defaultAnswer3() {
        BuyAnswerProvider provider = new BuyAnswerProvider();
        assertEquals("No, you are not buying that, no way Pedro! Put the wallet down.", provider.getAnswerAtIndex(2));
    }

}