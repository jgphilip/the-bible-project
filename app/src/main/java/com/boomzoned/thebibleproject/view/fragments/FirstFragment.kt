package com.boomzoned.thebibleproject.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.boomzoned.thebibleproject.R
import com.boomzoned.thebibleproject.view.adapters.BibleBooksListAdapter
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    val booksOfTheBible: ArrayList<String> = ArrayList()
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: BibleBooksListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        linearLayoutManager = LinearLayoutManager(activity)
        recyclerview_biblebooks.layoutManager = linearLayoutManager
        setBibleBooks()
        adapter = BibleBooksListAdapter(booksOfTheBible)
        adapter.notifyDataSetChanged()
        recyclerview_biblebooks.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }

    /**
     * sets the books
     */
    fun setBibleBooks() {
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
