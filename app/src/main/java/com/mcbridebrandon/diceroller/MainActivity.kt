package com.mcbridebrandon.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button);

        rollButton.setOnClickListener {
            rollDice();
        }
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val firstDie = Dice(6);
        val secondDie = Dice(6);
        val diceRollOne = firstDie.roll();
        val diceRollTwo = secondDie.roll();
        // Update the screen with the dice roll
        val rollTextOne: TextView = findViewById(R.id.dieOne);
        val rollTextTwo: TextView = findViewById(R.id.dieTwo);
        rollTextOne.text = diceRollOne.toString();
        rollTextTwo.text = diceRollTwo.toString();
        //give a toast
        val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT);
        toast.show();
    }
}