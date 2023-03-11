package com.example.search

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_content.*

class ContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        val name = intent.getStringExtra("name")
        val desc = intent.getStringExtra("content_desc")
        val link = intent.getStringExtra("link")
        val image = intent.getIntExtra("image", 1)

        website.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(link)
            startActivity(i)
        }

        title_of_content.text = name
        content.text = desc
        contentImage.setImageResource(image)

        website.movementMethod = LinkMovementMethod.getInstance();

    }
}