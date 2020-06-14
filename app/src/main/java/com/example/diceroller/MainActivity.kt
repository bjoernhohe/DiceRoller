package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val resultText: TextView = findViewById(R.id.text_view)
        val countButton: Button = findViewById(R.id.count_up)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener {count() }

    }

    private fun rollDice() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.text_view)
        val randomInt = Random1.nextInt(6) + 1
        resultText.text = randomInt.toString();
    }

    private fun count() {
        val resultText: TextView = findViewById(R.id.text_view)

        // If text is the default "Hello World!" set that text to 1.
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }

        }
    }
}