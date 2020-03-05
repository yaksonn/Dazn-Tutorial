package com.yaksonn.dazntutorial.ui.fragment.news


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment_news.view.*
import com.yaksonn.dazntutorial.R
import com.yaksonn.dazntutorial.network.newsprovider.INewsService
import com.yaksonn.dazntutorial.util.customviews.Toaster
import javax.inject.Inject

/**
 * Created by @yaksonn
 */


class NewsFragment : Fragment(), NewsContract.View {
    @Inject
    lateinit var newsService: INewsService

    @Inject
    lateinit var toaster: Toaster

    lateinit var newsPresenterImpl: NewsPresenterImpl

    lateinit var newsAdapter: NewsRecyclerAdapter

    lateinit var newsDetailFragment: NewsDetailFragment

    var newsItemViewModels: MutableList<NewsItemViewModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newsPresenterImpl = NewsPresenterImpl(this, newsService)

        newsAdapter = NewsRecyclerAdapter(newsItemViewModels, Picasso.with(context),
            object : NewsRecyclerAdapter.IOnNewsItemClickListener {
                override fun onNewsItemClick(newsItemViewModel: NewsItemViewModel) {
                    newsDetailFragment = NewsDetailFragment.newInstance(newsItemViewModel.detailUrl)
                    newsDetailFragment.show(childFragmentManager, "SHOW_NEWS_DETAIL")
                }

            })
        view.rv_news.adapter = newsAdapter

        newsPresenterImpl.loadNews()
    }

    companion object {
        fun newInstance(): NewsFragment {
            return NewsFragment()
        }
    }

    override fun onLoadNewsSuccess(newsViews: List<NewsItemViewModel>) {
        newsItemViewModels.clear()
        newsItemViewModels.addAll(newsViews)
        newsAdapter.notifyDataSetChanged()

        if (newsViews.size == 0)
            toaster.shortToast("No news to show")
    }

    override fun onLoadNewsFail(errorMessage: String) {
        toaster.shortToast(errorMessage)
    }

}
