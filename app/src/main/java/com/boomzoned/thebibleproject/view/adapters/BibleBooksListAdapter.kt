package com.boomzoned.thebibleproject.view.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.boomzoned.thebibleproject.R
import com.boomzoned.thebibleproject.utils.inflate
import kotlinx.android.synthetic.main.bible_list_item.view.*

class BibleBooksListAdapter(val items : ArrayList<String>) : RecyclerView.Adapter<BibleBooksViewHolder>() {
    companion object{
        val TAG = "BibleBooksListAdapter"
    }
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BibleBooksViewHolder {
        val inflatedView = parent.inflate(R.layout.bible_list_item, false)
        return BibleBooksViewHolder(inflatedView)
    }

    override fun onBindViewHolder(holder: BibleBooksViewHolder, position: Int) {
        holder.bibleBookName.text = items.get(position)
    }
}

class BibleBooksViewHolder (view: View) : RecyclerView.ViewHolder(view){
    private var v: View  = view
    val bibleBookName = view.book_name
}