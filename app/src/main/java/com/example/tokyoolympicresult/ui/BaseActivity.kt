package com.example.tokyoolympicresult.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB:ViewBinding>:AppCompatActivity(){
    abstract val Log_TAG:String
    abstract val bindingInflater:(LayoutInflater)->VB
    private var _binding:ViewBinding?=null
    protected val binding
    get() =_binding as VB?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding=bindingInflater(layoutInflater)
        setContentView(_binding?.root)
        setUp()
    }
    abstract fun setUp()

    protected fun log(value:String){
        Log.v(Log_TAG,value)
    }

}