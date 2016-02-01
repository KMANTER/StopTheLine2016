package com.insta.skmjbfde.android;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest extends AndroidApplication{
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
        AndroidApplicationConfiguration apc = new AndroidApplicationConfiguration();

    }
}