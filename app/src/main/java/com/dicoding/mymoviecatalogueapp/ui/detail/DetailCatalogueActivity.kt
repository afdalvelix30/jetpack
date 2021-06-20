package com.dicoding.mymoviecatalogueapp.ui.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.mymoviecatalogueapp.R
import com.dicoding.mymoviecatalogueapp.data.source.local.entity.CatalogueEntity
import com.dicoding.mymoviecatalogueapp.databinding.ActivityDetailCatalogueBinding
import com.dicoding.mymoviecatalogueapp.databinding.ContentDetailCatalogueBinding
import com.dicoding.mymoviecatalogueapp.viewmodel.ViewModelsFactory

class DetailCatalogueActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_CATALOGUE = "extra_catalogue"
    }

    private lateinit var detailCatalogueBinding: ContentDetailCatalogueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityDetailCatalogueBinding = ActivityDetailCatalogueBinding.inflate(layoutInflater)
        detailCatalogueBinding = activityDetailCatalogueBinding.detailContent
        setContentView(activityDetailCatalogueBinding.root)
        setSupportActionBar(activityDetailCatalogueBinding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val factory = ViewModelsFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailCatalogueViewModel::class.java]
        val extras = intent.extras
        if (extras != null) {
            val id = extras.getString(EXTRA_CATALOGUE).toString()
            Log.d("detailActivity: ", id.substring(0,3))
            if (id.substring(0,3) == "mov") {
                supportActionBar?.title = resources.getString(R.string.detail_movies)
                val movies = viewModel.getMoviesCatalogue(id)
                detailCatalogue(movies)
            } else {
                supportActionBar?.title = resources.getString(R.string.detail_tvShows)
                val tvShows = viewModel.getTvshowsCatalogue(id)
                detailCatalogue(tvShows)

            }
        }
    }

    private fun detailCatalogue(catalogueEntity: CatalogueEntity) {
        detailCatalogueBinding.apply {
            txtVTitle.text = catalogueEntity.title
            txtVYear.text = StringBuilder("(${catalogueEntity.year})")
            txtVDate.text = catalogueEntity.date
            txtVType.text = catalogueEntity.type
            txtVGenre.text = catalogueEntity.genre
            txtVDuration.text = catalogueEntity.duration
            txtVScore.text = catalogueEntity.score
            txtVOverview.text = catalogueEntity.overview
            Glide.with(this@DetailCatalogueActivity)
                    .load(catalogueEntity.poster)
                    .apply (RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(imgVPoster)
            lytTrailer.setOnClickListener {
                val url = Uri.parse(catalogueEntity.trailer)
                val tIntent = Intent(Intent.ACTION_VIEW, url)
                startActivity(tIntent)
            }
        }
    }
}