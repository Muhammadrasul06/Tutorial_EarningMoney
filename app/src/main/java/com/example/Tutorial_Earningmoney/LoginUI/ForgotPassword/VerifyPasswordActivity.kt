package com.example.Tutorial_Earningmoney.LoginUI.ForgotPassword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Tutorial_Earningmoney.R
import com.example.Tutorial_Earningmoney.databinding.ActivityVerifyPasswordBinding

class VerifyPasswordActivity : AppCompatActivity() {
    lateinit var binding: ActivityVerifyPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVerifyPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}