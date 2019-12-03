package com.devrel.experiment.large.dynamic.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devrel.experiment.large.dynamic.app.ui.main.MainFragment
import com.devrel.experiment.large.dynamic.feature.common.a.o.Foo0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        if (intent.data != null) {
            Foo0().foo0() // If executed will cause a recursion issue just adding it for referencing
        }
    }

}
