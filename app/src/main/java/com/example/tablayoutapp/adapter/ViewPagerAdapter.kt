package com.example.tablayoutapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutapp.BookFragment
import com.example.tablayoutapp.GameFragment
import com.example.tablayoutapp.MovieFragment
import com.example.tablayoutapp.SportFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 ->return BookFragment()
            1->return  GameFragment()
            2->return SportFragment()
        }
        return MovieFragment()
    }

}