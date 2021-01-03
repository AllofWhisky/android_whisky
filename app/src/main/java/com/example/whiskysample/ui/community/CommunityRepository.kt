package com.example.whiskysample.ui.community

import android.app.Application
import androidx.lifecycle.LiveData
import java.lang.Exception

class CommunityRepository(application: Application){

    private val communityDatabase = CommunityDatabase.getInstance(application)!!
    private val communityDao: CommunityDao = communityDatabase.communityDao()
    private val communityContacts: LiveData<List<CommunityContact>> = communityDao.getAll()

    fun getAll(): LiveData<List<CommunityContact>>{
        return communityContacts
    }

    fun insert(communityContact: CommunityContact){
        try {
            val thread = Thread(Runnable {
                communityDao.insert(communityContact)
            })
            thread.start()
        }
        catch (e:Exception){}
    }

    fun delete(communityContact: CommunityContact){
        try{
            val thread = Thread(Runnable {
                communityDao.delete(communityContact)
            })
            thread.start()
        }
        catch (e:Exception){}
    }
}