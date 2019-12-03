package com.devrel.experiment.large.dynamic.feature.a.dep.f;

import android.widget.ImageView;

public class Activity1 extends android.app.Activity {


    ImageView imageView1;

    ImageView imageView2;

    ImageView imageView3;

    ImageView imageView4;

    ImageView imageView5;

    ImageView imageView6;

    @Override
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Foo40().foo4();
        setContentView(R.layout.feature_a_dep_f_2);
    }
}
