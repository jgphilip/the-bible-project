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
        val bookName = items.get(position)
        holder.bibleBookName.text= bookName
        holder.circleText.text = bookName.subSequence(0,1)
    }
}

interface BibleBooksListAdapterInterface {
    fun viewHolderItemPressed(string : String)
}

class BibleBooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val bibleBookName: TextView = view.book_name
    val circleText : TextView = view.title
}