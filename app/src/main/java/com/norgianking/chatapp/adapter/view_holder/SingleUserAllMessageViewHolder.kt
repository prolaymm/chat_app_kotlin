package com.norgianking.chatapp.adapter.view_holder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.R

class SingleUserAllMessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {



    val senderMessageTextView : TextView = itemView.findViewById(R.id.text_view_sender_message)
//    val receiverTextView: TextView = itemView.findViewById(R.id.text_view_receiver_message)
}