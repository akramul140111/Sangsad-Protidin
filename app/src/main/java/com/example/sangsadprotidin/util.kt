package com.example.sangsadprotidin

import android.view.View
enum class Status{
    Available,Unavailable
}

fun gone(view : View){
    view.visibility = View.GONE
}

fun visible(view : View){
    view.visibility = View.VISIBLE
}

