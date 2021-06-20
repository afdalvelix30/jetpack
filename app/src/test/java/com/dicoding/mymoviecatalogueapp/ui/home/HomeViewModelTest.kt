package com.dicoding.mymoviecatalogueapp.ui.home

import com.dicoding.mymoviecatalogueapp.data.source.CatalogueRepository
import com.dicoding.mymoviecatalogueapp.data.source.local.entity.CatalogueEntity
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
import java.util.*
import kotlin.collections.ArrayList

@RunWith(MockitoJUnitRunner::class)
class HomeViewModelTest {

    private lateinit var homeViewModel: HomeViewModel

    @Mock
    private lateinit var catalogueRepository: CatalogueRepository


    @Before
    fun setUp() {
        homeViewModel = HomeViewModel(catalogueRepository)
    }

    @Test
    fun getMoviesCatalogue() {

        `when`(catalogueRepository.getAllMoviesCatalogue()).thenReturn(DataCatalogueDummy.generateDummyMoviesCatalogue() as ArrayList<CatalogueEntity>)
        val moviesEntity = homeViewModel.getMoviesCatalogue()
        verify<CatalogueRepository>(catalogueRepository).getAllMoviesCatalogue()
        assertNotNull(moviesEntity)
        assertEquals(10, moviesEntity.size)

    }

    @Test
    fun getTvshowsCatalogue() {
        `when`(catalogueRepository.getAllTvshowsCatalogue()).thenReturn(DataCatalogueDummy.generateDummyTvshowsCatalogue() as ArrayList<CatalogueEntity>)
        val tvShowsEntity = homeViewModel.getTvshowsCatalogue()
        verify<CatalogueRepository>(catalogueRepository).getAllTvshowsCatalogue()
        assertNotNull(tvShowsEntity)
        assertEquals(10, tvShowsEntity.size)
    }

}