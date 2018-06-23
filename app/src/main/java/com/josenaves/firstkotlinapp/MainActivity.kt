package com.josenaves.firstkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

    fun randomMe(view: View) {
        // create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        // get the current value of the text view
        val countString = textView.text.toString()

        // convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the intent
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        // start the new activity
        startActivity(randomIntent)
    }
}
