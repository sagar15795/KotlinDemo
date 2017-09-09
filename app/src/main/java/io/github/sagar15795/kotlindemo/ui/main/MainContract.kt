package io.github.sagar15795.kotlindemo.ui.main

import io.github.sagar15795.kotlindemo.data.model.RedditNewsResponse
import io.github.sagar15795.kotlindemo.ui.base.MvpView


interface MainContract {
    interface View : MvpView{
        fun showNewsList(t: RedditNewsResponse?)

    }
    interface Presenter{
        fun getTop()
    }
}