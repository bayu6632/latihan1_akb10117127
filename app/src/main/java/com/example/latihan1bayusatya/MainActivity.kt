package com.example.latihan1bayusatya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, kode::class.java)
            startActivity(intent)
        }
    }
}

/*
 5 april 2020 mengerjakan layout berserta coding 10117127-BayuSatyaPratama-IF4

 */