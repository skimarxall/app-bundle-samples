package com.devrel.experiment.large.dynamic.feature.n;

import android.widget.ImageView;

import com.devrel.experiment.large.dynamic.feature.a.R;

public class Activity1 extends android.app.Activity {
    ImageView imageView0;

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
        setContentView(R.layout.feature_n_base_n_2);
    }
}
