package com.yaksonn.dazntutorial.util.customviews

import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yaksonn.dazntutorial.R

class LoadingProgressBar : DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inflate = inflater.inflate(R.layout.loading_progress_bar, container, false)
        val dialog = dialog ?: return inflate

        val window = dialog.window ?: return inflate
        window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        isCancelable = false
        return inflate
    }

    override fun dismiss() {
        if (fragmentManager == null) {
            return
        }
        super.dismiss()
    }

    override fun onDismiss(dialog: DialogInterface?) {
        if (fragmentManager == null) {
            return
        }
        super.onDismiss(dialog)
    }

    override fun dismissAllowingStateLoss() {
        if (fragmentManager == null) {
            return
        }
        super.dismissAllowingStateLoss()
    }

    override fun show(manager: FragmentManager, tag: String) {
        if (isAdded)
            return

        super.show(manager, tag)
    }
}
