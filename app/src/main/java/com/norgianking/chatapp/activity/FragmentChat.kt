package com.norgianking.chatapp.activity

import android.os.Bundle
import android.view.*
import android.widget.Toolbar
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import com.norgianking.chatapp.R

class FragmentChat : Fragment(),MenuProvider {


    lateinit var toolbar: Toolbar
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }



    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {

    //    menuInflater.inflate(R.menu.chat_app_bar_menu,menu)

    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        return  true
    }


}


