package com.example.agromain


import android.content.Intent
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.os.Bundle
import android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Inisialisasi view
        val loginEmail = findViewById<EditText>(R.id.loginEmail)
        val loginPassword = findViewById<EditText>(R.id.loginPassword)
        val loginRememberMe = findViewById<CheckBox>(R.id.loginRememberMe)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val loginForgotPassword = findViewById<TextView>(R.id.loginForgotPassword)
        val loginRedirect = findViewById<TextView>(R.id.LoginRedirect)
        val klikRegister = findViewById<TextView>(R.id.klikRegister)


        loginButton.setOnClickListener {
            val email = loginEmail.text.toString()
            val password = loginPassword.text.toString()
            val rememberMe = loginRememberMe.isChecked

            if (email.isNotEmpty() && password.isNotEmpty()) {

                if (rememberMe) {

                    val sharedPreferences = getSharedPreferences("MyAppPrefs", MODE_PRIVATE)
                    val editor = sharedPreferences.edit()
                    editor.putString("EMAIL", email)
                    editor.putBoolean("REMEMBER_ME", true)
                    editor.apply()
                }

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }
        }


        loginForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }


        loginRedirect.setOnClickListener {
            loginRedirect.setOnClickListener {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }
        }

        klikRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}