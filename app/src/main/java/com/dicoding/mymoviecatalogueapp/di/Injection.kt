package com.dicoding.mymoviecatalogueapp.di

import android.content.Context
import com.dicoding.mymoviecatalogueapp.data.source.CatalogueRepository
import com.dicoding.mymoviecatalogueapp.data.source.remote.RemoteDataSources
import com.dicoding.mymoviemoviesapp.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): CatalogueRepository {
        val remoteDataSources = RemoteDataSources.getInstance(JsonHelper(context))
        return CatalogueRepository.getInstance(remoteDataSources)
    }
}