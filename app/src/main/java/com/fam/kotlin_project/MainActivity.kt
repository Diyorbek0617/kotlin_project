package com.fam.kotlin_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickhere()
    }

    fun clickhere() {
        val kirish = findViewById<Button>(R.id.kirish)
        kirish.setOnClickListener { clickone() }
    }

    fun clickone() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}