package com.example.t_baymessenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_send_new_message.*

class SendNewMessage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_new_message)

        newmessage_recycler.adapter
        newmessage_recycler.layoutManager = LinearLayoutManager(this)
    }
}