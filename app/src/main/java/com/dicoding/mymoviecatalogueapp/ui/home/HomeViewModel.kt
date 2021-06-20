package com.dicoding.mymoviecatalogueapp.ui.home

import androidx.lifecycle.ViewModel
import com.dicoding.mymoviecatalogueapp.data.source.CatalogueRepository
import com.dicoding.mymoviecatalogueapp.data.source.local.entity.CatalogueEntity
import com.dicoding.mymoviecatalogueapp.utils.DataCatalogueDummy

class HomeViewModel (private val catalogueRepository: CatalogueRepository): ViewModel() {
    fun getMoviesCatalogue(): List<CatalogueEntity> = catalogueRepository.getAllMoviesCatalogue()
    fun getTvshowsCatalogue(): List<CatalogueEntity> = catalogueRepository.getAllTvshowsCatalogue()
}