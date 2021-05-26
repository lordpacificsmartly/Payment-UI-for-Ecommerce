package com.example.weekfourtask_2

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.weekfourtask_2.R
import com.example.weekfourtask_2.view.*
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

//    private val channelId = "Lordpacific"
//    private lateinit var fragmentTransaction: FragmentTransaction
//
//
//    private val productsFragment = ProductsFragment()
//    private val paymentsFragment = PaymentsFragment()
//    private val historyFragment = HistoryFragment()
//    private val supportFragment = SupportFragment()
//    private val moreFragment = MoreFragment()
//
//    private fun replaceFragment(fragment: Fragment) {
//        if (fragment != null){
//            val transaction = supportFragmentManager.beginTransaction()
//            transaction.replace(R.id.fragment_container, fragment)
//            transaction.commit()
//        }
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        replaceFragment(productsFragment)
//
//
//        val navigationButton = findViewById<BottomNavigationView>(R.id.bottom_navigation)
//
//        navigationButton.setOnNavigationItemSelectedListener {
//            when(it.itemId){
//                R.id.mProducts -> replaceFragment(productsFragment)
//                R.id.mPayments -> replaceFragment(paymentsFragment)
//                R.id.mHistory -> replaceFragment(historyFragment)
//                R.id.mSupport -> replaceFragment(supportFragment)
//                R.id.mMore -> replaceFragment(moreFragment)
//            }
//            true
//        }
//
//
//    }
}