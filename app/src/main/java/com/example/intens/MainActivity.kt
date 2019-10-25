package com.example.intens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textnim = findViewById<EditText>(R.id.textnim)
        val textnama = findViewById<EditText>(R.id.textnama)
        val textnilai = findViewById<EditText>(R.id.textnilai)


        btn_proses.setOnClickListener(){

                Toast.makeText(applicationContext,"tunggu sebentar", Toast.LENGTH_LONG).show()

                val nim = textnim.text.toString()
                val nama = textnama.text.toString()
                val nilai = textnilai.text.toString()
                var keterangan: String? = ""

                if (nilai >= 80.toString()){
                    keterangan = "A"
                }else if(nilai >= 60.toString()){
                    keterangan = "B"
                }else if (nilai >= 40.toString()){
                    keterangan = "C"
                }else if (nilai >=20.toString()){
                    keterangan = "D"
                }else{
                    keterangan = "E"
                }

                val intent = Intent(this, Main2Activity::class.java)
                intent.putExtra("Nim", nim)
                intent.putExtra("Nama", nama)
                intent.putExtra("Nilai", nilai)
                intent.putExtra("Keterangan", keterangan)

                startActivity(intent)

        }
    }
}
