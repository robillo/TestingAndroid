package com.appbusters.robinkamboj.androidtesting;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {

    private final String ASSERTION_ERROR = "TEST FAILED";

    @Test
    public void isAdditionCorrect() {
        assertEquals(ASSERTION_ERROR, 4, 2 + 2);
    }

    @Test
    public void isAdditionCorrectIntentionalFail() {
        assertEquals(ASSERTION_ERROR, 4, 3 + 2);
    }
}