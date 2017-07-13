package com.appbusters.robinkamboj.androidtesting;

import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.TypeTextAction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MyInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickOneButton_opensOneActivity() throws Exception{
        onView(withId(R.id.one)).perform(click());
        onView(withId(R.id.type_text)).perform(typeText("ROBILLO")).perform(closeSoftKeyboard());
        onView(withId(R.id.visible_one_activity)).perform(click());
        onView(withId(R.id.one)).check(matches(isDisplayed()));
    }

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule1 = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickTwoButton_opensRvTestDataActivity() throws Exception{
        onView(withId(R.id.two)).perform(click());
    }
}
