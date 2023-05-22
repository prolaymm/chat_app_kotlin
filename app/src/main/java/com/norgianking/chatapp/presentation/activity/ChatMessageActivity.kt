package com.norgianking.chatapp.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar;
import com.norgianking.chatapp.R

class ChatMessageActivity : AppCompatActivity() {

    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_message)
        toolbar = findViewById(R.id.tool_bar_message)
        toolbar.title = ""

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

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