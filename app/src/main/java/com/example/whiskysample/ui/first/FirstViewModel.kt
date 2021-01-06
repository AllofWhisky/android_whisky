package com.example.whiskysample.ui.first

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.whiskysample.ui.community.CommunityContact
import com.example.whiskysample.ui.community.CommunityRepository

class FirstViewModel(application: Application) : AndroidViewModel(application) {
//
//    private val repository = CommunityRepository(application)
//    private val communityContacts = repository.getAll()
//
//    fun getAll(): LiveData<List<CommunityContact>>{
//        return this.communityContacts
//    }
//
//    fun insert(communityContact: CommunityContact){
//        repository.insert(communityContact)
//    }
//
//    fun delete(communityContact: CommunityContact){
//        repository.delete(communityContact)
//    }

    private val _text = MutableLiveData<String>().apply {
        value = "This is first Fragment"
    }
    val text: LiveData<String> = _text
}