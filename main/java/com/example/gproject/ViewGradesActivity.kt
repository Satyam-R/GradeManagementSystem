package com.example.gproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ViewGradesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_grades)

        var arrayAdapter: ArrayAdapter<*>

        val header = arrayOf(
            "Term :I                                             TGPA : 8.00")

        // access the listView from xml file
        var hListView = findViewById<ListView>(R.id.headlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, header)
        hListView.adapter = arrayAdapter

        val header2 = arrayOf(
            "Course                                                       Grade")

        // access the listView from xml file
        var h2ListView = findViewById<ListView>(R.id.headlist2)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, header2)
        h2ListView.adapter = arrayAdapter

        val users = arrayOf(
            "Operating System                                           A",
            "DBMS                                                               A+",
            "Data Structure                                                 B",
            "Algorithms                                                       B+",
            "Python                                                              A",
            "Data Structure                                                 B",
            "Android Development                                     A",
            "Java                                                                 C",
            "DevOps                                                           B+",
            )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter

    }
}
