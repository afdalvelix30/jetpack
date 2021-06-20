package com.dicoding.mymoviecatalogueapp.data.source

import com.dicoding.mymoviecatalogueapp.data.source.local.entity.CatalogueEntity

interface CatalogueDataSources {

    fun getAllMoviesCatalogue(): List<CatalogueEntity>

    fun getAllTvshowsCatalogue(): List<CatalogueEntity>

    fun getDetailMoviesCatalogue(movId: String): CatalogueEntity

    fun getDetailTvshowsCatalogue(tvsId: String): CatalogueEntity
}