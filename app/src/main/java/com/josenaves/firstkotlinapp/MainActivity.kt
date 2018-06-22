package com.josenaves.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.textView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast !", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        // get the value of the text view
        val countString = textView.text.toString()

        // convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        // display the new value in the text view
        textView.text = count.toString()
    }
}