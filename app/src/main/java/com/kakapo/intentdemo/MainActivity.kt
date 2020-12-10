package com.kakapo.intentdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createSubmitButton()
    }

    private fun createSubmitButton(){
        btn_submit.setOnClickListener {
            val intent = Intent(this, IntentDemo::class.java)
            intent.apply {
                putExtra(NAMA_DEPAN, et_nama_depan.text.toString())
                putExtra(NAMA_BELAKANG, et_nama_belakang.text.toString())
                putExtra(ALAMAT, et_alamat.text.toString())
            }

            startActivity(intent)
            finish()
        }
    }

    companion object {
        const val NAMA_DEPAN = "nama depan"
        const val NAMA_BELAKANG = "nama belakang"
        const val ALAMAT = "alamat"
    }
}