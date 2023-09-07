package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnMove : Button
    lateinit var btnIntentBersamaData : Button
    lateinit var btnIntentDataStatus : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMove = findViewById(R.id.btn_move)
        btnIntentBersamaData = findViewById(R.id.btn_intent_bersama_data)

        btnMove.setOnClickListener {
            val intent = Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }

        btnIntentBersamaData = findViewById(R.id.btn_intent_bersama_data)
        btnIntentBersamaData.setOnClickListener {
            val intent = Intent(this,IntentActivityWithData::class.java)
            intent.putExtra(IntentActivityWithData.EXTRA_DATA,"RRQ")
            startActivity(intent)
        }

        btnIntentDataStatus = findViewById(R.id.btn_intent_bersama_data_dan_status)
        btnIntentDataStatus.setOnClickListener {
            val intent = Intent(this,IntentActivityWithStatus::class.java)
            intent.putExtra(IntentActivityWithStatus.DATA_DUA,"DWA")
            intent.putExtra(IntentActivityWithStatus.DATA_TIGA,"RBL")
            startActivity(intent)
        }


    }
}