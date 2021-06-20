package com.dicoding.mymoviecatalogueapp.ui.list

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.mymoviecatalogueapp.R
import com.dicoding.mymoviecatalogueapp.ui.list.ListCatalogueAdapter.ListCatalogueViewHolder
import com.dicoding.mymoviecatalogueapp.data.source.local.entity.CatalogueEntity
import com.dicoding.mymoviecatalogueapp.databinding.ListItemsCatalogueBinding
import com.dicoding.mymoviecatalogueapp.ui.detail.DetailCatalogueActivity

class ListCatalogueAdapter: RecyclerView.Adapter<ListCatalogueViewHolder>() {
    private var listCatalogue = ArrayList<CatalogueEntity>()

    fun setCatalogue(catalogue: List<CatalogueEntity>?) {
        if (catalogue == null) return
        this.listCatalogue.clear()
        this.listCatalogue.addAll(catalogue)
    }

    class ListCatalogueViewHolder(private val binding: ListItemsCatalogueBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(catalogue: CatalogueEntity) {
            with(binding) {
                txtVTitle.text = catalogue.title
                txtVDate.text = catalogue.date
                Glide.with(itemView.context)
                        .load(catalogue.poster)
                        .apply (
                                RequestOptions.placeholderOf(R.drawable.ic_loading)
                                        .error(R.drawable.ic_error))
                        .into(imgVPoster)
                itemView.setOnClickListener {
                    val dIntent = Intent(itemView.context, DetailCatalogueActivity::class.java)
                    dIntent.putExtra(DetailCatalogueActivity.EXTRA_CATALOGUE, catalogue.id)
                    itemView.context.startActivity(dIntent)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListCatalogueViewHolder {
        val listItemsCatalogueBinding = ListItemsCatalogueBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListCatalogueViewHolder(listItemsCatalogueBinding)
    }

    override fun onBindViewHolder(holder: ListCatalogueViewHolder, position: Int) {
        val catalogue = listCatalogue[position]
        holder.bind(catalogue)
    }

    override fun getItemCount(): Int = listCatalogue.size
}