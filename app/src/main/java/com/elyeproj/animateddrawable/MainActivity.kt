package com.elyeproj.animateddrawable

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        my_animated_view.setOnClickListener {
            animateView(my_animated_view)
        }
    }

    private fun animateView(view: ImageView) {
        when (val drawable = view.drawable) {
            is AnimatedVectorDrawableCompat -> drawable.start()
            is AnimatedVectorDrawable -> drawable.start()
        }
    }
}
