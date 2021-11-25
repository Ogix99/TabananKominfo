package com.diskominfo.tabanankominfo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_nama.view.*

class AdapterNama(private val Listname : List<String>,
                  private val Tgl : List<String>,
                  private val image : IntArray )
    :RecyclerView.Adapter<AdapterNama.ViewHolder>() {
    class ViewHolder(view : View):RecyclerView.ViewHolder(view) {
        val nama = view.itemnama
        val tanggal = view.itemtgl
        val image = view.gambar

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNama.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_nama,parent,false)
        )
    }

    override fun onBindViewHolder(holder: AdapterNama.ViewHolder, position: Int) {
        val data = Listname.get(position)
        holder.nama.text = Listname[position]
        holder.tanggal.text = Tgl[position]
        holder.image.setImageResource(image[position])

    }

    override fun getItemCount(): Int {
        return Listname.size
    }


}