package com.norgianking.chatapp.adapter.view_holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.R

class FavouriteContactInSearchViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {


    val userProfile : ImageView= itemView.findViewById(R.id.image_view_search_fav_profile)
    val userName : TextView= itemView.findViewById(R.id.text_view_search_fav_user_name)
}