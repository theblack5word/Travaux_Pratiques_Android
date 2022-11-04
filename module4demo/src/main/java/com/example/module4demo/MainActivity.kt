package com.example.module4demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textViewInfo)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textView.text = "J'ai appuyé sur le bouton :D"
        }
    }
}