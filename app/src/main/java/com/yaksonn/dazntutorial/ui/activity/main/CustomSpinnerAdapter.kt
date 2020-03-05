package com.yaksonn.dazntutorial.ui.activity.main

import android.content.Context
import android.content.res.Resources
import android.support.v7.widget.ThemedSpinnerAdapter
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.yaksonn.dazntutorial.R
import kotlinx.android.synthetic.main.row_custom_dropdown.view.*

class CustomSpinnerAdapter(context: Context, val objects: Array<String>) :
    ArrayAdapter<String>(context, R.layout.row_custom_dropdown, objects),
    ThemedSpinnerAdapter {
    private val mDropDownHelper: ThemedSpinnerAdapter.Helper =
        ThemedSpinnerAdapter.Helper(context)

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View

        if (convertView == null) {
            val inflater = mDropDownHelper.dropDownViewInflater
            view = inflater.inflate(R.layout.row_custom_dropdown, parent, false)
        } else {
            view = convertView
        }

        view.text1.text = getItem(position)

        var spinnerDivider: Int = if (position == objects.size - 1) {
            0
        } else {
            R.drawable.spinner_divider
        }
        view.text1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, spinnerDivider)

        return view
    }

    override fun getDropDownViewTheme(): Resources.Theme? {
        return mDropDownHelper.dropDownViewTheme
    }

    override fun setDropDownViewTheme(theme: Resources.Theme?) {
        mDropDownHelper.dropDownViewTheme = theme
    }
}