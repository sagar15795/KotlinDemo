package io.github.sagar15795.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.github.sagar15795.kotlindemo.data.model.RedditNewsResponse
import io.github.sagar15795.kotlindemo.data.remote.RestAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val request = RestAPI()

        request.getNews("","10").enqueue(object : Callback<RedditNewsResponse>{
            override fun onFailure(call: Call<RedditNewsResponse>?, t: Throwable?) {
                Log.e("t",t.toString())
            }

            override fun onResponse(call: Call<RedditNewsResponse>?, response: Response<RedditNewsResponse>?) {
                Log.e("t",response!!.body()!!.data.toString())
            }

        })

    }
}
