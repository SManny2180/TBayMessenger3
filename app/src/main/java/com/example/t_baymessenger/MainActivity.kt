package com.example.t_baymessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        register_button.setOnClickListener{
            val username = registration_username.text.toString()
            val password = registration_password.text.toString()

            Log.d("RegistrationUsername","Username is $username" )
            Log.d("RegistrationPassword","Username is $password" )

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(username,password)
                .addOnCompleteListener{
                   if(!it.isSuccessful){
                       return@addOnCompleteListener
                   }
                    Log.d("RegistrationPage","Created user with id: ${it.result?.user?.uid} ")
                }


            register_tosignin_button.setOnClickListener{
                Log.d("RegistrationPage","switch to login screen")
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
            }

        }


    }

}