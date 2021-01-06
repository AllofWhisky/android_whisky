package com.example.whiskysample.data.repository.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.whiskysample.data.model.User
import com.example.whiskysample.data.model.UserDao

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context): AppDatabase? {
            if (instance == null) {
                instance = Room.databaseBuilder(context.applicationContext, AppDatabase::class.java, "database-user")
                    .allowMainThreadQueries()
                    .build()
            }
            return instance
        }

        fun destroyInstance() {
            instance = null
        }
    }
}