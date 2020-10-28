package com.gaeng0517.kotlinpractice.lecture

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gaeng0517.kotlinpractice.R

class TodoListAdapter(val lists: ArrayList<TaskList>, val clickListener: TodoListClickListener) : RecyclerView.Adapter<TodoListViewHolder>() {

    interface TodoListClickListener {
        fun listItemClicked(list: TaskList)
    }

    private var todoList = mutableListOf("Android Development", "House Work", "Errands")

    fun addNewItem() {
        todoList.add("TODO List" + (todoList.size + 1))
        notifyDataSetChanged()
    }

    fun addNewItem(text: String) {
        todoList.add(text)
        notifyDataSetChanged()
    }

    fun addList(taskList: TaskList) {
        lists.add(taskList)
        notifyItemInserted(lists.size - 1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.todo_list_lecture_view_holder, parent, false)

        return TodoListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    override fun onBindViewHolder(holder: TodoListViewHolder, position: Int) {
        holder.listPositionTextView.text = (position + 1).toString()
        holder.listTitleTextView.text = lists[position].name
        holder.itemView.setOnClickListener{
            clickListener.listItemClicked(lists[position])
        }
    }
}