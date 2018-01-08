package io.srinnix.stickyheaderrecyclerview.instagram

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.srinnix.stickyheaderrecyclerview.R

class GridAdapter(private val listColor: ArrayList<String>) : RecyclerView.Adapter<ImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder?, position: Int) {
        holder?.bindData(listColor[position])
    }

    override fun getItemCount(): Int {
        return listColor.size
    }
}