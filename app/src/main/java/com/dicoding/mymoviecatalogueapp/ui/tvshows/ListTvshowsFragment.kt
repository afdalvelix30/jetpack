package com.dicoding.mymoviecatalogueapp.ui.tvshows

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.mymoviecatalogueapp.ui.list.ListCatalogueAdapter
import com.dicoding.mymoviecatalogueapp.databinding.FragmentListTvshowsBinding
import com.dicoding.mymoviecatalogueapp.ui.home.HomeViewModel
import com.dicoding.mymoviecatalogueapp.viewmodel.ViewModelsFactory

class ListTvshowsFragment : Fragment() {

    private lateinit var fragmentListTvshowsBinding: FragmentListTvshowsBinding


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        fragmentListTvshowsBinding = FragmentListTvshowsBinding.inflate(layoutInflater, container, false)
        return fragmentListTvshowsBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelsFactory.getInstance(requireActivity())
            val viewModels = ViewModelProvider(this, factory)[HomeViewModel::class.java]
            val tvshowsCatalogue= viewModels.getTvshowsCatalogue()
            val listCatalogueAdapter = ListCatalogueAdapter()
            listCatalogueAdapter.setCatalogue(tvshowsCatalogue)

            with(fragmentListTvshowsBinding.recVTvshows) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = listCatalogueAdapter
            }

        }
    }
}