package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IntentActivityWithStatus : AppCompatActivity() {

    lateinit var tv_intent_status : TextView
    lateinit var tv_intent_status_2 : TextView
    lateinit var btn_balik_lagi : Button

    companion object {
        const val DATA_DUA = "data_dua"
        const val DATA_TIGA = "data_tiga"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_with_status)

        tv_intent_status = findViewById(R.id.tv_intent_status)
        tv_intent_status_2 = findViewById(R.id.tv_intent_status_2)

        val data2 = intent.getStringExtra(DATA_DUA)
        val data3 = intent.getStringExtra(DATA_TIGA)

        tv_intent_status.text = data2
        tv_intent_status_2.text = data3

        btn_balik_lagi = findViewById(R.id.btn_balik_lagi)
        btn_balik_lagi.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}