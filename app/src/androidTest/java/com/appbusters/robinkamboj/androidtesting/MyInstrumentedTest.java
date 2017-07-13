package com.appbusters.robinkamboj.androidtesting;

import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.TypeTextAction;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

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

    @Test
    public void clickTwoButton_opensRvTestDataActivity() throws Exception{
        onView(withId(R.id.two)).perform(click());
        onView(withId(R.id.recycler)).perform(RecyclerViewActions.scrollToPosition(5)).check(matches(hasDescendant(withText("TEXT 1: 4"))));
    }

    @Test
    public void clickThreeButton_openThreeTvActivity() throws Exception{
        onView(withId(R.id.three)).perform(click());
        onView(withId(R.id.text_three_activity)).check(matches(isDisplayed()));
        onView(withId(R.id.text_three_activity)).check(matches(withText(R.string.onresumetext)));
    }
}
