package com.example.nuevacalculadora;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.editTextNumber1),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("2"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.editTextNumber2),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("6"), closeSoftKeyboard());

        ViewInteraction materialButton = onView(
                allOf(withId(R.id.buttonAdd), withText("Sumar"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        materialButton.perform(click());

        ViewInteraction materialButton2 = onView(
                allOf(withId(R.id.buttonMultiply), withText("Multiplicar"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton2.perform(click());

        ViewInteraction materialButton3 = onView(
                allOf(withId(R.id.button1), withText("Potencia"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        materialButton3.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.edit01),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("5"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.edit02),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("3"), closeSoftKeyboard());

        ViewInteraction materialButton4 = onView(
                allOf(withId(R.id.buttonPower), withText("Potencia"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        materialButton4.perform(click());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.edit02), withText("3"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText5.perform(pressImeActionButton());

        ViewInteraction materialButton5 = onView(
                allOf(withId(R.id.btnFibonacci), withText("FIBONACCI"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                6),
                        isDisplayed()));
        materialButton5.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.editText01),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("6"), closeSoftKeyboard());

        ViewInteraction materialButton6 = onView(
                allOf(withId(R.id.bottonfibo1), withText("Fibonacci"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton6.perform(click());

        ViewInteraction materialButton7 = onView(
                allOf(withId(R.id.button01), withText("INICIO"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        materialButton7.perform(click());

        ViewInteraction materialButton8 = onView(
                allOf(withId(R.id.button3), withText("Factorial"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                8),
                        isDisplayed()));
        materialButton8.perform(click());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.edit01),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText("5"), closeSoftKeyboard());

        ViewInteraction materialButton9 = onView(
                allOf(withId(R.id.buttonFactorial), withText("Factorial"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        materialButton9.perform(click());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.edit01), withText("5"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText8.perform(pressImeActionButton());

        ViewInteraction materialButton10 = onView(
                allOf(withId(R.id.button01), withText("INICIO"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        materialButton10.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
