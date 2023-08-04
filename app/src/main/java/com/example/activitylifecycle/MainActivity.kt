package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate invoked")
    }

    override fun onStart() {
        super.onStart()
        println("onStart invoked")
    }

    override fun onResume() {
        super.onResume()
        println("onResume invoked")
    }

    override fun onPause() {
        super.onPause()
        println("onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        println("onStop invoked")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy invoked")
    }
}