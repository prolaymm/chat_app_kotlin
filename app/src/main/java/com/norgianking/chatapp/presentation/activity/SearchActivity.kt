package com.norgianking.chatapp.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.Adapter.FavouriteContactInSearchRecyclerAdapter
import com.norgianking.chatapp.Adapter.RecentUserChatRecyclerAdapter
import com.norgianking.chatapp.Adapter.RecentUserSearchRecyclerAdapter
import com.norgianking.chatapp.R
import com.norgianking.chatapp.data.vos.ChatUserVo

class SearchActivity : AppCompatActivity() {

    private lateinit var  userChatRecyclerView : RecyclerView
    lateinit var  favouriteContactRecyclerView : RecyclerView

   private lateinit var recyclerAdapter:  RecentUserSearchRecyclerAdapter
   lateinit var favouriteContactInSearchRecyclerAdapter: FavouriteContactInSearchRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)


        userChatRecyclerView = findViewById(R.id.recycler_view_recent_search)
        favouriteContactRecyclerView = findViewById(R.id.recycler_view_search_favourite)



        recyclerAdapter  = RecentUserSearchRecyclerAdapter()
        favouriteContactInSearchRecyclerAdapter  = FavouriteContactInSearchRecyclerAdapter()
        userChatRecyclerView.layoutManager = LinearLayoutManager(this)
        favouriteContactRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        userChatRecyclerView.adapter = recyclerAdapter
        favouriteContactRecyclerView.adapter = favouriteContactInSearchRecyclerAdapter

        var arrayList = ArrayList<ChatUserVo>()

        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        recyclerAdapter.setUsers(arrayList)
        favouriteContactInSearchRecyclerAdapter.setUsers(arrayList)
    }
}