package com.example.linkedchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
import com.example.linkedchat.databinding.ActivityHomepageBinding
import com.example.linkedchat.databinding.ActivityMainBinding

class homepage : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fun onCreateOptionsMenu(menu: Menu):Boolean{

            menuInflater.inflate(R.menu.optionmenu,menu)
            return  super.onCreateOptionsMenu(menu)
        }
    }
}