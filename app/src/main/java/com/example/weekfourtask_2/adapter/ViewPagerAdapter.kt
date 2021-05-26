package com.example.weekfourtask_2.adapter

import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.weekfourtask_2.DebitCardList
import com.example.weekfourtask_2.R
import com.example.weekfourtask_2.model.CardModel


class ViewPagerAdapter (private var cardList: ArrayList<CardModel>): RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>(){

    inner class ViewPagerViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_pager_item, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int {
       return cardList.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.itemView.apply {
            val debitCardList = cardList[position]

            val debitCardListName = findViewById<TextView>(R.id.textView2)
            val debitCardListBalance = findViewById<TextView>(R.id.textView17)
            val debitCardListColor = findViewById<ConstraintLayout>(R.id.constraint)

            debitCardListName.text = debitCardList.name
            debitCardListBalance.text = debitCardList.balance
            debitCardListColor.setBackgroundColor(cardList[position].color)



        }
    }

}
