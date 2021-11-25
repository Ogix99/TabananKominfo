package com.diskominfo.tabanankominfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_pengumuman.*
import kotlinx.android.synthetic.main.activity_list_pengumuman.*

class DetailPengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pengumuman)

        val nama = intent.getStringExtra("detailnama")
        detailnama.text = nama.toString()
    }
}