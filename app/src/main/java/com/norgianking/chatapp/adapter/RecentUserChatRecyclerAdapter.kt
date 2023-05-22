package com.norgianking.chatapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.norgianking.chatapp.adapter.view_holder.UserRecentChatViewHolder
import com.norgianking.chatapp.R
import com.norgianking.chatapp.data.vos.ChatUserVo


class RecentUserChatRecyclerAdapter :
    RecyclerView.Adapter<UserRecentChatViewHolder>() {

     var  userChatList : MutableList<ChatUserVo> = ArrayList()

    lateinit var  context : Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserRecentChatViewHolder {

        context = parent.context
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recent_user_chat,parent,false)
        return  UserRecentChatViewHolder(inflater)
    }

    override fun getItemCount(): Int {
       return  userChatList.size
    }

    fun setUsers(chat: List<ChatUserVo>) {
        userChatList = chat as ArrayList<ChatUserVo>
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: UserRecentChatViewHolder, position: Int) {
        val vo  : ChatUserVo=  userChatList[position]
        holder.userName.text = vo.userName
        holder.profileImage.clipToOutline = true
        Glide.with(context).load(vo.imageUrl).into(holder.profileImage)
    }
}