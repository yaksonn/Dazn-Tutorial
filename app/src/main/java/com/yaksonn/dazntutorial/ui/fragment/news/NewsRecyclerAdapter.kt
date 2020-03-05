package com.yaksonn.dazntutorial.ui.fragment.news

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.news_item.view.*
import com.yaksonn.dazntutorial.R
import com.yaksonn.dazntutorial.util.*

class NewsRecyclerAdapter(
    val newsItemViewModels: List<NewsItemViewModel>,
    val picasso: Picasso,
    val onNewsItemClickListener: IOnNewsItemClickListener
) :
    RecyclerView.Adapter<NewsRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newsItemViewModels.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val newsItemViewModel = newsItemViewModels.get(position)

        viewHolder.newsTitleTextView.text = newsItemViewModel.title
        viewHolder.newsPubDateTextView.text = newsItemViewModel.pubDate
        picasso.load(newsItemViewModel.imageUrl).into(viewHolder.newsImageView)

        var dividerVisibility: Int = if (position == (newsItemViewModels.size - 1)) {
            View.GONE
        } else {
            View.VISIBLE
        }
        viewHolder.divider.visibility = dividerVisibility
        viewHolder.itemView.setOnClickListener {
            onNewsItemClickListener.onNewsItemClick(
                newsItemViewModel
            )
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val newsImageView: ImageView = itemView.newsImageView
        val newsTitleTextView: TextView = itemView.newsTitleTextView
        val newsPubDateTextView: TextView = itemView.newsDateTextView
        val divider: View = itemView.divider
    }

    interface IOnNewsItemClickListener {
        fun onNewsItemClick(newsItemViewModel: NewsItemViewModel)
    }
}