package com.gaeng0517.kotlinpractice.lecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaeng0517.kotlinpractice.R

class DetailActivity : AppCompatActivity() {
    lateinit var list: TaskList
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture_detail)
        list = intent.getParcelableExtra<TaskList>(MainActivity.INTENT_LIST_KEY) as TaskList
        title = list.name
    }
}