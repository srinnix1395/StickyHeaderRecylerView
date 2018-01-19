package io.srinnix.stickyheaderrecyclerview.instagram

import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class GridSpacingDecoration(private val spacing: Int,
                            private val spanCount: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val position = parent.getChildAdapterPosition(view)
        val column = position % 3 // item column

        outRect.left = column * spacing / spanCount
        outRect.right = spacing - (column + 1) * spacing / spanCount
        if (position >= spanCount) {
            outRect.top = spacing
        }
    }

}