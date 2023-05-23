package com.norgianking.chatapp.adapter.view_holder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.R

class ChatDateViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val messageRecyclerView : RecyclerView  = itemView.findViewById(R.id.recycler_view_message_date)
    val dateText : TextView = itemView.findViewById(R.id.text_view_chat_date)

}