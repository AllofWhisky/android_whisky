package com.example.whiskysample.ui.community

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//@Database(entities = [CommunityContact::class], version = 1)
abstract class CommunityDatabase: RoomDatabase(){

    abstract fun communityDao():CommunityDao

    companion object {
        private var INSTANCE: CommunityDatabase? = null

        fun getInstance(context: Context): CommunityDatabase? {
            if (INSTANCE == null) {
                synchronized(CommunityDatabase::class){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        CommunityDatabase::class.java, "communityContact")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}