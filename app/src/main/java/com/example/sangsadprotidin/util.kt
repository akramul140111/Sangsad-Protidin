package com.example.sangsadprotidin

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.view.View
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder

enum class Status{
    Available,Unavailable
}

fun gone(view : View){
    view.visibility = View.GONE
}

fun visible(view : View){
    view.visibility = View.VISIBLE
}

