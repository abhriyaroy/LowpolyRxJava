package com.zebrostudio.lowpolyrx

import android.content.Context
import androidx.annotation.ColorRes

fun Context.colorRes(@ColorRes id: Int) = resources.getColor(id)