package io.srinnix.stickyheaderrecyclerview.instagram

import android.graphics.Canvas
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class GridSpacingDecoration(private val spacing: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.getItemOffsets(outRect, view, parent, state)

        outRect?.set(1, 1, 1, 1)
    }

    override fun onDraw(c: Canvas?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.onDraw(c, parent, state)
    }

    override fun onDrawOver(c: Canvas?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.onDrawOver(c, parent, state)
    }
}