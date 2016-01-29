package com.santoshmandadi.tryanimations;

import android.annotation.TargetApi;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public void click(View view) {
//        Slide slide = new Slide();
//        slide.setSlideEdge(Gravity.TOP);
//
//        ViewGroup root = (ViewGroup) findViewById(android.R.id.content);
//        TransitionManager.beginDelayedTransition(root);
//        ((TextView)findViewById(R.id.text_view)).setVisibility(View.INVISIBLE);
//        ((TextView)findViewById(R.id.text_view2)).setVisibility(View.INVISIBLE);

        TransitionManager.go(Scene.getSceneForLayout((ViewGroup) findViewById(R.id.root), R.layout.activity_main_exanded, MainActivity.this));

    }

    public void clickToMoveFromActivity(View view){
        Intent intent = new Intent(this, ContentActivity.class);
        ImageView sharedView = (ImageView)findViewById(R.id.image_icon);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this, sharedView, sharedView.getTransitionName()).toBundle();
        startActivity(intent, bundle);
    }
}
