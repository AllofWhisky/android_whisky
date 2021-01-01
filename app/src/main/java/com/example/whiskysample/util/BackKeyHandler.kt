package com.example.whiskysample.util

import android.app.Activity
import android.widget.Toast

class BackKeyHandler(private val activity: Activity) {
    private var backKeyPressTime = System.currentTimeMillis()
    private val intervalTime = 2000
    private val toast: Toast = Toast.makeText(activity, "뒤로 가기 버튼을 한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT)

    fun onBackPressed() {
        if (System.currentTimeMillis() > backKeyPressTime + intervalTime) {
            backKeyPressTime = System.currentTimeMillis();
            showToast();
            return
        }

        if (System.currentTimeMillis() <= backKeyPressTime + intervalTime) {
            activity.finish();
            toast.cancel();
        }
    }

    private fun showToast() {
        toast.show()
    }

}