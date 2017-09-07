package io.github.sagar15795.kotlindemo.data

import io.github.sagar15795.kotlindemo.data.model.RedditNewsResponse
import io.github.sagar15795.kotlindemo.data.remote.RestAPI
import rx.Observable


object DataManager {
        private var apiManger= RestAPI()
    fun getTop(after: String, limit: String): Observable<RedditNewsResponse> {
        return apiManger.getRestApiClient().getTop(after, limit)
    }


}
