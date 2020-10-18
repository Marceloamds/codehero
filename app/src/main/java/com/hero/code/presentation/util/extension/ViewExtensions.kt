package com.hero.code.presentation.util.extension

import android.graphics.Color
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import androidx.annotation.IdRes
import com.bumptech.glide.Glide
import com.hero.code.presentation.util.click.SafeClickListener

fun View.setSafeClickListener(intervalInMillis: Int = 1000, callback: () -> Unit) {
    SafeClickListener(callback, intervalInMillis).apply {
        setOnClickListener(this::onClick)
    }
}

// transparent
fun transparentStatusAndNavigation(window: Window) {
    window.decorView.systemUiVisibility =
        (View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false, window)
    window.statusBarColor = Color.TRANSPARENT
}

fun setWindowFlag(bits: Int, on: Boolean, window: Window) {
    val win: Window = window
    val winParams: WindowManager.LayoutParams = win.attributes
    if (on) {
        winParams.flags = winParams.flags or bits
    } else {
        winParams.flags = winParams.flags and bits.inv()
    }
    win.attributes = winParams
}

fun ImageView.circleLoad(url: String?) {
    Glide.with(this).load(url).circleCrop().into(this)
}

fun ImageView.load(url: String?) {
    Glide.with(this).load(url).into(this)
}

fun View.setOnClickListenerById(@IdRes id: Int, callback: () -> Unit) {
    findViewById<View>(id).setOnClickListener { callback() }
}