package com.example.coroutines

import android.os.Bundle
import androidx.activity.ComponentActivity

import kotlinx.coroutines.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CoroutineScope(Dispatchers.Main).launch {
            sequentialExecution()
            delay(3000)
            concurrentExecution()
        }

    }
}
