package io.srinnix.stickyheaderrecyclerview.stickyheader

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import io.srinnix.stickyheaderrecyclerview.R
import io.srinnix.stickyheaderrecyclerview.common.getTextColor

/**
 * Created by Tuha on 1/22/2018.
 */
class ColorAdapter(context: Context,
                   private var listColor: ArrayList<String>) : RecyclerView.Adapter<ColorViewHolder>(), HeaderItemDecoration.StickyHeaderInterface {

    companion object {
        const val ITEM_COLOR = 1
        const val ITEM_HEADER = 2
    }

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ColorViewHolder? {
        return when (viewType) {
            ITEM_COLOR -> {
                val view = inflater.inflate(R.layout.item_color, parent, false)
                ColorViewHolder.Color(view)
            }
            ITEM_HEADER -> {
                val view = inflater.inflate(R.layout.item_header, parent, false)
                ColorViewHolder.Header(view)
            }
            else -> null
        }
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        holder.bindData(listColor[position])
    }

    override fun getItemCount(): Int {
        return listColor.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (listColor[position][0] == '#') {
            ITEM_COLOR
        } else {
            ITEM_HEADER
        }
    }

    override fun getHeaderPositionForItem(itemPosition: Int): Int {
        var headerPosition = 0
        var temp = itemPosition
        do {
            if (this.isHeader(temp)) {
                headerPosition = temp
                break
            }
            temp -= 1
        } while (temp >= 0)
        return headerPosition
    }

    override fun getHeaderLayout(headerPosition: Int): Int {
        return R.layout.item_header_sticky
    }

    override fun bindHeaderData(header: TextView, headerPosition: Int) {
        val data = listColor[headerPosition].split(" - ")

        header.setBackgroundColor(android.graphics.Color.parseColor(data[1]))
        header.text = data[0]
        header.setTextColor(data[1].getTextColor())
    }

    override fun isHeader(itemPosition: Int): Boolean {
        return listColor[itemPosition][0] != '#'
    }
}