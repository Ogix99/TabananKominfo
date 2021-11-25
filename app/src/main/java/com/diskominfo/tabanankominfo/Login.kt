package com.diskominfo.tabanankominfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnlogin.setOnClickListener {
            val a = username.text.toString()
            if(username.text.toString().isEmpty()) {
                username.setError("Masukkan Username Terlebih Dahulu")
            }else if (password.text.toString().isEmpty()){
                    password.setError("Isi Password Dulu")
            }else if (username.text.toString() != "yoga" && password.text.toString() != "123"){
                Toast.makeText(this, "Username & Password Salah", Toast.LENGTH_SHORT).show()

            }

            else if (username.text.toString()=="yoga" && password.text.toString()=="123"){

                val data = Intent(this, MainActivity::class.java)
                data.putExtra("username", username.text.toString())
                startActivity(data)
            }





                }


            }


}