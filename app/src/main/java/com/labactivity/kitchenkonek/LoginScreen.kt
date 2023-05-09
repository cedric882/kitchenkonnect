
package com.labactivity.kitchenkonek

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.labactivity.kitchenkonek.databinding.LoginscreenlayoutBinding
import java.io.File
import java.util.regex.*;

class LoginScreen : AppCompatActivity() {
    var credentialOfUser: credentialOfUser = credentialOfUser()
    private lateinit var binding: LoginscreenlayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginscreenlayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener()
        {
            val username = binding.usernameEditTxt.text.toString().trim()
            val password = binding.passwordEditTxt.text.toString().trim()



            if (username.isEmpty() || password.isEmpty())
            {
                Toast.makeText(this, "Please Enter Username and/or Password", Toast.LENGTH_SHORT).show()
            }

            else if (username.equals(credentialOfUser.username) && password.equals(credentialOfUser.password))
            {
                val i = Intent(this, MainActivity::class.java)
                startActivity(i)
                finish()
                Toast.makeText(this, "Logging in...", Toast.LENGTH_SHORT).show()

            }
            else
            {
                Toast.makeText(this, "Invalid Username and Password", Toast.LENGTH_SHORT).show()
            }



        }
    }
}



