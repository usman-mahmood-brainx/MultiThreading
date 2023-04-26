package com.example.multithreading

import android.content.Context
import android.util.Log
import android.widget.Toast
import kotlin.time.measureTime

//By extending thread class
class Thread1() : Thread() {
    override fun run() {

        for (i in 0 until 5){

            Log.d("Thread","Thread 1 : $i")
            Thread.sleep(500)
        }
    }
}