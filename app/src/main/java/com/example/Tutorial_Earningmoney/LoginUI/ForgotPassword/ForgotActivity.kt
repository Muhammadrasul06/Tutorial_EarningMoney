package com.example.Tutorial_Earningmoney.LoginUI.ForgotPassword

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.utils.widget.MotionButton
import androidx.core.content.res.ResourcesCompat
import com.example.Tutorial_Earningmoney.databinding.ActivityForgotBinding
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle


class ForgotActivity : AppCompatActivity() {
    lateinit var binding: ActivityForgotBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            if (binding.edEmail.text.isNullOrEmpty()) {
                MotionToast.createToast(
                    this,
                    "Ошибка",
                    "Проверьте поле ввода, не заполнено !!",
                    MotionToastStyle.ERROR,
                    MotionToast.GRAVITY_CENTER,
                    MotionToast.LONG_DURATION,
                    ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular)
                )
            } else {
                startActivity(Intent(this, VerifyPasswordActivity:: class.java))
            }
        }

    }

    fun motional_toast_error() {
        MotionToast.createToast(
            this,
            "",
            "Profile Update Failed due to this reason",
            MotionToastStyle.ERROR,
            MotionToast.GRAVITY_BOTTOM,
            MotionToast.LONG_DURATION,
            ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular)
        )
    }

    fun motional_toast_succes() {
        MotionToast.createToast(
            this,
            "Profile saved",
            "Lorem Ipsum is simply dummy this is very simple text Lorem Ipsum is simply dummy this is very simple text Lorem Ipsum is simply dummy this is very simple text",
            MotionToastStyle.SUCCESS,
            MotionToast.GRAVITY_BOTTOM,
            MotionToast.LONG_DURATION,
            ResourcesCompat.getFont(this, www.sanju.motiontoast.R.font.helvetica_regular)
        )
    }
}