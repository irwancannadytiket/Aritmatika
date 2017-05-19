package com.example.irwancannady.aritmatika

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

/**
 * Created by Irwan Cannady on 5/19/17.
 */

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt1 = findViewById(R.id.edt_satu) as EditText
        val edt2 = findViewById(R.id.edt_dua) as EditText
        val result = findViewById(R.id.tv_result) as TextView
        val btnTambah = findViewById(R.id.btn_tambah) as Button
        val btnKurang = findViewById(R.id.btn_kurang) as Button
        val btnKali = findViewById(R.id.btn_kali) as Button
        val btnBagi = findViewById(R.id.btn_bagi) as Button

        btnTambah.setOnClickListener {

            val a: String = edt1.text.toString()
            val b: String = edt2.text.toString()

            if(edt1.text.isEmpty() && edt2.text.isEmpty()){
                Toast.makeText(applicationContext,"silahkan isi", Toast.LENGTH_SHORT).show()
            } else {
                val c = a.toInt()
                val d = b.toInt()
                val e = c + d
                result.setText(e.toString())
            }
        }

        btnKurang.setOnClickListener {
            v ->  kurang()
        }

        btnKali.setOnClickListener {
            v -> result.setText(kali(edt1.text.toString().toInt(), edt2.text.toString().toInt()).toString())
        }

        btnBagi.setOnClickListener{
            v -> result.text = (getEdt1() / getEdt2()).toString()
        }
    }

    // ####################### //
    // Aritmatik with fun      //
    // #######################//
    fun kurang() {
        val edt1 = findViewById(R.id.edt_satu) as EditText
        val edt2 = findViewById(R.id.edt_dua) as EditText
        val result = findViewById(R.id.tv_result) as TextView
        if(edt1.text.isEmpty() || edt2.text.isEmpty()){
           Toast.makeText(applicationContext,"silahkan isi", Toast.LENGTH_SHORT).show()
        } else {
          val a: Int = edt1.text.toString().toInt()
          val b: Int = edt2.text.toString().toInt()
          val c: Int = a - b
          result.setText(c.toString())
       }
    }

    // #######################            //
    // Aritmatik with fun with return fun //
    // #######################            //
    fun kali(a: Int, b: Int): Int {
        return a * b
    }

    // #######################          //
    // Aritmatik with fun call edittext //
    // #######################          //
    fun getEdt1(): Int {
        val edt1 = findViewById(R.id.edt_satu) as EditText
        val a: String = edt1.text.toString()
        return a.toInt()
    }

    fun getEdt2(): Int {
        val edt2 = findViewById(R.id.edt_dua) as EditText
        val b: String = edt2.text.toString()
        return b.toInt()
    }
}
