package com.example.weekfourtask_2

import com.example.weekfourtask_2.model.CardModel

class DebitCardList {
    open var debitCardList = cardList()

    fun cardList(): ArrayList<CardModel>{
        val cardList = ArrayList<CardModel>()


        cardList.add(CardModel("Ola", "23,456,78.00", R.color.lightGreenColor))
        cardList.add(CardModel("Darot", "43,456,78.00", R.color.red))
        cardList.add(CardModel("Dapo", "33,456,78.00", R.color.lightPinkColor))
        cardList.add(CardModel("Jesse", "53,456,78.00", R.color.black))
        cardList.add(CardModel("Emma", "63,456,78.00", R.color.lightGreenColor))
        return cardList
    }
}