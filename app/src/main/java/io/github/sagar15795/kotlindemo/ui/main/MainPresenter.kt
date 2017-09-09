package io.github.sagar15795.kotlindemo.ui.main

import io.github.sagar15795.kotlindemo.data.DataManager
import io.github.sagar15795.kotlindemo.data.model.RedditNewsResponse
import io.github.sagar15795.kotlindemo.ui.base.BasePresenter
import rx.Observer
import rx.Subscription
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class MainPresenter(private var dataManager: DataManager) : BasePresenter<MainContract.View>(),
        MainContract.Presenter {

    override fun getTop() {
        subscriber = dataManager.getTop("", "10")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<RedditNewsResponse> {
                    override fun onError(e: Throwable?) {

                    }

                    override fun onNext(t: RedditNewsResponse?) {
                        mvpView!!.showNewsList(t)
                    }

                    override fun onCompleted() {

                    }

                })
    }

    private lateinit var subscriber: Subscription

    override fun attachView(mvpView: MainContract.View) {
        super.attachView(mvpView)
    }

    override fun detachView() {
        super.detachView()
    }


}