package com.example.agromain

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val registerUsername = findViewById<EditText>(R.id.registerUsername)
        val registerEmail = findViewById<EditText>(R.id.registerEmail)
        val registerPassword = findViewById<EditText>(R.id.registerPassword)
        val registerBirthday = findViewById<EditText>(R.id.registerBirthday)
        val registerGender = findViewById<AutoCompleteTextView>(R.id.registerGender)
        val registerButton = findViewById<Button>(R.id.registerButton)
        val loginRedirect = findViewById<TextView>(R.id.LoginRedirect)
        val klikLogin = findViewById<TextView>(R.id.klikLogin)

        val genderItems = listOf("Male", "Female", "Other")
        val genderAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, genderItems)
        registerGender.setAdapter(genderAdapter)

        registerButton.setOnClickListener {
            val username = registerUsername.text.toString()
            val email = registerEmail.text.toString()
            val password = registerPassword.text.toString()
            val birthday = registerBirthday.text.toString()
            val gender = registerGender.text.toString()

        }

        loginRedirect.setOnClickListener {

        }

        klikLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        }

        fun onTextViewClick(view: View) {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }