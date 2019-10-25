package com.example.intens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        val nim = bundle?.get("Nim")
        val nama = bundle?.get("Nama")
        val nilai = bundle?.get("Nilai")
        val keterangan = bundle?.get("Keterangan")


        textnim2.text = ("Nim: " + (nim))
        textnim2.text = ("Nama: "+ (nama))
        textnilai2.text = ("Nilai: "+ (nilai))
        keterangan2.text = ("Keterangan: "+ (keterangan))

        kembali.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
