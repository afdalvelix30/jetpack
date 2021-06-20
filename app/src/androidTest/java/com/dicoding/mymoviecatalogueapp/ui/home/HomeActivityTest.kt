package com.dicoding.mymoviecatalogueapp.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.mymoviecatalogueapp.R
import com.dicoding.mymoviecatalogueapp.data.source.local.entity.CatalogueEntity
import com.dicoding.mymoviecatalogueapp.utils.DataCatalogueDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {
    private val dummyMovies = DataCatalogueDummy.generateDummyMoviesCatalogue()
    private val dummyTvshows = DataCatalogueDummy.generateDummyTvshowsCatalogue()
    private var listCatalogue = ArrayList<CatalogueEntity>()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovies() {
        for (movies in dummyMovies) {
            if (movies.id == "mov") {
                listCatalogue.add(movies)
            }
        }
        onView(withId(R.id.recV_movies))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.recV_movies))
                .perform(RecyclerViewActions
                        .scrollToPosition<RecyclerView.ViewHolder>(listCatalogue.size))

    }

    @Test
    fun loadDetailMovies() {
        onView(withId(R.id.recV_movies)).perform(RecyclerViewActions
                .actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.imgV_poster))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_title))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_title))
                .check(ViewAssertions.matches(withText(dummyMovies[0].title)))
        onView(withId(R.id.txtV_year))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_year))
                .check(ViewAssertions.matches(withText("(${dummyMovies[0].year})")))
        onView(withId(R.id.txtV_type))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_type))
                .check(ViewAssertions.matches(withText(dummyMovies[0].type)))
        onView(withId(R.id.txtV_genre))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_genre))
                .check(ViewAssertions.matches(withText(dummyMovies[0].genre)))
        onView(withId(R.id.txtV_duration))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_duration))
                .check(ViewAssertions.matches(withText(dummyMovies[0].duration)))
        onView(withId(R.id.txtV_score))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_score))
                .check(ViewAssertions.matches(withText(dummyMovies[0].score)))
        onView(withId(R.id.txtV_date))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_date))
                .check(ViewAssertions.matches(withText(dummyMovies[0].date)))
        onView(withId(R.id.txtV_overview))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_overview))
                .check(ViewAssertions.matches(withText(dummyMovies[0].overview)))
        onView(withId(R.id.lyt_trailer))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.lyt_trailer))
                .perform(click())


    }

    @Test
    fun loadTvshows() {
        for (tvShows in dummyTvshows) {
            if (tvShows.id == "tvs") {
                listCatalogue.add(tvShows)
            }
        }
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.recV_tvshows))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.recV_tvshows)).perform(RecyclerViewActions
                .scrollToPosition<RecyclerView.ViewHolder>(listCatalogue.size))
    }

    @Test
    fun loadDetailTvshows() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.recV_tvshows)).perform(RecyclerViewActions
                .actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.imgV_poster))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_title))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_title))
                .check(ViewAssertions.matches(withText(dummyTvshows[0].title)))
        onView(withId(R.id.txtV_year))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_year))
                .check(ViewAssertions.matches(withText("(${dummyTvshows[0].year})")))
        onView(withId(R.id.txtV_type))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_type))
                .check(ViewAssertions.matches(withText(dummyTvshows[0].type)))
        onView(withId(R.id.txtV_genre))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_genre))
                .check(ViewAssertions.matches(withText(dummyTvshows[0].genre)))
        onView(withId(R.id.txtV_duration))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_duration))
                .check(ViewAssertions.matches(withText(dummyTvshows[0].duration)))
        onView(withId(R.id.txtV_score))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_score))
                .check(ViewAssertions.matches(withText(dummyTvshows[0].score)))
        onView(withId(R.id.txtV_date))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_date))
                .check(ViewAssertions.matches(withText(dummyTvshows[0].date)))
        onView(withId(R.id.txtV_overview))
                .check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.txtV_overview))
                .check(ViewAssertions.matches(withText(dummyTvshows[0].overview)))
        onView(withId(R.id.lyt_trailer)).check(ViewAssertions.matches(isDisplayed()))
        onView(withId(R.id.lyt_trailer)).perform(click())
    }

}