package com.furkan.text_switcher

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.TextSwitcher

const val DELAY_TEXT_SWITCHER : Long = 3000

class TextSwitcherHelper(){

    val mainHandler = Handler(Looper.getMainLooper())

    fun textSwitcher(textSwitcher: TextSwitcher, context: Context, textToShow: Array<String>) {
        var currentIndex = 0
        with(textSwitcher){
            this.setInAnimation(context, R.anim.anim_out);
            this.setOutAnimation(context, R.anim.anim_in);
        }
        mainHandler.post(object : Runnable {
            override fun run() {
                currentIndex++
                if (currentIndex == textToShow.size) {
                    currentIndex = 0
                }
                textSwitcher.setText(textToShow[currentIndex])

                mainHandler.postDelayed(this, DELAY_TEXT_SWITCHER)

            }
        })
    }
    
}



