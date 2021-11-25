package com.diskominfo.tabanankominfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_nama.*
import kotlinx.android.synthetic.main.activity_list_nama.rvnama
import kotlinx.android.synthetic.main.activity_list_pengumuman.*

class ListPengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pengumuman)

        val pengumuman = listOf<String>(
            "pengumuman 1",
            "pengumuman 2",
            "pengumuman 3",
            "pengumuman 4",
            "pengumuman 5",

        )

        val tanggal = listOf<String>(
            "21-02-2021",
            "22-02-2021",
            "23-02-2021",
            "24-02-2021",
            "25-02-2021",
        )

        val image = intArrayOf(
            R.drawable.xxx,
            R.drawable.xxx,
            R.drawable.xxx,
            R.drawable.xxx,
            R.drawable.xxx,


            )

        val adapterPengumuman = AdapterPengumuman(pengumuman,tanggal,image){
            val data = Intent(this, DetailPengumuman::class.java)
            data.putExtra("pengumuman", pengumuman.get(it))
            startActivity(data)
        }
        rvnama.layoutManager = LinearLayoutManager(this)
        rvnama.adapter = adapterPengumuman
    }
}