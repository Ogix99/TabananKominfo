package com.diskominfo.tabanankominfo


import android.service.autofill.OnClickAction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list_pengumuman.view.*
import kotlinx.android.synthetic.main.itempengumuman.view.*

class AdapterPengumuman(private val ListPengumuman : List<String>,
                        private val Tgl : List<String>,
                        private val image : IntArray,
                        private var onclick : (Int)->Unit
                        )
    :RecyclerView.Adapter<AdapterPengumuman.ViewHolder>() {
    class ViewHolder(view : View):RecyclerView.ViewHolder(view) {
        val pengumuman = view.judul
        val tanggal = view.tgl
        val image = view.gambarx

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.itempengumuman,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = ListPengumuman.get(position)
        holder.pengumuman.text = ListPengumuman[position]
        holder.tanggal.text = Tgl[position]
        holder.image.setImageResource(image[position])
        holder.itemView.setOnClickListener {
            onclick(position)
        }

    }

    override fun getItemCount(): Int {
        return ListPengumuman.size
    }


}