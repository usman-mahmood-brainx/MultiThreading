package com.example.multithreading

import android.util.Log

class RunnableThread2:Runnable{
    override fun run() {
        for(i in 0 until 5) {
            Log.d("Runnable Thread","Runnable Thread 2 : $i")
            Thread.sleep(500)
        }
    }

}