package com.norgianking.chatapp.presentation.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.R
import com.norgianking.chatapp.adapter.ChatDateRecyclerAdapter
import com.norgianking.chatapp.utils.mMessageList

class ChatMessageActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    lateinit var messageRecyclerView: RecyclerView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_message)
        toolbar = findViewById(R.id.tool_bar_message)
        messageRecyclerView = findViewById(R.id.recycler_view_single_user_message)
        toolbar.title = ""
        setSupportActionBar(toolbar)


        val  adapter  : ChatDateRecyclerAdapter=  ChatDateRecyclerAdapter()

        messageRecyclerView.layoutManager = LinearLayoutManager(this)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        messageRecyclerView.adapter = adapter

        adapter.setAllMessage(mMessageList)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
          menuInflater.inflate(R.menu.bottom_nav_main_menu,menu)
        return  true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return  when(item.itemId) {
            R.id.me_fragment -> {
                Toast.makeText(applicationContext, "click on share", Toast.LENGTH_LONG).show()
                return true
            }
            else ->   super.onOptionsItemSelected(item)
        }
    }
}