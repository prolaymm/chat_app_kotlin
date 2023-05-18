package com.norgianking.chatapp.Adapter.view_holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.R

class UserRecentChatViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    val profileImage : ImageView = itemView.findViewById(R.id.chat_all_user_profile)
    val  userName : TextView = itemView.findViewById(R.id.recent_chat_user_name)

}