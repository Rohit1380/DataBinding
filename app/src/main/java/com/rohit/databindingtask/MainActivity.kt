package com.rohit.databindingtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rohit.databindingtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var text=0
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.number = text
        binding.activity = this

    }
    fun onMinusClick(){
        text--
        binding.number = text
    }
   fun onPlusClick(){
       text++
       binding.number=text
   }
   fun onResetClick(){
       text=0
       binding.number=text
   }

    }



