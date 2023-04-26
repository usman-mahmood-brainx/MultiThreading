package com.example.multithreading

import android.util.Log

class SumThread(val a:Int,val b:Int) : Thread() {
    private var result = 0
    override fun run() {
        Thread.sleep(1000)
       result = a+b
    }

    fun getResult():Int{
        return result
    }
}
