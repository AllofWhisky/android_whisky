package com.example.whiskysample.ui.fourth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FourthViewModel {
    private val _text = MutableLiveData<String>().apply {
        value = "This is fourth Fragment"
    }
    val text: LiveData<String> = _text
}