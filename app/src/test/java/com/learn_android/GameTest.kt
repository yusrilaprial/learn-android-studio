package com.learn_android

import org.junit.Assert
import org.junit.Test

class GameTest {
    @Test
    fun testPickRandomOption() {
        val options = listOf(Game.SCISSORS, Game.ROCK, Game.PAPER)
        for (i in 1..10) Assert.assertTrue(options.contains(Game.pickRandomOption()))
    }

    @Test
    fun testPickDrawable() {
        Assert.assertEquals(R.drawable.scissors, Game.pickDrawable(Game.SCISSORS))
        Assert.assertEquals(R.drawable.rock, Game.pickDrawable(Game.ROCK))
        Assert.assertEquals(R.drawable.paper, Game.pickDrawable(Game.PAPER))
    }

    @Test
    fun testIsDraw() {
        Assert.assertTrue(Game.isDraw(Game.SCISSORS, Game.SCISSORS))
        Assert.assertTrue(Game.isDraw(Game.ROCK, Game.ROCK))
        Assert.assertTrue(Game.isDraw(Game.PAPER, Game.PAPER))

        Assert.assertFalse(Game.isDraw(Game.SCISSORS, Game.ROCK))
        Assert.assertFalse(Game.isDraw(Game.ROCK, Game.PAPER))
        Assert.assertFalse(Game.isDraw(Game.PAPER, Game.SCISSORS))
    }

    @Test
    fun testIsWin() {
        Assert.assertTrue(Game.isWin(Game.SCISSORS, Game.PAPER))
        Assert.assertTrue(Game.isWin(Game.ROCK, Game.SCISSORS))
        Assert.assertTrue(Game.isWin(Game.PAPER, Game.ROCK))

        Assert.assertFalse(Game.isWin(Game.SCISSORS, Game.ROCK))
        Assert.assertFalse(Game.isWin(Game.ROCK, Game.PAPER))
        Assert.assertFalse(Game.isWin(Game.PAPER, Game.SCISSORS))
    }
}