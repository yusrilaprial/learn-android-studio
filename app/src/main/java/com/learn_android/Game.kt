package com.learn_android

import kotlin.random.Random

object Game {
    const val SCISSORS = "SCISSORS"
    const val ROCK = "ROCK"
    const val PAPER = "PAPER"

    private val rules = mapOf(
        "$ROCK-$SCISSORS" to true,
        "$ROCK-$PAPER" to false,
        "$SCISSORS-$PAPER" to true,
        "$SCISSORS-$ROCK" to false,
        "$PAPER-$ROCK" to true,
        "$PAPER-$SCISSORS" to false,
    )

    private val options = listOf(SCISSORS, ROCK, PAPER)

    private val optionsDrawable = mapOf(
        SCISSORS to R.drawable.scissors,
        ROCK to R.drawable.rock,
        PAPER to R.drawable.paper,
    )

    fun pickRandomOption(): String = options[Random.nextInt(0, 3)]

    fun pickDrawable(option: String): Int = optionsDrawable[option]!!

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!
}