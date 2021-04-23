package com.example.t_baymessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth

class MessageListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_list)

        val id = FirebaseAuth.getInstance().uid
        if (id==null)
        {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}