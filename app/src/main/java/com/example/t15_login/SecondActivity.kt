package com.example.t15_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Toast.makeText(this, "WELCOME", Toast.LENGTH_LONG).show()

        val data = intent.getBundleExtra("data")
        if (data != null) {
            tvShowPass.text = "Your user name =" + data.getString("userName") +
                    "\n Your password =" + data.getString("password")

            imgBackSecond.setOnClickListener {
                val intent2 = Intent(this,MainActivity::class.java)
                startActivity(intent2)
            }
        }
    }
}