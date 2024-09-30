package com.example.s1114707lotto

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            var txv: TextView = findViewById(R.id.txv)
            txv.text = "0"
        }

        fun happy(v: View){
            var txv: TextView = findViewById(R.id.txv)
            txv.text = (1..100).random().toString()
        }
    }

