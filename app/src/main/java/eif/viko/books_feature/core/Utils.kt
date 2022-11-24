package eif.viko.books_feature.core

import android.util.Log
import eif.viko.books_feature.core.Constants.TAG

class Utils {
    companion object {
        fun print(e: Exception?) {
            Log.e(TAG, e?.message ?: e.toString())
        }
    }
}