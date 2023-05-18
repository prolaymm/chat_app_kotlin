package com.norgianking.chatapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.norgianking.chatapp.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var  navigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        navigationView = findViewById(R.id.mainBottomNavigationView)
        loadFragment(FragmentChat())

        navigationView.selectedItemId = R.id.chat_fragment
        navigationView.setOnItemSelectedListener {

            handleBottomNavigation(it.itemId)

        }
    }

    private fun handleBottomNavigation(
        menuItemId: Int
    ): Boolean = when(menuItemId) {
        R.id.chat_fragment -> {
            loadFragment(FragmentChat())
            true
        }
        R.id.call_fragment -> {
            loadFragment(FragmentChat())
            true
        }
        R.id.discovery_fragment -> {
            loadFragment(FragmentChat())
            true
        }
        R.id.contact_fragment -> {
            loadFragment(FragmentContact())
            true
        }
        R.id.me_fragment -> {
            loadFragment(FragmentMe())
            true
        }

        else -> false

    }

    private fun loadFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_nav_fragment_container,fragment)
            .commit()
    }
}