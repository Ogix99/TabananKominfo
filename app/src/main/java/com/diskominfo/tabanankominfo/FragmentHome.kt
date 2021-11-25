package com.diskominfo.tabanankominfo

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txt2.text = param1

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

        val adapterPengumuman = AdapterPengumuman(pengumuman, tanggal, image) {
            val data = Intent(context, DetailPengumuman::class.java)
            data.putExtra("pengumuman", pengumuman.get(it))
            startActivity(data)
        }
        rvhome.layoutManager = LinearLayoutManager(context)
        rvhome.adapter = adapterPengumuman

    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentHome.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String) =
            FragmentHome().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }

    }
}