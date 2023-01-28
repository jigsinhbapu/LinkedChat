package com.example.linkedchat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.linkedchat.databinding.ActivityRegistrationBinding

class registration : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val Button2 = findViewById<Button>(R.id.submitbtn)
        Button2.setOnClickListener() {
            Intent(this, MainActivity ::class.java).also { startActivity(it) }

            var toast = Toast.makeText(this, "you are successfully Login", Toast.LENGTH_LONG)
            toast.show()
        }
        var alreadyHaveaccount = findViewById<TextView>(R.id.alreadyhaveaccount)
        alreadyHaveaccount.setOnClickListener()
        {
           Intent(this,MainActivity::class.java).also{ startActivity(it) }
            alreadyHaveaccount.movementMethod = LinkMovementMethod.getInstance();
        }

    }
}
