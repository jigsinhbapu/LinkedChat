package com.example.linkedchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val textView = findViewById <TextView> (R.id.lc)
        val splash = AnimationUtils.loadAnimation(this, R.anim.alpha_animation)
        textView.startAnimation(splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }, 4000) // 3000 is the delayed time in milliseconds.






    }
}