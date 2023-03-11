package com.example.search

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val onlineButton = findViewById<Button>(R.id.online)
        onlineButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, SearchActivity::class.java))
        }

        val inPersonButton = findViewById<Button>(R.id.in_person)
        inPersonButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, MapsActivity::class.java))
        }


        val onlineNav = findViewById<Button>(R.id.online_nav)
        onlineNav.setOnClickListener {
            startActivity(Intent(this@MainActivity, SearchActivity::class.java))
        }

        val inPersonNav = findViewById<Button>(R.id.in_person_nav)
        inPersonNav.setOnClickListener {
            startActivity(Intent(this@MainActivity, MapsActivity::class.java))
        }
    }
}
