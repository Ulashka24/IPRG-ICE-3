package com.sathiyavan.iprgice3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Declare variables
    private lateinit var enterMinutes:EditText
    private lateinit var enterHours:EditText
    private lateinit var resultTextView:TextView
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Initialize variables
        enterMinutes=findViewById(R.id.enterMinutes)
        enterHours=findViewById(R.id.enterHours)
        resultTextView=findViewById(R.id.resultTextView)
        button=findViewById(R.id.button)

        button.setOnClickListener {
            val enterMinutes = enterMinutes.text.toString()
        }

        resultTextView.text= "Hours rented: $enterHours"
        resultTextView.text= "Minutes rented: $enterMinutes"

        fun calculateTotalCost(minutes:Int): Int{
            val hours = minutes / 60
            val additionalMinutes= minutes % 60
            val totalCost = hours * 400 + additionalMinutes * 1
            return totalCost
        }

        fun calculateTotalHours(minutes:Int): Int{
            val hours = minutes / 60
            return hours
        }

        fun calculateRemainingMinutes(minutes:Int): Int{
            val additionalMinutes= minutes % 60
            return additionalMinutes
        }

        println("Hours: $enterHours")
        println("Minutes: $enterMinutes")
        val totalCost = ""
        println("Total Price: R$totalCost")


    }
}