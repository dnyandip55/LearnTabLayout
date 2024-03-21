package com.example.tablayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayoutapp.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val tabArray= arrayOf("Books","Games","Sport","Movies")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val  viewPager=findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout=findViewById<TabLayout>(R.id.tabLayout)


        val my_adapter=ViewPagerAdapter(
            supportFragmentManager,
            lifecycle
        )
        viewPager.adapter=my_adapter

        //connecting view pager with tab layout

        TabLayoutMediator(tabLayout,viewPager){
            tab,position->tab.text=tabArray[position]
        }.attach()
    }
}