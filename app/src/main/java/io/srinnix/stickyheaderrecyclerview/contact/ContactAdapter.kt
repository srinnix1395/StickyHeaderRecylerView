package io.srinnix.stickyheaderrecyclerview.contact

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.srinnix.stickyheaderrecyclerview.R

/**
 * Created by Tuha on 1/22/2018.
 */
class ContactAdapter(context: Context,
                     private val listContact: ArrayList<String>) : RecyclerView.Adapter<ContactViewHolder>() {

    private val inflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ContactViewHolder {
        val view = inflater.inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        holder.bindData(listContact[position])
    }

    override fun getItemCount(): Int {
        return listContact.size
    }
}