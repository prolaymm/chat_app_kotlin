package com.norgianking.chatapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.R
import com.norgianking.chatapp.adapter.view_holder.SingleUserAllMessageViewHolder
import com.norgianking.chatapp.data.vos.AllMessage

class SingleUserChatMessageRecyclerAdapter : RecyclerView.Adapter<SingleUserAllMessageViewHolder>()  {

    private var mMessageList: MutableList<AllMessage> = ArrayList()
     var currentMessage: AllMessage? = null
    private lateinit var  rootView : View
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SingleUserAllMessageViewHolder {



             rootView = LayoutInflater.from(parent.context).inflate(R.layout.sender_chat_message_item,parent,false)



        return  SingleUserAllMessageViewHolder(rootView)
    }

    override fun onBindViewHolder(holder: SingleUserAllMessageViewHolder, position: Int) {

      //  val vo : AllMessage = mMessageList[position]

     //   currentMessage = vo

    }

    override fun getItemCount(): Int {

        return  10
    }



    fun setAllMessage(allMessage : List<AllMessage>) {

        mMessageList = allMessage as ArrayList<AllMessage>
        notifyDataSetChanged()

    }
}