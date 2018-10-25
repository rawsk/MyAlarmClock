package sample.myalarmclock

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.support.v4.app.DialogFragment
import org.jetbrains.anko.toast

class SimpleAlertDialog: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val context = context
        if (context == null)
            return super.onCreateDialog(savedInstanceState)
        val builder = AlertDialog.Builder(context).apply {
            setMessage("時間になりました")
            setPositiveButton("起きる") { dialog, which ->
                context.toast("「起きる」がクリックされました")
            }
            setNegativeButton("あと5分") { dialog, which ->
                context.toast("「あと5分」がクリックされました")
            }
        }
        return builder.create()
    }
}
