package com.example.gproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val backbtn = findViewById<Button>(R.id.goback)
        backbtn.setOnClickListener{
            intent= Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        val fb = findViewById<ImageView>(R.id.FacebookIcon)
        val twitt = findViewById<ImageView>(R.id.ivTwitterIcon)
        val insta = findViewById<ImageView>(R.id.ivInstagramIcon)
        fb.setOnClickListener{
            val uri: Uri = Uri.parse("http://www.facebook.com") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        twitt.setOnClickListener{
            val uri: Uri = Uri.parse("http://www.twitter.com") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        insta.setOnClickListener{
            val uri: Uri = Uri.parse("http://www.instagram.com") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

    }
}