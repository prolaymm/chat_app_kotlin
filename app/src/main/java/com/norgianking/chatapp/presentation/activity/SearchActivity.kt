package com.norgianking.chatapp.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.Adapter.RecentUserChatRecyclerAdapter
import com.norgianking.chatapp.R
import com.norgianking.chatapp.data.vos.ChatUserVo

class SearchActivity : AppCompatActivity() {

    lateinit var  userChatRecyclerView : RecyclerView

   lateinit var recyclerAdapter:  RecentUserChatRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)


        userChatRecyclerView = findViewById(R.id.recycler_view_recent_search)


        recyclerAdapter  = RecentUserChatRecyclerAdapter()
        userChatRecyclerView.layoutManager = LinearLayoutManager(this)
        userChatRecyclerView.adapter = recyclerAdapter

        var arrayList = ArrayList<ChatUserVo>()

        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        recyclerAdapter.setUsers(arrayList)
    }
}