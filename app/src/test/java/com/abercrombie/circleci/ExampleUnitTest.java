package com.abercrombie.circleci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class ExampleUnitTest {

  @Test public void addition_isCorrect() throws Exception {
    MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();
    assertNotNull(activity);
  }
}