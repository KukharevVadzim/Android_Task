package com.example.android_task

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_names.*

class ThirdActivity : AppCompatActivity() {

    private var titleList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)
        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        names_list.layoutManager = LinearLayoutManager(applicationContext)
        names_list.adapter = ItemsAdapter(titleList)
        postToList()
    }

    private fun addToList(title: String, ) {
        titleList.add(title)
    }

    private fun postToList() {
        addToList("Вадим")
        addToList("Вася")
        addToList("Сергей")
        addToList("Таня")
        addToList("Тимур")
        addToList("Кирилл Н.")
        addToList("Кирилл К.")
    }
}