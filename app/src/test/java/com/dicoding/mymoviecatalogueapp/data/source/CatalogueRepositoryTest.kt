package com.dicoding.mymoviecatalogueapp.data.source

import com.dicoding.mymoviecatalogueapp.data.source.remote.RemoteDataSources
import com.dicoding.mymoviecatalogueapp.data.source.remote.response.CatalogueResponse
import com.dicoding.mymoviecatalogueapp.utils.DataCatalogueDummy
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import junit.framework.TestCase
import org.junit.Test
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify


class CatalogueRepositoryTest {
    private val remote = Mockito.mock(RemoteDataSources::class.java)
    private val catalogueRepository = FakeCatalogueRepository(remote)
    private val moviesResponses = DataCatalogueDummy.generateRemoteDummyMoviesCatalogue()
    private val movId = moviesResponses[0].id
    private val tvshowsResponses = DataCatalogueDummy.generateRemoteDummyTvshowsCatalogue()
    private val tvsId = tvshowsResponses[0].id

    @Test
    fun getAllMoviesCatalogue() {
        `when`<List<CatalogueResponse>>(remote.getAllMoviesCatalogue()).thenReturn(moviesResponses)
        val moviesEntities = catalogueRepository.getAllMoviesCatalogue()
        verify<RemoteDataSources>(remote).getAllMoviesCatalogue()
        assertNotNull(moviesEntities)
        assertEquals(moviesResponses.size.toLong(), moviesEntities.size.toLong())

    }

    @Test
    fun getAllTvshowsCatalogue() {
        `when`<List<CatalogueResponse>>(remote.getAllTvshowsCatalogue()).thenReturn(tvshowsResponses)
        val tvshowsEntities = catalogueRepository.getAllTvshowsCatalogue()
        verify<RemoteDataSources>(remote).getAllTvshowsCatalogue()
        assertNotNull(tvshowsEntities)
        assertEquals(moviesResponses.size.toLong(), tvshowsEntities.size.toLong())
    }

    @Test
    fun getDetailMoviesCatalogue() {
        `when`<List<CatalogueResponse>>(remote.getAllMoviesCatalogue()).thenReturn(moviesResponses)
        val resultMovies = catalogueRepository.getDetailMoviesCatalogue(movId)
        verify<RemoteDataSources>(remote).getDetailMoviesCatalogue(movId)
        assertNotNull(resultMovies)
        assertEquals(moviesResponses[0].id, resultMovies.id)
        assertEquals(moviesResponses[0].poster, resultMovies.poster)
        assertEquals(moviesResponses[0].title, resultMovies.title)
        assertEquals(moviesResponses[0].type, resultMovies.type)
        assertEquals(moviesResponses[0].genre, resultMovies.genre)
        assertEquals(moviesResponses[0].duration, resultMovies.duration)
        assertEquals(moviesResponses[0].overview, resultMovies.overview)
        assertEquals(moviesResponses[0].score, resultMovies.score)
        assertEquals(moviesResponses[0].date, resultMovies.date)
        assertEquals(moviesResponses[0].year, resultMovies.year)
        assertEquals(moviesResponses[0].trailer, resultMovies.trailer)
    }

    @Test
    fun getDetailTvshowsCatalogue() {
        `when`<List<CatalogueResponse>>(remote.getAllTvshowsCatalogue()).thenReturn(tvshowsResponses)
        val resultTvshows = catalogueRepository.getDetailTvshowsCatalogue(tvsId)
        verify<RemoteDataSources>(remote).getAllTvshowsCatalogue()
        assertNotNull(resultTvshows)
        assertEquals(tvshowsResponses[0].id, resultTvshows.id)
        assertEquals(tvshowsResponses[0].poster, resultTvshows.poster)
        assertEquals(tvshowsResponses[0].title, resultTvshows.title)
        assertEquals(tvshowsResponses[0].type, resultTvshows.type)
        assertEquals(tvshowsResponses[0].genre, resultTvshows.genre)
        assertEquals(tvshowsResponses[0].duration, resultTvshows.duration)
        assertEquals(tvshowsResponses[0].overview, resultTvshows.overview)
        assertEquals(tvshowsResponses[0].score, resultTvshows.score)
        assertEquals(tvshowsResponses[0].date, resultTvshows.date)
        assertEquals(tvshowsResponses[0].year, resultTvshows.year)
        assertEquals(tvshowsResponses[0].trailer, resultTvshows.trailer)
    }
}