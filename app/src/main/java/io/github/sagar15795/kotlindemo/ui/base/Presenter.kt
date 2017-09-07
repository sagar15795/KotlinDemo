package io.github.sagar15795.kotlindemo.ui.base

interface Presenter<in V : MvpView> {

    fun attachView(mvpView: V)

    fun detachView()
}
