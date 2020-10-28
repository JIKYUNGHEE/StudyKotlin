package com.gaeng0517.kotlinpractice.lecture

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gaeng0517.kotlinpractice.R

class TodoListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var listPositionTextView = itemView.findViewById<TextView>(R.id.itemNumber)
    var listTitleTextView = itemView.findViewById<TextView>(R.id.itemString)
}