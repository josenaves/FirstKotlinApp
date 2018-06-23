package com.josenaves.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// Android extensions import statements for the two views to update
import kotlinx.android.synthetic.main.activity_second.textview_random
import kotlinx.android.synthetic.main.activity_second.textview_label

import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandonNumber()
    }

    fun showRandonNumber() {
        // get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, -1)

        // generate the random number
        val random = Random()
        random.setSeed(Date().time)
        
        var randomInt = 0

        // Add one because the bound is exclusive
        if (count > 0) {
            randomInt = random.nextInt(count + 1)
        }

        // display the random number
        textview_random.text = Integer.toString(randomInt)

        // substitute the max value into the string resource
        // for the heading, and update the heading
        textview_label.text = getString(R.string.random_heading, count)
    }
}
