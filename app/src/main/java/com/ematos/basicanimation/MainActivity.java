package com.ematos.basicanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    protected static final long ANIMATION_DURATION = 200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void swapImages(View view) {
        ImageView goingOut, commingIn;

        ImageView bartImage = (ImageView) findViewById(R.id.bartImage);
        ImageView hommerImage = (ImageView) findViewById(R.id.hommerImage);

        if (bartImage.getAlpha() == 0) {
            goingOut = hommerImage;
            commingIn = bartImage;
        } else {
            goingOut = bartImage;
            commingIn = hommerImage;
        }

        commingIn.setTranslationY(-400f);

        commingIn.animate().alpha(1f).translationYBy(400f).setDuration(ANIMATION_DURATION);
        goingOut.animate().alpha(0f).translationYBy(400f).setDuration(ANIMATION_DURATION);

    }
}
