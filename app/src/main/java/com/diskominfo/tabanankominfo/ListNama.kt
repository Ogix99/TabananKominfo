package com.diskominfo.tabanankominfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list_nama.*
import kotlinx.android.synthetic.main.item_nama.*

class ListNama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)

        val names = listOf<String>(
            "Tony",
            "Hulk",
            "Captain",
            "Black",
            "Spider",
            "Iron",
            "Thor",
            "Thanos"

        )

        val tanggal = listOf<String>(
            "21-02-2021",
            "22-02-2021",
            "23-02-2021",
            "24-02-2021",
            "25-02-2021",
            "26-02-2021",
            "27-02-2021",
            "28-02-2021",
        )

        val image = intArrayOf(
            R.drawable.kakaprofil,
            R.drawable.kakaprofil,
            R.drawable.kakaprofil,
            R.drawable.kakaprofil,
            R.drawable.kakaprofil,
            R.drawable.kakaprofil,
            R.drawable.kakaprofil,
            R.drawable.kakaprofil,


        )

        val adapterNama = AdapterNama(names,tanggal,image)
        rvnama.layoutManager = LinearLayoutManager(this)
        rvnama.adapter = adapterNama
    }
}