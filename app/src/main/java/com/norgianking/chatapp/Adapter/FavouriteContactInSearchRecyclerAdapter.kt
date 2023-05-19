package com.norgianking.chatapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.norgianking.chatapp.Adapter.view_holder.FavouriteContactInSearchViewHolder
import com.norgianking.chatapp.R
import com.norgianking.chatapp.data.vos.ChatUserVo

class FavouriteContactInSearchRecyclerAdapter : RecyclerView.Adapter<FavouriteContactInSearchViewHolder> (){

    var mChatUserList : MutableList<ChatUserVo> = ArrayList()

    lateinit var  context: Context
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FavouriteContactInSearchViewHolder {

        context = parent.context
        return  FavouriteContactInSearchViewHolder(LayoutInflater.from(context).inflate(R.layout.fav_contact_in_search,parent,false))
    }

    override fun onBindViewHolder(holder: FavouriteContactInSearchViewHolder, position: Int) {
        val chatUserVo: ChatUserVo = mChatUserList[position]
        holder.userProfile.clipToOutline = true
        Glide.with(context).load(chatUserVo.imageUrl).into(holder.userProfile)
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