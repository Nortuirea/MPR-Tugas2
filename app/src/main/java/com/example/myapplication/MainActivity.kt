package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var valueA = Random.nextInt(0,100)
    var valueB = Random.nextInt(0,100)
    var valueC = Random.nextInt(0,100)
    var valueD = Random.nextInt(0,100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonE = findViewById<Button>(R.id.button1)
        var valueE = valueA + valueB
        var valueF = valueC - valueD
        buttonE.setText("${valueA} + ${valueB}").toString()
        buttonE.setOnClickListener {
            if(valueE > valueF){
                Toast.makeText(this, "Benar", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Salah", Toast.LENGTH_SHORT).show()
            }
        }

        val buttonF = findViewById<Button>(R.id.button2)
        buttonF.setText("${valueC} - ${valueD}").toString()
        buttonF.setOnClickListener {
            if(valueF > valueE){
                Toast.makeText(this, "Benar", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        return super.onCreateView(name, context, attrs)
    }
}
