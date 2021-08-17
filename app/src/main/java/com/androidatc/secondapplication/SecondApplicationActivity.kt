package com.androidatc.secondapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class SecondApplicationActivity : AppCompatActivity() {
    var error:Int=0
    val requestCode_intent:Int=3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_application)

findViewById<Button>(R.id.button).setOnClickListener {
    //intent to call firstapplication Activity
    val intent = Intent()
    intent.action = "Android.ATC.FirstApplication2"
    intent.addCategory("android.intent.category.DEFAULT")
    try {
        startActivityForResult(intent, requestCode_intent)
    } catch (e: Exception) {
        findViewById<TextView>(R.id.firstappview).append("\n" + e.message + "\n")
        Toast.makeText(
            this, "Permission Not declared error!",
            Toast.LENGTH_LONG
        ).show()
        error = 1
    }
}
    }
}