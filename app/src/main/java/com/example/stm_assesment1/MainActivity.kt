package com.example.stm_assesment1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import android.widget.LinearLayout
import com.example.stm_assesment1.R

class MainActivity : AppCompatActivity() {

    private lateinit var rootLayout: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rootLayout = findViewById(R.id.rootLayout)

        val buttonRed = findViewById<Button>(R.id.buttonRed)
        val buttonGreen = findViewById<Button>(R.id.buttonGreen)
        val buttonBlue = findViewById<Button>(R.id.buttonBlue)
        val buttonYellow = findViewById<Button>(R.id.buttonYellow)
        val buttonWhite = findViewById<Button>(R.id.buttonWhite)

        buttonRed.setOnClickListener {
            rootLayout.setBackgroundColor(Color.RED)
        }

        buttonGreen.setOnClickListener {
            rootLayout.setBackgroundColor(Color.GREEN)
        }

        buttonBlue.setOnClickListener {
            rootLayout.setBackgroundColor(Color.BLUE)
        }

        buttonYellow.setOnClickListener {
            rootLayout.setBackgroundColor(Color.YELLOW)
        }

        buttonWhite.setOnClickListener {
            rootLayout.setBackgroundColor(Color.WHITE)
        }
    }
}