package com.boomzoned.thebibleproject.view.adapters

import android.view.OrientationEventListener
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.boomzoned.thebibleproject.R
import com.boomzoned.thebibleproject.utils.inflate
import kotlinx.android.synthetic.main.bible_list_item.view.*

class BibleBooksListAdapter(
    val items: ArrayList<String>,
    bibleBooksListAdapterInterface: BibleBooksListAdapterInterface
) : RecyclerView.Adapter<BibleBooksViewHolder>() {
    companion object {
        val TAG = "BibleBooksListAdapter"
    }

    private val mListener: BibleBooksListAdapterInterface = bibleBooksListAdapterInterface

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BibleBooksViewHolder {
        val inflatedView = parent.inflate(R.layout.bible_list_item, false)
        inflatedView.setOnClickListener {
            mListener.viewHolderItemPressed(inflatedView.book_name.text.toString())
        }
        return BibleBooksViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: BibleBooksViewHolder, position: Int) {
        holder.bibleBookName.text= items.get(position)
    }
}

interface BibleBooksListAdapterInterface {
    fun viewHolderItemPressed(string : String)
}

class BibleBooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private var v: View = view
    val bibleBookName: TextView = view.book_name
}