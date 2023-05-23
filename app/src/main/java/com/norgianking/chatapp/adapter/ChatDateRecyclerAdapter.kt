package com.norgianking.chatapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.R
import com.norgianking.chatapp.adapter.view_holder.ChatDateViewHolder
import com.norgianking.chatapp.data.vos.MessageVo

class ChatDateRecyclerAdapter : RecyclerView.Adapter<ChatDateViewHolder>() {


    lateinit var context : Context
    private var mMessageList: MutableList<MessageVo> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatDateViewHolder {


        context = parent.context
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.all_chat_for_date_recycler_item,parent,false)
        return  ChatDateViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: ChatDateViewHolder, position: Int) {


        val adapter : SingleUserChatMessageRecyclerAdapter = SingleUserChatMessageRecyclerAdapter()
        holder.messageRecyclerView.layoutManager = LinearLayoutManager(context)
        holder.messageRecyclerView.adapter = adapter

        mMessageList[position].allMessage?.let { adapter.setAllMessage(it) }

        holder.dateText.text = mMessageList[position].date
    }

    override fun getItemCount(): Int {

        return  mMessageList.size
    }


    fun setAllMessage(allMessage : List<MessageVo>) {

        mMessageList = allMessage as ArrayList<MessageVo>
        notifyDataSetChanged()

    }

}