package com.example.agromain

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.agromain.R
import com.google.android.material.textfield.TextInputEditText

class ForgotPasswordActivity : AppCompatActivity() {

    private lateinit var textInputEditTextOldPassword: TextInputEditText
    private lateinit var textInputEditTextNewPassword: TextInputEditText
    private lateinit var textInputEditTextConfirmPassword: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        
        textInputEditTextOldPassword = findViewById(R.id.textInputEditTextOldPassword)
        textInputEditTextNewPassword = findViewById(R.id.textInputEditTextNewPassword)
        textInputEditTextConfirmPassword = findViewById(R.id.textInputEditTextConfirmPassword)

        var buttonChangePassword = null
        buttonChangePassword.setOnClickListener {

            val oldPassword = textInputEditTextOldPassword.text.toString()
            val newPassword = textInputEditTextNewPassword.text.toString()
            val confirmPassword = textInputEditTextConfirmPassword.text.toString()


            if (newPassword == confirmPassword) {

                changePassword(oldPassword, newPassword)
            } else {

                showToast("New password and confirm password do not match.")
            }
        }
    }

    private fun changePassword(oldPassword: String, newPassword: String) {

        navigateToLogin()
    }

    private fun navigateToLogin() {

        startActivity(Intent(this, LoginActivity::class.java))
        finish() // Menutup activity saat ini agar tidak dapat kembali ke halaman Forgot Password
    }

    private fun showToast(message: String) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

private fun Nothing?.setOnClickListener(function: () -> Unit) {

}
