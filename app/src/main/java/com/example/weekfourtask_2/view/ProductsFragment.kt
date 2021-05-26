package com.example.weekfourtask_2.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.example.weekfourtask_2.DebitCardList
import com.example.weekfourtask_2.R
import com.example.weekfourtask_2.adapter.ViewPagerAdapter


/**
 * A simple [Fragment] subclass.
 * Use the [ProductsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProductsFragment : Fragment() {

    val debitCrdList = DebitCardList()

    private lateinit var viewPager2: ViewPager2
    private lateinit var debitAdapter: ViewPagerAdapter



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_products, container, false)

        viewPager2 = view.findViewById(R.id.viewPager2)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cardView()
    }

    private fun cardView(){
        val debitCard = debitCrdList.debitCardList

        debitAdapter = ViewPagerAdapter(debitCard)

        viewPager2.apply {
            adapter = debitAdapter
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 2
            setPadding(150, 0, 150, 0)
        }
        val marginPageTransformer = MarginPageTransformer(30)
        val compositePageTransformer = CompositePageTransformer()
        compositePageTransformer.addTransformer(compositePageTransformer)
        compositePageTransformer.addTransformer { page, position ->
            page.scaleY = 1 - (0.25f * kotlin.math.abs(position))
        }
        viewPager2.setPageTransformer(compositePageTransformer)
    }

}