package com.norgianking.chatapp.presentation.fragment

import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.ImageView
import android.widget.Toast
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.norgianking.chatapp.adapter.RecentUserChatRecyclerAdapter
import com.norgianking.chatapp.R
import com.norgianking.chatapp.presentation.activity.SearchActivity
import com.norgianking.chatapp.utils.mUserList

class FragmentChat : Fragment() {


    lateinit var toolbar: Toolbar
    lateinit var floatingActionButton: FloatingActionButton
    lateinit var  userChatRecyclerView : RecyclerView
    lateinit var searchImageView: ImageView

    lateinit var recyclerAdapter: RecentUserChatRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        floatingActionButton = view.findViewById(R.id.chat_floating_action_button)
        userChatRecyclerView = view.findViewById(R.id.user_chat_recycler_view)
        searchImageView = view.findViewById(R.id.search_icon_chat)
        recyclerAdapter  = RecentUserChatRecyclerAdapter()
        userChatRecyclerView.layoutManager = LinearLayoutManager(view.context)
        userChatRecyclerView.adapter = recyclerAdapter

        recyclerAdapter.setUsers(mUserList)

        searchImageView.setOnClickListener{

            val intent : Intent = Intent(view.context,SearchActivity::class.java)

            startActivity(intent)
        }

        floatingActionButton.setOnClickListener{
            Toast.makeText(view.context,"Hello world",Toast.LENGTH_SHORT).show()
        }
    }



}


