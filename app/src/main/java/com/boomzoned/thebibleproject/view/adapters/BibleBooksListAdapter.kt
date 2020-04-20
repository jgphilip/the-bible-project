package com.boomzoned.thebibleproject.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.boomzoned.thebibleproject.R
import kotlinx.android.synthetic.main.bible_list_item.view.*

class BibleBooksListAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<BibleBooksViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BibleBooksViewHolder {
        return BibleBooksViewHolder(LayoutInflater.from(context).inflate(R.layout.bible_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: BibleBooksViewHolder, position: Int) {
        holder?.bibleBookName?.text = items.get(position)
    }
}

class BibleBooksViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val bibleBookName = view.book_name
}