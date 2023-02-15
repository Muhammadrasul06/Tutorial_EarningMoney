package com.example.Tutorial_Earningmoney.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Tutorial_Earningmoney.R
import com.example.Tutorial_Earningmoney.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    var bottomNavigationView: BottomNavigationView? = null
    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        bottomNavigationView = findViewById<BottomNavigationView>(id.bottomNavigationView)
//        with(bottomNavigationView) { this!!.setBackground(null) }
        binding.bottomNavigationView.background=null
    }
}