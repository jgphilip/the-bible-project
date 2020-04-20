package com.boomzoned.thebibleproject.view.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.boomzoned.thebibleproject.R
import com.boomzoned.thebibleproject.view.adapters.BibleBooksListAdapter
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    val booksOfTheBible : ArrayList<String> = ArrayList()

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mContext : Context = context
        addBibleBooks()
        recyclerview_biblebooks.layoutManager = LinearLayoutManager(context)
        recyclerview_biblebooks.adapter =  BibleBooksListAdapter(booksOfTheBible, context)
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        view.findViewById<Button>(R.id.button_first).setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
    }

    fun addBibleBooks(){
        booksOfTheBible.add("Matthew")
        booksOfTheBible.add("Mark")
        booksOfTheBible.add("Luke")
        booksOfTheBible.add("John")
    }
}
