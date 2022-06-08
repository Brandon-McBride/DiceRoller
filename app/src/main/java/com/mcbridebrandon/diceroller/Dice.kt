package com.mcbridebrandon.diceroller

class Dice {
    var sides = 6


    fun roll(): Int {
        return (1..6).random()
    }

}