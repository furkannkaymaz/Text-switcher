package com.furkan.text_switcher

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextSwitcher

class MainActivity : AppCompatActivity() {
    private val textSwitcherHelper = TextSwitcherHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textSwitcher = findViewById<TextSwitcher>(R.id.tvAnimate)
        val textToShow = arrayOf("Android", "Kotlin")

        val textSwitcherHelper = TextSwitcherHelper()

        textSwitcherHelper.textSwitcher(textSwitcher,this,textToShow) {
            // you can change view or etc..
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        textSwitcherHelper.textSwitcherRemove()
    }
}