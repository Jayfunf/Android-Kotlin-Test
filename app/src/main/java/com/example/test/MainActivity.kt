package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this@MainActivity, "Hi",Toast.LENGTH_LONG).show()
        Toast.makeText(this@MainActivity, "LongTimeNoSee",Toast.LENGTH_LONG).show()
    }
}
