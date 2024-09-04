package com.charmaser.receiver

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Define the display Text view
        val txtview = findViewById<View>(R.id.txtDisplay) as TextView

        // get app the data sent on bundle
        val b = intent.extras

        // display the key that have the data
        txtview.text = b?.getString("Comment")
    }
}
