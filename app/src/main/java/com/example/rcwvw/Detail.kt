package com.example.rcwvw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Detail : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        if(intent.hasExtra("daftar")) {
            val nama : TextView = findViewById(R.id.nama)
            val harga : TextView = findViewById(R.id.harga)
            val detail : TextView = findViewById(R.id.detail)
            val makan = intent.extras?.get("daftar") as daftar
            val hrg = "Rp.${makan.harga},-"
            val dtl = "Deskripsi : \n${makan.detail}"
            nama.setText(makan.nama)
            harga.setText(hrg)
            detail.setText(dtl)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
