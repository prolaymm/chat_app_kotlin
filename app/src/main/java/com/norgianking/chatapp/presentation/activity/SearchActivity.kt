package com.norgianking.chatapp.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.adapter.FavouriteContactInSearchRecyclerAdapter
import com.norgianking.chatapp.adapter.RecentUserChatRecyclerAdapter
import com.norgianking.chatapp.adapter.RecentUserSearchRecyclerAdapter
import com.norgianking.chatapp.R
import com.norgianking.chatapp.data.vos.ChatUserVo
import com.norgianking.chatapp.utils.mUserList

class SearchActivity : AppCompatActivity() {

    private lateinit var  userChatRecyclerView : RecyclerView
    lateinit var  favouriteContactRecyclerView : RecyclerView
    lateinit var favouriteContactInSearchRecyclerAdapter: FavouriteContactInSearchRecyclerAdapter
   private lateinit var recyclerAdapter:  RecentUserSearchRecyclerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    //    delegate.applyDayNight()
        setContentView(R.layout.activity_search)


        userChatRecyclerView = findViewById(R.id.recycler_view_recent_search)
        favouriteContactRecyclerView = findViewById(R.id.recycler_view_search_favourite)



        recyclerAdapter  = RecentUserSearchRecyclerAdapter()
        favouriteContactInSearchRecyclerAdapter  = FavouriteContactInSearchRecyclerAdapter()
        userChatRecyclerView.layoutManager = LinearLayoutManager(this)
        favouriteContactRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true)
        userChatRecyclerView.adapter = recyclerAdapter
        favouriteContactRecyclerView.adapter = favouriteContactInSearchRecyclerAdapter

        recyclerAdapter.setUsers(mUserList)
        favouriteContactInSearchRecyclerAdapter.setUsers(mUserList)
    }
}