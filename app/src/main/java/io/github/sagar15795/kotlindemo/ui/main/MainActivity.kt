package io.github.sagar15795.kotlindemo.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.sagar15795.kotlindemo.R
import io.github.sagar15795.kotlindemo.data.DataManager

class MainActivity : AppCompatActivity(), MainContract.View {
        private lateinit var mainPresenter : MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter=MainPresenter(DataManager)
        mainPresenter.attachView(this)
        mainPresenter.getTop()

    }
}
