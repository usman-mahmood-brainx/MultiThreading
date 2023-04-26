package com.example.multithreading

import android.content.Context
import android.util.Log
import android.widget.Toast

class Thread2() : Thread() {
    override fun run() {
        for (i in 0 until 5){

            Log.d("Thread","Thread 2")
            Thread.sleep(500)
        }
    }
}