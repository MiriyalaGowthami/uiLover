package com.example.uilover

// MyApp.kt
import android.app.Application

class MyApp : Application() {
    val database: AppDatabase by lazy { AppDatabase.getDatabase(this) }
}
