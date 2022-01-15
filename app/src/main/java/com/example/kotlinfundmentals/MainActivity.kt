package com.example.kotlinfundmentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         *   val options = arrayOf("First Item", " Second Item", "Third Item")
        val dialogBuilder = AlertDialog.Builder(this)
        .setTitle("Please Choose One Of The Following")
        .setSingleChoiceItems(options, 0)
        { dialogInterface, i ->
        Toast.makeText(this, "You Choose ${options[i]}", Toast.LENGTH_SHORT).show()
        }
        .setPositiveButton("Accept")
        { _, i ->
        Toast.makeText(this, "You Choose Accepted", Toast.LENGTH_SHORT).show()
        }
        .setNegativeButton("Decline")
        { _, i ->
        Toast.makeText(this, "You Choose Declined", Toast.LENGTH_SHORT).show()
        }
        .create()

        button.setOnClickListener {
        dialogBuilder.show()
        }
         */

        var todosList = mutableListOf(
            Todo("Android Developers", false),
            Todo("Web Developers", false),
            Todo("Front End Developers", true),
            Todo("Android Developers", false),
            Todo("Full Stack Developers", true),
            Todo("Android Developers", false),
            Todo("Android Developers", true),
            Todo("Android Developers", false)

        )

        val adapter = todoAdapter(todosList)
        RecyclerView.adapter = adapter
        RecyclerView.layoutManager = LinearLayoutManager(this)

        button2.setOnClickListener {
            val title = editTextTextPersonName.text.toString()
            val checked = Todo(title, false)
            todosList.add(checked)
            adapter.notifyItemInserted(todosList.size - 1)

        }
    }
}