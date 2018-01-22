package io.srinnix.stickyheaderrecyclerview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.srinnix.stickyheaderrecyclerview.contact.ContactActivity
import io.srinnix.stickyheaderrecyclerview.instagram.InstagramActivity
import io.srinnix.stickyheaderrecyclerview.stickyheader.ColorPaletteActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_instagram.setOnClickListener {
            val intent = Intent(this, InstagramActivity::class.java)
            startActivity(intent)
        }

        btn_contact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }

        btn_color_palette.setOnClickListener {
            val intent = Intent(this, ColorPaletteActivity::class.java)
            startActivity(intent)
        }
    }
}
