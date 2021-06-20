package com.dicoding.mymoviecatalogueapp.ui.detail

import com.dicoding.mymoviecatalogueapp.data.source.CatalogueRepository
import com.dicoding.mymoviecatalogueapp.utils.DataCatalogueDummy
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailCatalogueViewModelTest {
    private lateinit var detailCatalogueViewModel: DetailCatalogueViewModel
    private val dummyMovies = DataCatalogueDummy.generateDummyMoviesCatalogue()[0]
    private val dummyTvshows = DataCatalogueDummy.generateDummyTvshowsCatalogue()[0]
    private val movId = dummyMovies.id
    private val tvsId = dummyTvshows.id

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository

    @Before
    fun setUp() {
        detailCatalogueViewModel = DetailCatalogueViewModel(catalogueRepository)
    }

    @Test
    fun getMoviesCatalogue() {
        `when`(catalogueRepository.getDetailMoviesCatalogue(movId)).thenReturn(dummyMovies)
        val moviesEntity = detailCatalogueViewModel.getMoviesCatalogue(movId)
        verify(catalogueRepository).getDetailMoviesCatalogue(movId)
        assertNotNull(moviesEntity)
        assertEquals(dummyMovies.id, moviesEntity.id)
        assertEquals(dummyMovies.poster, moviesEntity.poster)
        assertEquals(dummyMovies.date, moviesEntity.date)
        assertEquals(dummyMovies.duration, moviesEntity.duration)
        assertEquals(dummyMovies.genre, moviesEntity.genre)
        assertEquals(dummyMovies.overview, moviesEntity.overview)
        assertEquals(dummyMovies.score, moviesEntity.score)
        assertEquals(dummyMovies.trailer, moviesEntity.trailer)
        assertEquals(dummyMovies.type, moviesEntity.type)
        assertEquals(dummyMovies.year, moviesEntity.year)
        assertEquals(dummyMovies.title, moviesEntity.title)
    }

    @Test
    fun getTvshowsCatalogue() {
        `when`(catalogueRepository.getDetailTvshowsCatalogue(tvsId)).thenReturn(dummyTvshows)
        val tvShowsEntity = detailCatalogueViewModel.getTvshowsCatalogue(tvsId)
        verify(catalogueRepository).getDetailTvshowsCatalogue(tvsId)
        assertNotNull(tvShowsEntity)
        assertEquals(dummyTvshows.id, tvShowsEntity.id)
        assertEquals(dummyTvshows.poster, tvShowsEntity.poster)
        assertEquals(dummyTvshows.date, tvShowsEntity.date)
        assertEquals(dummyTvshows.duration, tvShowsEntity.duration)
        assertEquals(dummyTvshows.genre, tvShowsEntity.genre)
        assertEquals(dummyTvshows.overview, tvShowsEntity.overview)
        assertEquals(dummyTvshows.score, tvShowsEntity.score)
        assertEquals(dummyTvshows.trailer, tvShowsEntity.trailer)
        assertEquals(dummyTvshows.type, tvShowsEntity.type)
        assertEquals(dummyTvshows.year, tvShowsEntity.year)
        assertEquals(dummyTvshows.title, tvShowsEntity.title)
    }

}