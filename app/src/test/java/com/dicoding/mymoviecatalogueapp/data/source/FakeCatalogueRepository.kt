package com.dicoding.mymoviecatalogueapp.data.source

import android.util.Log
import com.dicoding.mymoviecatalogueapp.data.source.local.entity.CatalogueEntity
import com.dicoding.mymoviecatalogueapp.data.source.remote.RemoteDataSources

class FakeCatalogueRepository (private val remoteDataSources: RemoteDataSources) : CatalogueDataSources {

    override fun getAllMoviesCatalogue(): ArrayList<CatalogueEntity> {
        val moviesResponses = remoteDataSources.getAllMoviesCatalogue()
        val listMovies = ArrayList<CatalogueEntity>()
        for (response in moviesResponses) {
            val movies = CatalogueEntity(
                response.id,
                response.poster,
                response.title,
                response.type,
                response.genre,
                response.duration,
                response.overview,
                response.score,
                response.date,
                response.year,
                response.trailer
            )
            listMovies.add(movies)
        }
        return listMovies
    }

    override fun getAllTvshowsCatalogue(): ArrayList<CatalogueEntity> {
        val tvshowsResponses = remoteDataSources.getAllTvshowsCatalogue()
        val listTvshows = ArrayList<CatalogueEntity>()
        for (response in tvshowsResponses) {
            val tvshows = CatalogueEntity(
                response.id,
                response.poster,
                response.title,
                response.type,
                response.genre,
                response.duration,
                response.overview,
                response.score,
                response.date,
                response.year,
                response.trailer
            )
            listTvshows.add(tvshows)
        }
        return listTvshows
    }

    override fun getDetailMoviesCatalogue(movId: String): CatalogueEntity {
        val detailMoviesResponses = remoteDataSources.getDetailMoviesCatalogue(movId)!!
        val movies = CatalogueEntity(
            detailMoviesResponses.id,
            detailMoviesResponses.poster,
            detailMoviesResponses.title,
            detailMoviesResponses.type,
            detailMoviesResponses.genre,
            detailMoviesResponses.duration,
            detailMoviesResponses.overview,
            detailMoviesResponses.score,
            detailMoviesResponses.date,
            detailMoviesResponses.year,
            detailMoviesResponses.trailer
        )
        Log.d("LIHAT", movies.toString())
        return movies
    }


    override fun getDetailTvshowsCatalogue(tvsId: String): CatalogueEntity {
        val detailTvshowsResponses = remoteDataSources.getDetailTvshowsCatalogue(tvsId)!!
        val tvshows = CatalogueEntity(
            detailTvshowsResponses.id,
            detailTvshowsResponses.poster,
            detailTvshowsResponses.title,
            detailTvshowsResponses.type,
            detailTvshowsResponses.genre,
            detailTvshowsResponses.duration,
            detailTvshowsResponses.overview,
            detailTvshowsResponses.score,
            detailTvshowsResponses.date,
            detailTvshowsResponses.year,
            detailTvshowsResponses.trailer
        )
        Log.d("LIHAT", tvshows.toString())
        return tvshows
    }
}