package com.example.t_baymessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_message_list.*

class MessageListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_list)

        new_message.setOnClickListener{
            val intent = Intent(this,SendNewMessage::class.java)
            startActivity(intent)
        }
        signout_button.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        val id = FirebaseAuth.getInstance().uid
        if (id==null)
        {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}