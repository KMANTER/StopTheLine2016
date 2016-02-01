package com.insta.skmjbfde.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.example.ui.TetrisGame;

/**
 * Created by skm on 01/02/2016.
 */
public class AndroidLauncher extends AndroidApplication {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Customize android application
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        config.hideStatusBar = false;
        config.useImmersiveMode = true;
        initialize(new TetrisGame(), config);
    }

}
