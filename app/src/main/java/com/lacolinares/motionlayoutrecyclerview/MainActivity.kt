package com.lacolinares.motionlayoutrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val statusAdapter: StatusAdapter = StatusAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupView()
    }

    private fun setupView() {
        recyclerViewStatus.adapter = statusAdapter
        recyclerViewStatus.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.HORIZONTAL, false)

        val dummyStatuses = arrayListOf(
            Status("1", "I love chocolate", name = "Veruca Salt"),
            Status("2", "I WANT IT NOW", name = "Veruca Salt"),
            Status("3", "The blueberries taste like blueberries", name = "Veruca Salt"),
            Status("4", "I've been chewing this same piece of gum for 4 years now!", name = "Veruca Salt"),
            Status("5", "DADDY!!!!!", name = "Veruca Salt"),
            Status("6", "Please DADDY, buy this chocolate factory for me?🍫", name = "Veruca Salt"),
            Status("7", "I can't believe these other kids, eating all the candy from MY chocolate factory", name = "Veruca Salt"),
            Status("8", "I can't believe these other kids, eating all the candy from MY chocolate factory", name = "Veruca Salt"),
            Status("9", "I can't believe these other kids, eating all the candy from MY chocolate factory", name = "Veruca Salt"),
            Status("10", "I can't believe these other kids, eating all the candy from MY chocolate factory", name = "Veruca Salt")
        )
        statusAdapter.submitList(dummyStatuses)
    }
}