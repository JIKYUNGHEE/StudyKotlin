package com.gaeng0517.kotlinpractice

import android.os.Bundle
import android.text.InputType
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gaeng0517.kotlinpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var todoListRecyclerView: RecyclerView
    val listDataManager: ListDataManager = ListDataManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val lists = listDataManager.readLists()
        todoListRecyclerView = findViewById(R.id.lists_recyclerview)
        todoListRecyclerView.layoutManager = LinearLayoutManager(this)
        todoListRecyclerView.adapter = TodoListAdapter(lists)

        binding.fab.setOnClickListener { view ->
//            val adapter = todoListRecyclerView.adapter as TodoListAdapter
//            adapter.addNewItem()
            showCreateTodoListDialog()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showCreateTodoListDialog() {
        val dialogTitle = getString(R.string.name_of_list)
        val positiveButtonTitle = getString(R.string.create_list)
        val myDialog = AlertDialog.Builder(this)
        val todoTitleEditText = EditText(this)
        todoTitleEditText.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_CLASS_TEXT

        myDialog.setTitle(dialogTitle)
        myDialog.setView(todoTitleEditText)
        myDialog.setPositiveButton(positiveButtonTitle) { dialog, _ ->
            val adapter = todoListRecyclerView.adapter as TodoListAdapter
            val list = TaskList(todoTitleEditText.text.toString())
            listDataManager.saveList(list)
            adapter.addList(list)

//            adapter.addList(todoTitleEditText.text.toString())
            dialog.dismiss()
        }
        myDialog.create().show()
    }

    /**
     * This is a documentatiln-style comment.
     * You can reference things here, like the [myTestMethod] function.
     * You can also reference parameters, lke the [arguments].
     *
     * @param arguments
     * @author Gaeng
     * */
    fun myTestMethod() {
        println("Hello")
    }
}
