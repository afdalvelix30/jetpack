package com.dicoding.mymoviecatalogueapp.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dicoding.mymoviecatalogueapp.data.source.CatalogueRepository
import com.dicoding.mymoviecatalogueapp.di.Injection
import com.dicoding.mymoviecatalogueapp.ui.detail.DetailCatalogueViewModel
import com.dicoding.mymoviecatalogueapp.ui.home.HomeViewModel

class ViewModelsFactory private constructor(private val mCatalogueRepository: CatalogueRepository) : ViewModelProvider.NewInstanceFactory() {
    companion object {
        @Volatile
        private var instance: ViewModelsFactory? = null

        fun getInstance(context: Context): ViewModelsFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelsFactory(Injection.provideRepository(context)).apply {
                    instance = this
                }
            }
    }

    @Suppress("UNCHEKED_LIST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                return HomeViewModel(mCatalogueRepository) as T
            }

            modelClass.isAssignableFrom(DetailCatalogueViewModel::class.java) -> {
                return DetailCatalogueViewModel(mCatalogueRepository) as T
            }
            else -> throw Throwable("Unknowm ViewModel class: " + modelClass.name)
        }
    }
}