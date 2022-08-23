package com.insidecoderz.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.insidecoderz.viewmodel.factory.MainViewModelFactory
import com.insidecoderz.viewmodel.models.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var txt:TextView

    lateinit var mainViewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this,MainViewModelFactory(10))[MainViewModel::class.java]
        //ViewModelProvide see the behaviour of lifecycle which is in "(this)"
        //After that we are getting the data using get method and under the bracket we have the arguments which is the reference class model
        txt=findViewById(R.id.textView)
    }

    fun setText() {
        txt.text = mainViewModel.count.toString()
    }

    fun btn(v:View) {
        mainViewModel.increaseValue()
        setText()
    }
}