package com.lex.ensayog46

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registro(btnnewuser:View){
        val objeto1 = Intent(this,formulActivity::class.java)
        startActivity(objeto1)
    }
}