package com.example.coroutines

import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

private fun getCurrentTime(): String {
    val sdf = SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault())
    return sdf.format(Date())
}
// Function 1
suspend fun printNumberOne()  {
    Log.d("CoroutineTest", "Task 1 started at ${getCurrentTime()}")
    delay(1000)
    Log.d("CoroutineTest", "Number One: 1 - Time: ${getCurrentTime()}")
}

// Function 2
suspend fun printNumberTwo() {
    Log.d("CoroutineTest", "Task 2 started at ${getCurrentTime()}")
    delay(1000)
    Log.d("CoroutineTest", "Number Two: 2 - Time: ${getCurrentTime()}")
}

// Function 3
suspend fun printNumberThree() {
    Log.d("CoroutineTest", "Task 3 started at ${getCurrentTime()}")
    delay(1000)
    Log.d("CoroutineTest", "Number Three: 3 - Time: ${getCurrentTime()}")
}

// Sequential Execution
 suspend fun sequentialExecution() {
    Log.d("CoroutineTest", "Sequential Execution Started at ${getCurrentTime()}")
    CoroutineScope(Dispatchers.Main).launch {
        try {
            printNumberOne()
            printNumberTwo()
            printNumberThree()
        } catch (e: Exception) {
            Log.d("CoroutineTest", "Error: ${e.message}")
        }
        Log.d("CoroutineTest", "Sequential Execution Completed at ${getCurrentTime()}")

    }.join()//ensure the coroutine completes before moving to executing other tasks

}

// Concurrent Execution
 fun concurrentExecution() {
    Log.d("CoroutineTest", "Concurrent Execution Started at ${getCurrentTime()}")
    CoroutineScope(Dispatchers.Main).launch {
        try {
            val num1 = async { printNumberOne() }
            val num2 = async { printNumberTwo() }
            val num3 = async { printNumberThree() }
            num1.await()
            num2.await()
            num3.await()//ensures that all three coroutines complete before log "Concurrent Execution Completed"
        } catch (e: Exception) {
            Log.d("CoroutineTest", "Error: ${e.message}")
        }
        Log.d("CoroutineTest", "Concurrent Execution Completed at ${getCurrentTime()}")

    }
}
