package com.example.ui;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.example.GdxUtils;
import com.example.GameEngine;

import de.tomgrill.gdxdialogs.core.GDXDialogs;
import de.tomgrill.gdxdialogs.core.GDXDialogsSystem;

/**
 * Created by skm on 01/02/2016.
 */
public class TetrisGame extends Game  {
    // Pixel-real size
    public static int WIDTH;
    public static int HEIGHT;

    // V_ for virtual, it's the camera size, not the real one
    public static int V_WIDTH = 1024; // Default value, need tweak on android
    public static final int V_HEIGHT = 720;

    private GdxUtils gdxUtils;
    private GDXDialogs dialogs;

    private GameEngine gameEngine;

    private boolean playerSignedIn = false;
    private int fightResult = 0;
    @Override
    public void create() {
        // We can't use only static method here, due to how android handles resources / static, it may causes bugs such as
        // assets not correctly reloaded after a "home button" press then re-opening the app
        gdxUtils = new GdxUtils();
        Texture.setAssetManager(gdxUtils.assetManager);

        dialogs = GDXDialogsSystem.install();

        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();

        // Adjust width to keep good ratio on mobile screens
        V_WIDTH = (V_HEIGHT * WIDTH) / HEIGHT;

        // Our "controller" class
        gameEngine = new GameEngine();

        // First screen, login
        displayIntroScreen();
    }
    private void displayIntroScreen() {
        gdxUtils.loadIntroAssets();
        gdxUtils.assetManager.finishLoading();

       // setScreen(new FixedFpsScreen(new IntroStage(gameEngine), 30));
    }

    public static GdxUtils gdxUtils() {
        return ((TetrisGame) Gdx.app.getApplicationListener()).gdxUtils;
    }
}
