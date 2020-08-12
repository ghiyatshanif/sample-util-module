package com.nbs.view_extensions

import android.view.View

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}

fun View.invisble() {
    this.visibility = View.INVISIBLE
}

fun View.onClick(action: () -> Unit) {
    this.setOnClickListener { action.invoke() }
}