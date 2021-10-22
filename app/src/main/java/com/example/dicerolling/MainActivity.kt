package com.example.dicerolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.widget.Button

import android.widget.ImageView
import android.widget.TextView


class MainActivity() : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonvalue: Button = findViewById(R.id.roll_button)
        buttonvalue.setOnClickListener {
            rollDice()
        }


    }

    private fun rollDice() {
        val random = java.util.Random().nextInt(6) + 1
        val diceimage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (random) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceimage.setImageResource(drawableResource)
        val textresult : TextView = findViewById(R.id.text_result)
        textresult.text=random.toString()



    }
}






