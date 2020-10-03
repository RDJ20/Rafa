package com.example.rafa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun cuandoclick(view: View) {

        var texto:String=txts.text.toString()

        Toast.makeText(applicationContext,"$texto,  para lograr lo que te propongas necesitas DETERMINACION",Toast.LENGTH_SHORT).show()
    }
}