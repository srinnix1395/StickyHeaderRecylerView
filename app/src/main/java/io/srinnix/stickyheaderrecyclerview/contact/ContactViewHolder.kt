package io.srinnix.stickyheaderrecyclerview.contact

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.support.v7.widget.RecyclerView
import android.view.View
import io.srinnix.stickyheaderrecyclerview.common.getTextColor
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_contact.view.*

/**
 * Created by Tuha on 1/22/2018.
 */
class ContactViewHolder(override val containerView: View?) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    private val avatarDrawable: GradientDrawable = GradientDrawable()

    init {
        avatarDrawable.shape = GradientDrawable.OVAL
    }

    fun bindData(contact: String) {
        val data = contact.split(" - ")

        avatarDrawable.setColor(Color.parseColor(data[1]))

        itemView.tv_avatar.background = avatarDrawable
        itemView.tv_avatar.setTextColor(data[1].getTextColor())
        itemView.tv_avatar.text = data[0][0].toString()
        itemView.tv_name.text = data[0]

    }
}