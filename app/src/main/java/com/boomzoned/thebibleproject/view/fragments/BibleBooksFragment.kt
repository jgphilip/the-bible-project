package com.boomzoned.thebibleproject.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.boomzoned.thebibleproject.R
import com.boomzoned.thebibleproject.view.adapters.BibleBooksListAdapter
import com.boomzoned.thebibleproject.view.adapters.BibleBooksListAdapterInterface
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class BibleBooksFragment : Fragment() {

    private val booksOfTheBible: ArrayList<String> = ArrayList()
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: BibleBooksListAdapter
    private val bibleBooksListAdapterInterface = object : BibleBooksListAdapterInterface {
        override fun viewHolderItemPressed(bookName: String) {
            Toast.makeText(activity, "$bookName : clicked", Toast.LENGTH_SHORT).show()
        }
    }

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
        adapter = BibleBooksListAdapter(booksOfTheBible, bibleBooksListAdapterInterface)
        adapter.notifyDataSetChanged()
        recyclerview_biblebooks.adapter = adapter
        super.onViewCreated(view, savedInstanceState)
    }

    /**
     * sets the books
     */
    fun setBibleBooks() {
        booksOfTheBible.add("Genesis")
        booksOfTheBible.add("Exodus")
        booksOfTheBible.add("Leviticus")
        booksOfTheBible.add("Numbers")
        booksOfTheBible.add("Deuteronomy")
        booksOfTheBible.add("Joshua")
        booksOfTheBible.add("Judges")
        booksOfTheBible.add("Ruth")
        booksOfTheBible.add("1 Samuel")
        booksOfTheBible.add("2 Samuel")
        booksOfTheBible.add("1 Kings")
        booksOfTheBible.add("2 Kings")
        booksOfTheBible.add("1 Chronicles")
        booksOfTheBible.add("2 Chronicles")
        booksOfTheBible.add("Ezra")
        booksOfTheBible.add("Nehemiah")
        booksOfTheBible.add("Esther")
        booksOfTheBible.add("Job")
        booksOfTheBible.add("Psalms")
        booksOfTheBible.add("Proverbs")
        booksOfTheBible.add("Ecclesiastes")
        booksOfTheBible.add("Song of Solomon")
        booksOfTheBible.add("Isaiah")
        booksOfTheBible.add("Jeremiah")
        booksOfTheBible.add("Lamentations")
        booksOfTheBible.add("Ezekiel")
        booksOfTheBible.add("Daniel")
        booksOfTheBible.add("Hosea")
        booksOfTheBible.add("Joel")
        booksOfTheBible.add("Amos")
        booksOfTheBible.add("Obadiah")
        booksOfTheBible.add("Jonah")
        booksOfTheBible.add("Micah")
        booksOfTheBible.add("Nahum")
        booksOfTheBible.add("Habakkuk")
        booksOfTheBible.add("Zephaniah")
        booksOfTheBible.add("Haggai")
        booksOfTheBible.add("Zechariah")
        booksOfTheBible.add("Malachi")

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
