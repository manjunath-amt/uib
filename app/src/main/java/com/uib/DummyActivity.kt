package com.uib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DummyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dummy)
    }

    override fun onStart() {
        super.onStart()
        finish()
    }
}