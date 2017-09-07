package io.github.sagar15795.kotlindemo.ui.main

import io.github.sagar15795.kotlindemo.ui.base.MvpView


interface MainContract {
    interface View : MvpView{

    }
    interface Presenter{
        fun getTop()
    }
}