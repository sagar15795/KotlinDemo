package io.github.sagar15795.kotlindemo.ui.main

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import io.github.sagar15795.kotlindemo.R
import io.github.sagar15795.kotlindemo.data.model.RedditNewsResponse
import io.github.sagar15795.kotlindemo.utils.getFriendlyTime


class MainAdapter(var itemsList: RedditNewsResponse) : RecyclerView.Adapter<MainAdapter
.NewsViewHolder>() {

    override fun getItemCount(): Int {
        return itemsList.data.children.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder?, position: Int) {
        holder!!.comments!!.text = "${itemsList.data.children[position].data.num_comments}"
        holder.description!!.text = itemsList.data.children[position].data.title
        holder.author!!.text = itemsList.data.children[position].data.author
        holder.time!!.text = itemsList.data.children[position].data.created.getFriendlyTime()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): NewsViewHolder {
        return NewsViewHolder(LayoutInflater.from(parent!!.context).inflate(
                R.layout.item_news_list, parent, false))

    }


    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imgThumbnail: ImageView? = null
        var description: TextView? = null
        var author: TextView? = null
        var comments: TextView? = null
        var time: TextView? = null

        init {
            imgThumbnail = itemView.findViewById(R.id.img_thumbnail)
            description = itemView.findViewById(R.id.description)
            author = itemView.findViewById(R.id.author)
            comments = itemView.findViewById(R.id.comments)
            time = itemView.findViewById(R.id.time)

        }
    }
}

