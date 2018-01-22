package io.srinnix.stickyheaderrecyclerview.common

import android.graphics.Color
import android.support.v7.graphics.Palette

/**
 * Created by Tuha on 1/22/2018.
 */

fun String.getTextColor(): Int {
    val color = Color.parseColor(this)
    val swatch = Palette.Swatch(color, 1024)
    return swatch.bodyTextColor
}