package com.gaeng0517.kotlinpractice.lecture

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gaeng0517.kotlinpractice.*
import com.gaeng0517.kotlinpractice.databinding.ActivityLectureMainBinding

class MainActivity : AppCompatActivity(),
    TodoListAdapter.TodoListClickListener {
    private lateinit var binding: ActivityLectureMainBinding
    lateinit var todoListRecyclerView: RecyclerView
    val listDataManager: ListDataManager =
        ListDataManager(this)

    companion object {
        const val INTENT_LIST_KEY = "list"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLectureMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val lists = listDataManager.readLists()
        todoListRecyclerView = findViewById(R.id.lists_recyclerview)
        todoListRecyclerView.layoutManager = LinearLayoutManager(this)
        todoListRecyclerView.adapter = TodoListAdapter(lists, this)

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
            val list =
                TaskList(todoTitleEditText.text.toString())
            listDataManager.saveList(list)
            adapter.addList(list)
//            adapter.addList(todoTitleEditText.text.toString())
            dialog.dismiss()
        }
        myDialog.create().show()
    }

    private fun showTaskListItems(list: TaskList) {
        val taskListItem = Intent(this, DetailActivity::class.java)
        taskListItem.putExtra(INTENT_LIST_KEY, list)
        startActivity(taskListItem)
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

    override fun listItemClicked(list: TaskList) {
        showTaskListItems(list)
    }
}
