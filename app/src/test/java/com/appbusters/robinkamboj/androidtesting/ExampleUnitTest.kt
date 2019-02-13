package com.appbusters.robinkamboj.androidtesting

import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {

    private val ASSERTION_ERROR = "TEST FAILED"

    @Test
    fun isAdditionCorrect() {
        assertEquals(ASSERTION_ERROR, 4, (2 + 2).toLong())
    }

    @Test
    fun isAdditionCorrectIntentionalFail() {
        assertEquals(ASSERTION_ERROR, 4, (3 + 2).toLong())
    }
}