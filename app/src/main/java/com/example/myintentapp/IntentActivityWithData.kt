package com.example.myintentapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IntentActivityWithData : AppCompatActivity() {

    lateinit var tvIntentActivity: TextView
    lateinit var btn_balik: Button

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_with_data)

        tvIntentActivity = findViewById(R.id.tv_intent_data)

        val data = intent.getStringExtra(EXTRA_DATA)

        tvIntentActivity.text = data

        btn_balik = findViewById(R.id.btn_balik)
        btn_balik.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}