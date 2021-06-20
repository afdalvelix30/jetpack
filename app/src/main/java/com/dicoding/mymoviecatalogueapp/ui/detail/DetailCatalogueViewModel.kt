package com.dicoding.mymoviecatalogueapp.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.mymoviecatalogueapp.data.source.CatalogueRepository
import com.dicoding.mymoviecatalogueapp.data.source.local.entity.CatalogueEntity
import com.dicoding.mymoviecatalogueapp.utils.DataCatalogueDummy

class DetailCatalogueViewModel(private val catalogueRepository: CatalogueRepository): ViewModel() {
//    private lateinit var movId: String
//    private lateinit var tvsId: String
//
//    fun setSelectedMoviesCatalogue(movId: String) {
//        this.movId = movId
//    }
//
//    fun setSelectedTvshowsCatalogue(tvsId: String) {
//        this.tvsId = tvsId
//    }

    fun getMoviesCatalogue(movId: String): CatalogueEntity = catalogueRepository.getDetailMoviesCatalogue(movId)
    
    fun getTvshowsCatalogue(tvsId: String): CatalogueEntity = catalogueRepository.getDetailTvshowsCatalogue(tvsId)
}