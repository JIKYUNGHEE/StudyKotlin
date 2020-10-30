package com.gaeng0517.kotlinpractice.own

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.gaeng0517.kotlinpractice.R
import com.gaeng0517.kotlinpractice.databinding.ActivityOwnMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOwnMainBinding

    lateinit var todoListRecyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOwnMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)


        binding.fab.setOnClickListener { view -> showCreateTodoListDialog() }
    }

    private fun showCreateTodoListDialog() {
        val title = "TO-DO List"
        val positiveBtnText = "create"
        val dialogBuilder = AlertDialog.Builder(this)
        val todoTitleEditText = EditText(this)
        todoTitleEditText.inputType = InputType.TYPE_CLASS_TEXT

        dialogBuilder.setTitle(title)
        dialogBuilder.setView(todoTitleEditText)
        dialogBuilder.setPositiveButton(positiveBtnText) { dialog, _ ->

            dialog.dismiss()
        }

        dialogBuilder.create().show()
    }
}