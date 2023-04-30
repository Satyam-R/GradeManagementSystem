package com.example.gproject

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class AddGrades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_grades)

        val type = arrayOf("Data Structure", "Python", "OOPs", "Operating System", "Android Development", "DevOps")

        val adapter = ArrayAdapter(
            this,
            R.layout.dropdown_menu_popup_item,
            type)

        val editTextFilledExposedDropdown =
            findViewById<AutoCompleteTextView>(R.id.filled_exposed_dropdown)
        editTextFilledExposedDropdown.setAdapter(adapter)

        val addbtn=findViewById<Button>(R.id.addButton)
        addbtn.setOnClickListener{
            Toast.makeText(this, "Added the Student", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        val editText1 = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.editText1)
        val editText2 = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.reg)
        val editText3 = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.editText3)
        val clear = findViewById<Button>(R.id.clear)
        clear.setOnClickListener{
            editText1.editText?.setText("")
            editText2.editText?.setText("")
            editText3.editText?.setText("")
        }
    }
}