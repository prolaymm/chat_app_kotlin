package com.norgianking.chatapp.presentation.Fragment

import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.norgianking.chatapp.Adapter.RecentUserChatRecyclerAdapter
import com.norgianking.chatapp.Adapter.view_holder.UserRecentChatViewHolder
import com.norgianking.chatapp.R
import com.norgianking.chatapp.data.vos.ChatUserVo
import javax.inject.Inject

class FragmentChat : Fragment() {


    lateinit var toolbar: Toolbar
    lateinit var floatingActionButton: FloatingActionButton
    lateinit var  userChatRecyclerView : RecyclerView

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
        recyclerAdapter  = RecentUserChatRecyclerAdapter()
        userChatRecyclerView.layoutManager = LinearLayoutManager(view.context)
        userChatRecyclerView.adapter = recyclerAdapter

        var arrayList = ArrayList<ChatUserVo>()

        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        arrayList.add(ChatUserVo("hello world","https://cdn.pixabay.com/photo/2016/11/22/21/57/apparel-1850804_960_720.jpg"))
        recyclerAdapter.setUsers(arrayList)


        floatingActionButton.setOnClickListener{
            Toast.makeText(view.context,"Hello world",Toast.LENGTH_SHORT).show()
        }
    }



}


