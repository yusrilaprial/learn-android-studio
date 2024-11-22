package com.learn_android

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {
    lateinit var computerImageView: ImageView
    lateinit var rockImageButton: ImageButton
    lateinit var scissorsImageButton: ImageButton
    lateinit var paperImageButton: ImageButton
    lateinit var resultImageView: ImageView

    private fun initComponents(){
        computerImageView = findViewById(R.id.computerImageView)
        rockImageButton = findViewById(R.id.rockImageButton)
        scissorsImageButton = findViewById(R.id.scissorsImageButton)
        paperImageButton = findViewById(R.id.paperImageButton)
        resultImageView = findViewById(R.id.resultImageView)
    }

    private fun initListeners() {
        rockImageButton.setOnClickListener { startGame(Game.ROCK) }
        scissorsImageButton.setOnClickListener { startGame(Game.SCISSORS) }
        paperImageButton.setOnClickListener { startGame(Game.PAPER) }
    }

    private fun startGame(option: String) {
        val computerOption = Game.pickRandomOption()
        val computerDrawable = Game.pickDrawable(computerOption)
        computerImageView.setImageResource(computerDrawable)

        when {
            Game.isDraw(option, computerOption) -> resultImageView.setImageResource(R.drawable.draw)
            Game.isWin(option, computerOption) -> resultImageView.setImageResource(R.drawable.win)
            else -> resultImageView.setImageResource(R.drawable.lose)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        initComponents()
        initListeners()
    }
}