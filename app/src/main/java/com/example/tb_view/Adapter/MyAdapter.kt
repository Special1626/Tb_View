package com.example.tb_view.Adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.tabview.Fragments.Home
import com.example.tabview.Fragments.Profile
import com.example.tabview.Fragments.Settings

internal class MyAdapter(var context: Context,fm: FragmentManager, var totalTabs:Int):FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        return when(position){
            0->{
                Home()
            }
            1->{
                Profile()
            }
            2->{
                Settings()
            }else -> getItem(position)
        }
    }


}