package com.example.Tutorial_Earningmoney.LoginUI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle import com.example.Tutorial_Earningmoney.databinding.ActivityRegisterBinding
import com.example.Tutorial_Earningmoney.fragments.HomeActivity

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogIn.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
            binding.btnNext.setOnClickListener {
                startActivity(Intent(this,HomeActivity::class.java))
                finish()
            }
        }
    }
}