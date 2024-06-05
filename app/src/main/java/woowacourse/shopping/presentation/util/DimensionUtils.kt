package woowacourse.shopping.presentation.util

import android.content.res.Resources

val density = Resources.getSystem().displayMetrics.density

val Int.dp get(): Int = (density * this).toInt()

val Float.dp get(): Float = density * this
