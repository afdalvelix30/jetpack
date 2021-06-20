package com.dicoding.mymoviecatalogueapp.data.source.remote

import android.os.Looper
import com.dicoding.mymoviecatalogueapp.data.source.remote.response.CatalogueResponse
import com.dicoding.mymoviecatalogueapp.utils.EspressoIdlingResource
import com.dicoding.mymoviemoviesapp.utils.JsonHelper
import java.util.logging.Handler
import javax.security.auth.callback.Callback

class RemoteDataSources private constructor(private val jsonHelper: JsonHelper) {

    companion object {
        private const val SERVICE_LATENCY_IN_MILLIS: Long = 2000

        @Volatile
        private var instance: RemoteDataSources? = null

        fun getInstance(helper: JsonHelper): RemoteDataSources =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSources(helper).apply {
                    instance = this
                }
            }
    }

    fun getAllMoviesCatalogue(): List<CatalogueResponse> = jsonHelper.loadMoviesCatalogue()

    fun getAllTvshowsCatalogue(): List<CatalogueResponse> = jsonHelper.loadTvshowsCatalogue()

    fun getDetailMoviesCatalogue(movId: String): CatalogueResponse? = jsonHelper.loadDetailMoviesCatalogue(movId)

    fun getDetailTvshowsCatalogue(tvsId: String): CatalogueResponse? = jsonHelper.loadDetailTvshowsCatalogue(tvsId)




}