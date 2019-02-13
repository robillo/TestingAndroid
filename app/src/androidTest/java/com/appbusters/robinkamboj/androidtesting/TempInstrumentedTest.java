package com.appbusters.robinkamboj.androidtesting;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.appbusters.robinkamboj.androidtesting.main_screen.thread_test.ThreadTestActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
public class TempInstrumentedTest {

        @Rule
        public ActivityTestRule<ThreadTestActivity> fourActivityActivityTestRule
                = new ActivityTestRule<>(ThreadTestActivity.class);

    @Test
    public void  clickThreadActivityButton_shouldChangeText() {
        Espresso.registerIdlingResources();
        onView(withId(R.id.thread_test_button)).perform(click());
        onView(withId(R.id.text_four_activity)).check(matches(isDisplayed()));
        onView(withId(R.id.text_four_activity)).check(matches(withText(R.string.onresumetext)));
    }
}
