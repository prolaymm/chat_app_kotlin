package com.norgianking.chatapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.norgianking.chatapp.Adapter.view_holder.RecentUserSearchViewHolder
import com.norgianking.chatapp.R
import com.norgianking.chatapp.data.vos.ChatUserVo

class RecentUserSearchRecyclerAdapter : RecyclerView.Adapter<RecentUserSearchViewHolder>() {

    var mChatUserList : MutableList<ChatUserVo> = ArrayList()

    lateinit var  context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentUserSearchViewHolder {
        context = parent.context
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.recent_search_card,parent,false)
        return  RecentUserSearchViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: RecentUserSearchViewHolder, position: Int) {

        val chatUserVo: ChatUserVo = mChatUserList[position]
        holder.profileImageView.clipToOutline = true
        Glide.with(context).load(chatUserVo.imageUrl).into(holder.profileImageView)
        holder.userName.text = chatUserVo.userName

    }

    fun setUsers(chat: List<ChatUserVo>) {
        mChatUserList = chat as ArrayList<ChatUserVo>
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int {
        return  mChatUserList.size
    }
}