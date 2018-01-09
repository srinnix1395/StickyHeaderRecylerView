package io.srinnix.stickyheaderrecyclerview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.srinnix.stickyheaderrecyclerview.instagram.InstagramActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_instagram.setOnClickListener {
            val intent = Intent(this, InstagramActivity::class.java)
            startActivity(intent)
        }
    }
}
