package com.example.aramideshelloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

// This Kotlin file is where user interaction will be handled
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Display customized to show 'Hello from {name}'
        //User can tap a button to change the text color of the label
        // 1. Add a button to layout

        // Set a reference
        // 2. Set up a logic to know when user has tapped a button
        // Handle button tap
        // 3. Change the color of the text

        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Aramide", "Tapped on button")
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.teal_200))

        }




        findViewById<Button>(R.id.button2).setOnClickListener{
            Log.i("View","Tapped on button" )
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.white))
        }


    }
}