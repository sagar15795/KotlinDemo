package io.github.sagar15795.kotlindemo.data.remote

import io.github.sagar15795.kotlindemo.data.model.RedditNewsResponse
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

interface  RedditApi {
    @GET("/top.json")
    fun getTop(@Query("after") after: String,
               @Query("limit") limit: String)
            : Observable<RedditNewsResponse>;
}