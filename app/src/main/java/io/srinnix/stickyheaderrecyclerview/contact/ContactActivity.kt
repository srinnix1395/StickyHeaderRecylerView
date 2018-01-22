package io.srinnix.stickyheaderrecyclerview.contact

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import io.srinnix.stickyheaderrecyclerview.R
import kotlinx.android.synthetic.main.activity_contact.*

/**
 * Created by Tuha on 1/22/2018.
 */
class ContactActivity : AppCompatActivity() {

    private lateinit var contactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        initView()
    }

    private fun initView() {
        val listContact = getListContact()

        contactAdapter = ContactAdapter(this, listContact)
        rv_contact.adapter = contactAdapter
        rv_contact.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL).apply {
            setDrawable(ContextCompat.getDrawable(this@ContactActivity, R.drawable.divider_contact))
        })
    }

    private fun getListContact(): ArrayList<String> {
        return arrayListOf(
                "Jones - #4527A0", "Kivell - #7986CB", "Jardine - #1976D2", "Gill - #00ACC1", "Sorvino - #EA80FC",
                "Jones - #00BCD4", "Andrews - #4CAF50", "Jardine - #3949AB", "Thompson - #FFF59D", "Jones - #4CAF50",
                "Morgan - #4DB6AC", "Howard - #80CBC4", "Parent - #64FFDA", "Jones - #4CAF50", "Smith - #8BC34A", "Jones - #FFEE58",
                "Morgan - #FB8C00", "Jones - #FBE9E7", "Parent - #BF360C", "Kivell - #A1887F", "Smith - #F5F5F5", "Parent - #607D8B",
                "Gill - #37474F", "Smith - #F4FF81", "Jones - #FFEE58", "Sorvino - #FFD600", "Jardine - #FFA000", "Andrews - #FFE0B2",
                "Howard - #E6EE9C", "Gill - #EEFF41", "Gill - #FFEB3B", "Kivell - #FFC107", "Jones - #FF8F00", "Morgan - #FFCC80", "Kivell - #FFAB40",
                "Sorvino - #FF5722", "Gill - #795548", "Sorvino - #4E342E", "Thompson - #757575", "Andrews - #78909C", "Jardine - #9E9D24", "Jardine - #388E3C", "Andrews - #D7CCC8"
        )
    }
}