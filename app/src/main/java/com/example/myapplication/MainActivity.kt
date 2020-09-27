package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Initialize()
    }

    private fun Initialize(){
        var num = arrayOf(Random.nextInt(0,100),Random.nextInt(0,100),
            Random.nextInt(0,100),Random.nextInt(0,100))
        var result = arrayOf(num[0]+num[1], num[2]-num[3])
        button1.setText("${num[0]} + ${num[1]}")
        button2.setText("${num[2]} - ${num[3]}")

        button1.setOnClickListener {
            Calculate(result[0], result[1], "1")
        }
        button2.setOnClickListener {
            Calculate(result[0], result[1], "2")
        }
    }

    private fun Calculate(first: Int, second: Int, button_id: String){
        if (first >= second && button_id == "1"){
            Toast.makeText(this@MainActivity,"Benar",Toast.LENGTH_SHORT).show()
            Initialize()
        }
        else if (first <= second && button_id == "2"){
            Toast.makeText(this@MainActivity,"Benar",Toast.LENGTH_SHORT).show()
            Initialize()
        }
        else{
            Toast.makeText(this@MainActivity,"Salah",Toast.LENGTH_SHORT).show()
            Initialize()
        }
    }
}
