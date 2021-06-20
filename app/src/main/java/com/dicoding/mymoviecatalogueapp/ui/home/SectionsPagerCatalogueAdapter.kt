package com.dicoding.mymoviecatalogueapp.ui.home

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dicoding.mymoviecatalogueapp.R
import com.dicoding.mymoviecatalogueapp.ui.movies.ListMoviesFragment
import com.dicoding.mymoviecatalogueapp.ui.tvshows.ListTvshowsFragment

class SectionsPagerCatalogueAdapter(private val context: Context, fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
                R.string.tabMovies,
                R.string.tabTvShows)
    }

    override fun getItem(position: Int): Fragment =
            when (position) {
                0 -> ListMoviesFragment()
                1 -> ListTvshowsFragment()
                else -> Fragment()
            }

    override fun getPageTitle(position: Int): CharSequence? = context.resources.getString(TAB_TITLES[position])

    override fun getCount(): Int {
        return TAB_TITLES.size
    }
}