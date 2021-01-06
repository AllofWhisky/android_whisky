package com.example.whiskysample.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.set
import androidx.recyclerview.widget.RecyclerView
import com.example.whiskysample.R
import com.example.whiskysample.data.model.User
import com.example.whiskysample.data.repository.local.AppDatabase
import java.util.*
import kotlin.random.Random

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val appDatabase = AppDatabase.getInstance(this)

        val input = findViewById<EditText>(R.id.edit_input)
        val textView = findViewById<TextView>(R.id.text_user)
        findViewById<Button>(R.id.button_save).setOnClickListener {
            if (input.text.toString().isNotEmpty()) {
                val id = Random(0).nextInt(1000)
                val text = input.text.toString()
                kotlin.run { appDatabase?.userDao()?.insertAll(User(id, text, text)) }
                textView.append(id.toString())
                textView.append(text)
                textView.append(text)
                input.text.clear()
            }
        }

        textView.text = appDatabase?.userDao()?.getAll().toString()

    }
}