package com.norgianking.chatapp.presentation.fragment

import DiscoverListAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.norgianking.chatapp.R
import com.norgianking.chatapp.data.vos.DiscoverVo
import com.norgianking.chatapp.utils.mUserList


class FragmentDiscovery : Fragment() {


    lateinit var discoverListView : ListView

    var mDiscoverList : MutableList<DiscoverVo> = arrayListOf(
        DiscoverVo("Discover",R.drawable.ic_moment),
        DiscoverVo("Discover",R.drawable.ic_upload_moment),
        DiscoverVo("Discover",R.drawable.ic_nearby),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_discovery, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        discoverListView = view.findViewById(R.id.list_view_discover)

        val listAdapter = DiscoverListAdapter(view.context)

        discoverListView = view.findViewById(R.id.list_view_discover)
        discoverListView.adapter = listAdapter

        listAdapter.setUsers(mDiscoverList)


    }


}