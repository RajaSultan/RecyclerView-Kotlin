package com.example.kotlinfundmentals

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.custom.view.*

class todoAdapter(
    var todos: List<Todo>
) : RecyclerView.Adapter<todoAdapter.TodoViewHolder>() {

    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val TextView = itemView.findViewById<TextView>(R.id.textView);
        //val CheckBox = itemView.findViewById<CheckBox>(R.id.checkBox);
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

        holder.itemView.apply {
            textView.text = todos[position].title
            checkBox.isChecked = todos[position].isChecked
        }

    }

    override fun getItemCount(): Int {

        return todos.size

    }
}
