package com.example.multithreading

import android.util.Log

class RunnableThread1 : Runnable {
    override fun run() {
        for (i in 0 until 5) {
            Log.d("Runnable Thread","Runnable Thread 1 :  $i")
            Thread.sleep(500)
        }
    }
}