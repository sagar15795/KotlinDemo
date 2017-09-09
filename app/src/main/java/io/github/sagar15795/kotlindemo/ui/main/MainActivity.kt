package io.github.sagar15795.kotlindemo.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import io.github.sagar15795.kotlindemo.R
import io.github.sagar15795.kotlindemo.data.DataManager
import io.github.sagar15795.kotlindemo.data.model.RedditNewsResponse

class MainActivity : AppCompatActivity(), MainContract.View {
    override fun showNewsList(t: RedditNewsResponse?) {
        val layoutManager : LinearLayoutManager = LinearLayoutManager(this)
        recyclerViewNewsList.layoutManager = layoutManager
        recyclerViewNewsList.adapter = MainAdapter(t!!)
    }

    private lateinit var recyclerViewNewsList: RecyclerView


    private lateinit var mainPresenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter=MainPresenter(DataManager)
        mainPresenter.attachView(this)
        mainPresenter.getTop()
        recyclerViewNewsList = findViewById(R.id.rv_news_list)
    }
}
