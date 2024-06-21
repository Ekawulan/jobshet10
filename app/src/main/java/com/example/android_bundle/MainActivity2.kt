package com.example.android_bundle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var namaView: TextView
    private lateinit var umurView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        namaView = findViewById(R.id.namaView)
        umurView = findViewById(R.id.umurView)

        val extras = intent.extras
        namaView.text = extras?.getString("nama")
        umurView.text = extras?.getString("umur")
    }
}