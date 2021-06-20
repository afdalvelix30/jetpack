package com.dicoding.mymoviecatalogueapp.ui.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.mymoviecatalogueapp.ui.list.ListCatalogueAdapter
import com.dicoding.mymoviecatalogueapp.databinding.FragmentListMoviesBinding
import com.dicoding.mymoviecatalogueapp.ui.home.HomeViewModel
import com.dicoding.mymoviecatalogueapp.viewmodel.ViewModelsFactory

class ListMoviesFragment : Fragment() {

    private lateinit var fragmentListMoviesBinding: FragmentListMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentListMoviesBinding = FragmentListMoviesBinding.inflate(layoutInflater, container, false)
        return fragmentListMoviesBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelsFactory.getInstance(requireActivity())
            val viewModels = ViewModelProvider(this, factory)[HomeViewModel::class.java]
            val moviesCatalogue= viewModels.getMoviesCatalogue()
            val listCatalogueAdapter = ListCatalogueAdapter()
            listCatalogueAdapter.setCatalogue(moviesCatalogue)

            with(fragmentListMoviesBinding.recVMovies) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = listCatalogueAdapter
            }

        }
    }
}