package com.example.multithreading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // With Extending Thread
//        val thread1= Thread1()
//        val thread2=Thread2()
//        thread1.start()
//        thread2.start()
//
//        val sum = SumThread(2, 3)
//        sum.start()
//        sum.join()
//        val sumResult = sum.getResult()
//        Toast.makeText(applicationContext,"Sum Result: $sumResult",Toast.LENGTH_SHORT).show()
//
//        val multiply = MultiplyThread(2, 3)
//        multiply.start()
//        multiply.join()
//        val mulResult = multiply.getResult()
//        Toast.makeText(applicationContext,"Mul Result: $mulResult",Toast.LENGTH_SHORT).show()


        // With Runnable
        val runnableThread1= RunnableThread1()
        val runnableThread2 = RunnableThread2()

        val t1 =Thread(runnableThread1)
        val t2 = Thread(runnableThread2)
        t1.start()
        Thread.sleep(10)
        t2.start()

    }
}