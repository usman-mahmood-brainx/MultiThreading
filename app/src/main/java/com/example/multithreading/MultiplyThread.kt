package com.example.multithreading

class MultiplyThread (val a:Int,val b:Int) : Thread() {
    private var result = 0
    override fun run() {
        result = a*b
    }

    fun getResult():Int{
        return result
    }
}
