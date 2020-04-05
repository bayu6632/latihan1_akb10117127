package com.example.latihan1bayusatya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kode.*

class kode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kode)

        button2.setOnClickListener {
            val kode :String = input1.text.toString()

            if(kode.isEmpty())
            {
                Toast.makeText(this,"Kolom Kode Tidak Boleh Dikosongkan",Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            val intent = Intent(this, biodata::class.java)
            startActivity(intent)
        }
    }
}