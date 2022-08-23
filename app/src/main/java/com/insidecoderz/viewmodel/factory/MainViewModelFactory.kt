package com.insidecoderz.viewmodel.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.insidecoderz.viewmodel.models.MainViewModel

class MainViewModelFactory(val counter:Int):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(counter) as T
    }
}