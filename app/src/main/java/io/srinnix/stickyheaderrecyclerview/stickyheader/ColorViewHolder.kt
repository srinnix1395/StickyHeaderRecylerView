package io.srinnix.stickyheaderrecyclerview.stickyheader

import android.support.v7.widget.RecyclerView
import android.view.View
import io.srinnix.stickyheaderrecyclerview.common.getTextColor
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_color.view.*
import kotlinx.android.synthetic.main.item_header.view.*

/**
 * Created by Tuha on 1/22/2018.
 */
abstract class ColorViewHolder(override val containerView: View?) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    abstract fun bindData(color: String)

    class Color(containerView: View?) : ColorViewHolder(containerView) {

        override fun bindData(color: String) {
            itemView.setBackgroundColor(android.graphics.Color.parseColor(color))
            itemView.tv_color.text = color
            itemView.tv_color.setTextColor(color.getTextColor())
        }
    }

    class Header(containerView: View?) : ColorViewHolder(containerView) {

        override fun bindData(color: String) {
            val data = color.split(" - ")

            itemView.setBackgroundColor(android.graphics.Color.parseColor(data[1]))
            itemView.tv_header.text = data[0]
            itemView.tv_header.setTextColor(data[1].getTextColor())
        }
    }
}