package com.arhamiz.intentmika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class TugasActivityBaru : AppCompatActivity() {
    var rgGender:RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var btnChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        rgGender = findViewById(R.id.rg_vocational)
        btnChoose = findViewById(R.id.btn_choose)
        btnChoose.setOnClickListener {
            val selectOption: Int = rgGender!!.checkedRadioButtonId
            radioButton = findViewById(selectOption)

            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle()
            bundle.putString("Gender", radioButton.text as String?)
            startActivity(Intent)
        }
    }
}