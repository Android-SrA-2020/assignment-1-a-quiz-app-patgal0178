package com.example.asn1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton: Button = findViewById(R.id.btnNext)
        nextButton.setOnClickListener { next() }

        val prevButton: Button = findViewById(R.id.btnPrev)
        prevButton.setOnClickListener { prev() }
    }

    private val questionBank = listOf(
        Question("Q1", false),
        Question("Q2", true),
        Question("Q3", true),
        Question("Q4", false),
        Question("Q5", false))



    private var number=0
    private fun next() {
        val resultText: TextView = findViewById(R.id.txtQuestion)
        number++
        if(number>5){
            Toast.makeText(applicationContext,
                "No more Questions", Toast.LENGTH_SHORT).show()
        }
        resultText.text = number.toString()
    }

    private fun prev() {
        val resultText: TextView = findViewById(R.id.txtQuestion)
        number--
        if(number<0){
            Toast.makeText(applicationContext,
                "this is the first Question", Toast.LENGTH_SHORT).show()
        }
        resultText.text = number.toString()
    }
}
