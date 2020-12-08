package com.kakapo.intentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_demo.*

class IntentDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_demo)
        setTextView()
    }

    private fun setTextView() {
        val namaDepan = intent.getStringExtra(MainActivity.NAMA_DEPAN)
        val namaBelakang = intent.getStringExtra(MainActivity.NAMA_BELAKANG)
        val alamat = intent.getStringExtra(MainActivity.ALAMAT)

        tv_nama_depan.text = ("nama depan: $namaDepan")
        tv_nama_belakang.text = ("nama belakang: $namaBelakang")
        tv_alamat.text = ("alamat: $alamat")
    }
}