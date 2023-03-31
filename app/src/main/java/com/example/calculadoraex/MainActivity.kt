package com.example.calculadoraex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtResultado = findViewById<TextView>(R.id.textTitulo)
        val btn2Plus = findViewById<Button>(R.id.btn2Plus)



        btn2Plus.setOnClickListener {

        }
    }
}