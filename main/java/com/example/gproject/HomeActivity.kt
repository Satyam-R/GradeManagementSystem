package com.example.gproject

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.*
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout


class HomeActivity : AppCompatActivity() {

    lateinit var navig: com.google.android.material.navigation.NavigationView
    lateinit var drawerLayout: DrawerLayout
    lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        /*---------------- ----------------*/

        /*----------drawer-----------*/
        navig = findViewById(R.id.navView)
        drawerLayout = findViewById(R.id.my_drawer_layout)
        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)

        // pass the Open and Close toggle for the drawer layout listener
        // to toggle the button
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        // to make the Navigation drawer icon always appear on the action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navig.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    val intent = Intent(this, ReportActivity::class.java)
                    startActivity(intent)
                }
                R.id.item2 -> {
                    val intent = Intent(this, RateActivity::class.java)
                    startActivity(intent)
                }
                R.id.item3 -> {
                    val intent = Intent(this, AboutActivity::class.java)
                    startActivity(intent)
                }
                R.id.item4 -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
            true
        }

        /*------------------------------ Buttons Actions --------------------------------*/

        val view = findViewById<LinearLayout>(R.id.image1)
        val add = findViewById<LinearLayout>(R.id.image2)
        val performance = findViewById<LinearLayout>(R.id.image3)
        val feedback = findViewById<LinearLayout>(R.id.image4)
        view.setOnClickListener {
            val intent = Intent(this, ViewGradesActivity::class.java)
            startActivity(intent)
        }
        add.setOnClickListener {
            val intent = Intent(this, AddGrades::class.java)
            startActivity(intent)
        }
        performance.setOnClickListener {
            val intent = Intent(this, ProgressActivity::class.java)
            startActivity(intent)
        }
        feedback.setOnClickListener {
            val intent = Intent(this, FeedbackActivity::class.java)
            startActivity(intent)
            finish()
        }

        /*--------------------------------------- Action Bar -------------------------------------*/

        // calling this activity's function to
        // use ActionBar utility methods
        val actionBar = supportActionBar

        // providing title for the ActionBar
        actionBar!!.title = " Lovely School"

        // providing subtitle for the ActionBar
        actionBar.subtitle = "   Grade Management System"

        // adding icon in the ActionBar
        // actionBar.setIcon(R.drawable.ic_action_name)

        // methods to display the icon in the ActionBar
        //actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
    }

    // method to inflate the options menu when the user opens the menu for the first time
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // methods to control the operations that will
    // happen when user clicks on the action buttons
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.search -> Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
            R.id.refresh -> Toast.makeText(this, "Refreshed the layout", Toast.LENGTH_SHORT).show()
            else -> {
                if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
                    return true
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    /*----------------------------------------------------------------------------*/

}
