package com.example.whiskysample.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.whiskysample.R
import com.example.whiskysample.data.model.UserEntity
import com.example.whiskysample.data.repository.local.AppDatabase
import java.util.*

class LoginActivity : AppCompatActivity() {
    var db : AppDatabase? = null
    var contactsList = mutableListOf<UserEntity>()
    val TAG : String = "LoginActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        db = AppDatabase.getInstance(this)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val mPlusButton = findViewById<Button>(R.id.mPlusButton)
        val saveUserList = db!!.userDao().getAll()
        if (saveUserList.isNotEmpty()) {
            contactsList.addAll(saveUserList)
        }

    }
}