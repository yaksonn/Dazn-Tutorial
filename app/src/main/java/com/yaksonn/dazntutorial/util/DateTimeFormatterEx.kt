package com.yaksonn.dazntutorial.util


import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by @yaksonn
 */


fun getFormattedDateWithMonthNameFromDateString(dateString: String): String {
    val formatter = SimpleDateFormat("yyyy-MM-dd")
    var calendar: Calendar? = null
    try {
        val date = formatter.parse(dateString)
        calendar = Calendar.getInstance()
        calendar!!.time = date
        return StringBuilder()
            .append(calendar.get(Calendar.DAY_OF_MONTH))
            .append(" ")
            .append(getMonthName(calendar.get(Calendar.MONTH)))
            .append(" ")
            .append(calendar.get(Calendar.YEAR))
            .toString()
    } catch (e: Exception) {
        e.printStackTrace()
        return ""
    }
}

private fun getMonthName(monthIndex: Int): String {
    when (monthIndex) {
        0 -> return "Jan"
        1 -> return "Feb"
        2 -> return "Mar"
        3 -> return "Apr"
        4 -> return "May"
        5 -> return "June"
        6 -> return "July"
        7 -> return "Aug"
        8 -> return "Sept"
        9 -> return "Oct"
        10 -> return "Nov"
        11 -> return "Dec"
        else -> return ""
    }
}