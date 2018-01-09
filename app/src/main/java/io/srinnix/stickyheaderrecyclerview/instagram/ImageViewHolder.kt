package io.srinnix.stickyheaderrecyclerview.instagram

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_image.view.*

class ImageViewHolder(override val containerView: View?) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bindData(color: String) {
        itemView.imv_thumbnail.setBackgroundColor(Color.parseColor(color))
    }
}