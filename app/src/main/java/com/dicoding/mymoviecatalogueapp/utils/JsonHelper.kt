package com.dicoding.mymoviemoviesapp.utils

import android.content.Context
import com.dicoding.mymoviecatalogueapp.data.source.remote.response.CatalogueResponse
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException

class JsonHelper(private val context: Context) {

    val listTvshows = ArrayList<CatalogueResponse>()


    private fun parsingFileToString(fileName: String): String? {
        return try {
            val `is` = context.assets.open(fileName)
            val buffer = ByteArray(`is`.available())
            `is`.read(buffer)
            `is`.close()
            String(buffer)
        } catch (ex: IOException) {
            ex.printStackTrace()
            null
        }
    }

    fun loadMoviesCatalogue(): List<CatalogueResponse> {
        val listMovies = ArrayList<CatalogueResponse>()
        try {
            val responseObject = JSONObject(parsingFileToString("movresponse.json").toString())
            val listMoviesCatalogue = responseObject.getJSONArray("catalogue")
            for (i in 0 until listMoviesCatalogue.length()) {
                val movies = listMoviesCatalogue.getJSONObject(i)
                val id = movies.getString("id")
                val poster = movies.getString("poster")
                val title = movies.getString("title")
                val type = movies.getString("type")
                val genre = movies.getString("genre")
                val duration = movies.getString("duration")
                val overview = movies.getString("overview")
                val score = movies.getString("score")
                val date = movies.getString("date")
                val year = movies.getString("year")
                val trailer = movies.getString("trailer")
                val moviesResponse = CatalogueResponse(
                    id, poster, title, type, genre, duration, overview, score, date, year, trailer
                )
                listMovies.add(moviesResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return listMovies
    }

    fun loadTvshowsCatalogue(): List<CatalogueResponse> {
        try {
            val responseObject = JSONObject(parsingFileToString("tvsresponse.json").toString())
            val listTvshowsCatalogue = responseObject.getJSONArray("catalogue")
            for (i in 0 until listTvshowsCatalogue.length()) {
                val movies = listTvshowsCatalogue.getJSONObject(i)
                val id = movies.getString("id")
                val poster = movies.getString("poster")
                val title = movies.getString("title")
                val type = movies.getString("type")
                val genre = movies.getString("genre")
                val duration = movies.getString("duration")
                val overview = movies.getString("overview")
                val score = movies.getString("score")
                val date = movies.getString("date")
                val year = movies.getString("year")
                val trailer = movies.getString("trailer")
                val tvshowsResponse = CatalogueResponse(
                    id, poster, title, type, genre, duration, overview, score, date, year, trailer
                )
                listTvshows.add(tvshowsResponse)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return listTvshows
    }

    fun loadDetailMoviesCatalogue(movId: String): CatalogueResponse? {
        val fileName = String.format("%s.json", movId)
        var catalogueResponse: CatalogueResponse? = null
        try {
            val results = parsingFileToString(fileName)
            if (results != null) {
                val responseObject = JSONObject(results)

                val id = responseObject.getString("id")
                val poster = responseObject.getString("poster")
                val title = responseObject.getString("title")
                val type = responseObject.getString("type")
                val genre = responseObject.getString("genre")
                val duration = responseObject.getString("duration")
                val overview = responseObject.getString("overview")
                val score = responseObject.getString("score")
                val date = responseObject.getString("date")
                val year = responseObject.getString("year")
                val trailer = responseObject.getString("trailer")
                val movies = CatalogueResponse(
                    id, poster, title, type, genre, duration, overview, score, date, year, trailer
                )
                catalogueResponse = movies
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return catalogueResponse
    }

    fun loadDetailTvshowsCatalogue(tvsId: String): CatalogueResponse? {
        val fileName = String.format("%s.json", tvsId)
        var catalogueResponse: CatalogueResponse? = null
        try {
            val results = parsingFileToString(fileName)
            if (results != null) {
                val responseObject = JSONObject(results)

                val id = responseObject.getString("id")
                val poster = responseObject.getString("poster")
                val title = responseObject.getString("title")
                val type = responseObject.getString("type")
                val genre = responseObject.getString("genre")
                val duration = responseObject.getString("duration")
                val overview = responseObject.getString("overview")
                val score = responseObject.getString("score")
                val date = responseObject.getString("date")
                val year = responseObject.getString("year")
                val trailer = responseObject.getString("trailer")
                val tvshows = CatalogueResponse(
                    id, poster, title, type, genre, duration, overview, score, date, year, trailer
                )
                catalogueResponse = tvshows
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        return catalogueResponse
    }

}