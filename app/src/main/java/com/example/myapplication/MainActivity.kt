package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import kotlin.random.Random
import kotlin.random.nextUInt


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }}
val player_choice = player_choice.text
val opponent_choice = opponent_choice.text
val winloss = winloss.text

fun Rockbuttonpressed(view: View) {
    val Rock = 1
    val Paper = 2
    val Scissors = 3

    val myRandomInt = Random.nextUInt(3u)
    opponent_choice.text = "opponent chose $myRandomInt"

    player_choice.text = "You chose Rock"
    when {
        myRandomInt = 1 -> winloss.text = "Draw"
        myRandomInt = 2 -> {
            winloss.text = "Lose"
        }
        else -> winloss.text = "Win"

    }
    fun Paperbuttonpressed(view: View) {
        val Rock = 1
        val Paper = 2
        val Scissors = 3

        val myRandomInt = Random.nextUInt(3u)
        opponent_choice.text = "opponent chose $myRandomInt"
        player_choice.text = "You chose Paper"
        when {
            myRandomInt = 1 -> winloss.text = "Win"
            myRandomInt = 2 -> {
                winloss.text = "Draw"
            }
            else -> winloss.text = "Lose"

        }
        fun Scissorsbuttonpressed(view: View) {
            val Rock = 1
            val Paper = 2
            val Scissors = 3

            val myRandomInt = Random.nextUInt(3u)
            opponent_choice.text = "opponent chose $myRandomInt"
            player_choice.text = "You chose Scissors"
            when {
                myRandomInt = 1 -> winloss.text = "Lose"
                myRandomInt = 2 -> {
                    winloss.text = "Win"
                }
                else -> winloss.text = "Draw"

            }
        }
    }
}
