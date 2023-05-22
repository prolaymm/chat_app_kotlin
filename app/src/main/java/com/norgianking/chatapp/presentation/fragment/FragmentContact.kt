package com.norgianking.chatapp.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.norgianking.chatapp.adapter.FavouriteContactInSearchRecyclerAdapter
import com.norgianking.chatapp.R
import com.norgianking.chatapp.utils.mUserList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentContact.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentContact : Fragment() {



    lateinit var  favouriteContactRecyclerView : RecyclerView
    lateinit var favouriteContactInSearchRecyclerAdapter: FavouriteContactInSearchRecyclerAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        favouriteContactRecyclerView = view.findViewById(R.id.recycler_view_search_favourite)

        favouriteContactInSearchRecyclerAdapter = FavouriteContactInSearchRecyclerAdapter()
        favouriteContactRecyclerView.layoutManager = LinearLayoutManager(view.context,LinearLayoutManager.HORIZONTAL,true)

        favouriteContactRecyclerView.adapter  = favouriteContactInSearchRecyclerAdapter




        favouriteContactInSearchRecyclerAdapter.setUsers(mUserList)

    }


}