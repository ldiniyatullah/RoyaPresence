package com.unida.firebaseauthdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.lang.Exception

class Splashscreen : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(500)

                    val intent = Intent(baseContext, LoginActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}