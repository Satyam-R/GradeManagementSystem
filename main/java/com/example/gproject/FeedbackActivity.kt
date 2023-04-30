package com.example.gproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast

class FeedbackActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        val type = arrayOf("Data Structure", "Python", "OOPs", "Operating System", "Android Development", "DevOps")
        val adapter = ArrayAdapter(
            this,
            R.layout.dropdown_menu_popup_item,
            type)
        val editTextFilledExposedDropdown = findViewById<AutoCompleteTextView>(R.id.select)
        editTextFilledExposedDropdown.setAdapter(adapter)

        val btn = findViewById<Button>(R.id.submitButton)
        btn.setOnClickListener{
            Toast.makeText(this, "Thanks for the feedback, we will look into it.", Toast.LENGTH_SHORT).show()
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        val btn2 = findViewById<Button>(R.id.back)
        btn2.setOnClickListener{
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}