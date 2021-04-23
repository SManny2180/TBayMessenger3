package com.example.t_baymessenger
import android.content.Intent
import android.os.Bundle
import android.util.Log

import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_activity.*

class LoginActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val username = signin_username.text.toString()
        val password = signin_password.text.toString()

        signin_button.setOnClickListener{
            Log.d("LoginActivity","tried to login in with $username")
            FirebaseAuth.getInstance().signInWithEmailAndPassword(username,password)
                .addOnCompleteListener{
                    if(!it.isSuccessful)
                    {
                        return@addOnCompleteListener
                    }
                    else{
                        val intent = Intent(this,MessageListActivity::class.java)
                        startActivity(intent)


                    }


                }


        }
    }
}