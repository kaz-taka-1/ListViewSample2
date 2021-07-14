package com.websarva.wings.android.listviewsample2

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.appcompat.app.AlertDialog
import java.lang.IllegalStateException

class OrderConfirmDialogFragment : DialogFragment(){
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val  dialog = activity?.let{
            val builder = AlertDialog.Builder(it)
            builder.setTitle(R.string.dialog_title)
            builder.setMessage(R.string.dialog_msg)
            builder.setPositiveButton(R.string.dialog_btn_ok,DialogButtonClickListener())
            builder.setPositiveButton(R.string.dialog_btn_ng,DialogButtonClickListener())
            builder.setPositiveButton(R.string.dialog_btn_nu,DialogButtonClickListener())
            builder.create()
        }
        return dialog ?: throw IllegalStateException("アクティビティがnullです")
    }
}