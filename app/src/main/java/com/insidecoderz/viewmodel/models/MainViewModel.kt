package com.insidecoderz.viewmodel.models
import androidx.lifecycle.ViewModel

class MainViewModel(i : Int):ViewModel() {
    var count:Int =i

    fun increaseValue() {
        count++
    }
}