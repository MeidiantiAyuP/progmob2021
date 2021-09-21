package com.example.progmob2021.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.progmob2021.R
import com.example.progmob2021.R.layout.rv_item_dutatani
import com.example.progmob2021.model.Petani


class PetaniAdapter(val petani:List<Petani.Petani>) :
    RecyclerView.Adapter<PetaniAdapter.PetaniHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetaniAdapter.PetaniHolder {
    return PetaniHolder(LayoutInflater.from(parent.context).inflate(rv_item_dutatani,parent,false))
    }
    override fun onBindViewHolder(holder: PetaniAdapter.PetaniHolder, position: Int) {
        holder.bindPetani(petani[position])
    }
    override fun getItemCount(): Int {
        return petani.size
    }
    class PetaniHolder(view: View) : RecyclerView.ViewHolder(view) {
        lateinit var txtUser: TextView
        lateinit var txtNama: TextView
        lateinit var txtJumlahLahan: TextView
        lateinit var txtIdentifikasi: TextView
        lateinit var txtTambahLahan: TextView

        fun bindPetani(petani: Petani.Petani) {
            itemView.apply {
                txtUser = findViewById(R.id.textUser)
                txtNama = findViewById(R.id.textNama)
                txtJumlahLahan = findViewById(R.id.textJumlahLahan)
                txtIdentifikasi = findViewById(R.id.textIdentifikasi)
                txtTambahLahan = findViewById(R.id.textTambahLahan)

                txtUser.text = petani.user
                txtNama.text = petani.nama
                txtJumlahLahan.text = petani.jumlahLahan
                txtIdentifikasi.text = petani.identifikasi
                txtTambahLahan.text = petani.tambahLahan
            }
        }
    }
}



