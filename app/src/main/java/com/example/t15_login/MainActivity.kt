package com.example.t15_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.t15_login.dataBase.userPass
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {

            val userName = etUserName.text.toString()
            val password = etPasswort.text.toString()

            for (userName2 in userPass) {
                if (userName2.userName == userName && password == userName2.password) {
                    val intent = Intent(this, SecondActivity::class.java)
                    val bundle=Bundle()
                    bundle.putString("userName",userName)
                    bundle.putString("password",password)
                    intent.putExtra("data",bundle)
                    startActivity(intent)
                } else{
                    tvError.visibility = View.VISIBLE
                    Toast.makeText(this, "Username or password is wrong", Toast.LENGTH_LONG).show()
                }
            }

        }
        imgBack.setOnClickListener{
            finish()
        }

    }
}