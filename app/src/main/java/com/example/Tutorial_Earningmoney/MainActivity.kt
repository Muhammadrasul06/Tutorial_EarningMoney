package com.example.Tutorial_Earningmoney

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.Tutorial_Earningmoney.LoginUI.LoginActivity
import com.example.Tutorial_Earningmoney.LoginUI.RegisterActivity
import com.example.Tutorial_Earningmoney.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogIn.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "juhtgfd", Toast.LENGTH_SHORT).show()
        }
        binding.btnSignUp.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}