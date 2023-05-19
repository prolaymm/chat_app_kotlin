package com.norgianking.chatapp.Adapter.view_holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.R

class RecentUserSearchViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val profileImageView: ImageView = view.findViewById(R.id.image_view_recent_search_profile)
    val userName : TextView = view.findViewById(R.id.text_view_recent_search_user_name)
    val deleteBtn : ImageView = view.findViewById(R.id.image_view_recent_search_delete)

}