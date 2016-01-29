package com.santoshmandadi.tryanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Gravity;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
//        Slide slide = new Slide(Gravity.BOTTOM);
//        slide.addTarget(R.id.text_content);
//        getWindow().setEnterTransition(slide);
    }
}
