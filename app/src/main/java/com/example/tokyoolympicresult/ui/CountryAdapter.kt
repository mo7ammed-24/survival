package com.example.tokyoolympicresult.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympicresult.R
import com.example.tokyoolympicresult.data.domain.CountryResult
import com.example.tokyoolympicresult.ui.viewHolders.CountryViewHolder

class CountryAdapter(val list:List<CountryResult>):RecyclerView.Adapter<CountryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_country,parent,false)
        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val currentCountry=list[position]
        holder.apply{
            theCountryName.text=currentCountry.countryName
            theCountryGold.text=currentCountry.goldMedal.toString()
            theCountrySilver.text=currentCountry.silverMedal.toString()
            theCountryBronze.text=currentCountry.bronzeMedal.toString()
        }
    }

    override fun getItemCount()=list.size
}