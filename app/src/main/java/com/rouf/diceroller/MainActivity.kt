package com.rouf.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_btn)
        var resultImageView: ImageView = findViewById(R.id.resultImageView)
        resultImageView.setImageResource(R.drawable.dice_6)
        rollButton.setOnClickListener { rollDice() }
    }

    class Dice(private val numSides: Int){
        fun roll(): Int{ return (1..numSides).random() }
    }

    /**
     * Roll dice function which passes value to the class via an object
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        var resultImageView: ImageView = findViewById(R.id.resultImageView)

        when(diceRoll){
            1 -> resultImageView.setImageResource(R.drawable.dice_1)
            2 -> resultImageView.setImageResource(R.drawable.dice_2)
            3 -> resultImageView.setImageResource(R.drawable.dice_3)
            4 -> resultImageView.setImageResource(R.drawable.dice_4)
            5 -> resultImageView.setImageResource(R.drawable.dice_5)
            else -> resultImageView.setImageResource(R.drawable.dice_6)
        }
    }
}

