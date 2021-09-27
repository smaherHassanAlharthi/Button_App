package com.smaher.button_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var plusButton: Button
    lateinit var minusButton: Button
    lateinit var displayText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        plusButton = findViewById(R.id.plusbutton)
        minusButton = findViewById(R.id.minusbutton)
        displayText = findViewById(R.id.displaynum)

        plusButton.setOnClickListener { plus() }
        minusButton.setOnClickListener { minus() }
    }
    fun plus(){
        try {
            if(displayText.text == "0"){
                displayText.setTextColor(resources.getColor(R.color.black))
            }else if((displayText.text.toString()).toInt() > 0){
                displayText.setTextColor(resources.getColor(R.color.Green))
            }
            var count = displayText.text
            var convert = count.toString()
            var sum = convert.toInt()
            sum++
            displayText.setText(sum.toString())
            if(displayText.text == "0"){
                displayText.setTextColor(resources.getColor(R.color.black))
            }else if((displayText.text.toString()).toInt() > 0){
                displayText.setTextColor(resources.getColor(R.color.Green))
            }
        }catch (e: Exception){
            Log.d("MainActivity" , ">>>>>>>>>>>>>OOpps<<<<<<<<<<<<")
        }
    }
    fun minus(){
        try {
            if(displayText.text == "0"){
                displayText.setTextColor(resources.getColor(R.color.black))
            }else if((displayText.text.toString()).toInt() < 0){
                displayText.setTextColor(resources.getColor(R.color.red))
            }
            var count = displayText.text
            var convert = count.toString()
            var sum = convert.toInt()
            sum--
            displayText.setText(sum.toString())
            if(displayText.text == "0"){
                displayText.setTextColor(resources.getColor(R.color.black))
            }else if((displayText.text.toString()).toInt() < 0){
                displayText.setTextColor(resources.getColor(R.color.red))
            }
        }catch (e: Exception){
            Log.d("MainActivity" , ">>>>>>>>>>>>>OOpps<<<<<<<<<<<<")
        }
    }
}