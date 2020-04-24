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
        addBibleBooks()

//        recyclerview_biblebooks.layoutManager = LinearLayoutManager(context)
//        recyclerview_biblebooks.adapter =  BibleBooksListAdapter(booksOfTheBible, context)
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
        booksOfTheBible.add("Acts")
        booksOfTheBible.add("Romans")
        booksOfTheBible.add("1 Corinthians")
        booksOfTheBible.add("2 Corinthians")
        booksOfTheBible.add("Galatians")
        booksOfTheBible.add("Ephesians")
        booksOfTheBible.add("Philippians")
        booksOfTheBible.add("Colossians")
        booksOfTheBible.add("1 Thessalonians")
        booksOfTheBible.add("2 Thessalonians")
        booksOfTheBible.add("1 Timothy")
        booksOfTheBible.add("2 Timothy")
        booksOfTheBible.add("Titus")
        booksOfTheBible.add("Philemon")
        booksOfTheBible.add("Hebrews")
        booksOfTheBible.add("James")
        booksOfTheBible.add("1 Peter")
        booksOfTheBible.add("2 Peter")
        booksOfTheBible.add("1 John")
        booksOfTheBible.add("2 John")
        booksOfTheBible.add("3 John")
        booksOfTheBible.add("Jude")
        booksOfTheBible.add("The Revelation")
    }
}
