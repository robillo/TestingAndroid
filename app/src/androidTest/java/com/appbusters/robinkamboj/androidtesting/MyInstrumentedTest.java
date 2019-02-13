package com.appbusters.robinkamboj.androidtesting;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.appbusters.robinkamboj.androidtesting.main_screen.MainActivity;
import com.appbusters.robinkamboj.androidtesting.main_screen.thread_test.ThreadTestActivity;

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
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MyInstrumentedTest {

    private static final String TEXT_TO_TYPE = "ROBIN";
    private static final String RECYCLER_VIEW_TEXT_TO_MATCH = "TEXT 1: 4";
    private static final int RECYCLER_POSITION_TO_SCROLL_TO = 5;

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickOneButton_opensOneActivity() {

        onView(withId(R.id.text_test_button))
                .perform(click());

        onView(withId(R.id.verified_text))
                .check(matches(withEffectiveVisibility(ViewMatchers.Visibility.GONE)));

        onView(withId(R.id.type_text))
                .perform(typeText(TEXT_TO_TYPE))
                .perform(closeSoftKeyboard());

        onView(withId(R.id.verify_valid_text))
                .perform(click());

        onView(withId(R.id.verified_text))
                .check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))
                .check(matches(withText(R.string.text_verified)));

        onView(withId(R.id.main_activity_navigate_button))
                .perform(click());

        onView(withId(R.id.text_test_button))
                .check(matches(isDisplayed()));
    }

    @Test
    public void clickTwoButton_opensRvTestDataActivity() {

        onView(withId(R.id.recycler_test_button))
                .perform(click());

        onView(withId(R.id.recycler))
                .perform(RecyclerViewActions.scrollToPosition(RECYCLER_POSITION_TO_SCROLL_TO))
                .check(matches(hasDescendant(withText(RECYCLER_VIEW_TEXT_TO_MATCH))));
    }

    @Test
    public void clickThreeButton_openThreeAsyncTaskActivity() {

        onView(withId(R.id.async_task_test_button))
                .perform(click());

        onView(withId(R.id.text_three_activity))
                .check(matches(isDisplayed()));

        onView(withId(R.id.text_three_activity))
                .check(matches(withText(R.string.thread_resume_text)));
    }

    @Test
    public void clickFourButton_openFourThreadActivity() {

        onView(withId(R.id.thread_test_button))
                .perform(click());

        onView(withId(R.id.text_four_activity))
                .check(matches(isDisplayed()));
    }

    @Test
    public void  clickThreadActivityButton_shouldChangeText() {

        Espresso.registerIdlingResources(ThreadTestActivity.Companion.getIdlingResourceInTest());

        onView(withId(R.id.thread_test_button))
                .perform(click());

        onView(withId(R.id.text_four_activity))
                .check(matches(isDisplayed()));

        onView(withId(R.id.text_four_activity))
                .check(matches(withText(R.string.thread_resume_text)));
    }
}
