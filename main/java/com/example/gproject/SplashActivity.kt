package com.example.gproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var image: ImageView =findViewById(R.id.SplashScreenImage)
        image.alpha = 0f
        image.animate().setDuration(1500).alpha(1f).withEndAction{
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in , android.R.anim.fade_out)
            finish()

        }
    }
}