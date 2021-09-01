package com.example.tokyoolympicresult.ui.viewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tokyoolympicresult.R

class CountryViewHolder(viewItem: View):RecyclerView.ViewHolder(viewItem) {
    var theCountryName=viewItem.findViewById<TextView>(R.id.country_text)
    var theCountryGold=viewItem.findViewById<TextView>(R.id.gold_text)
    var theCountrySilver=viewItem.findViewById<TextView>(R.id.silver_text)
    var theCountryBronze=viewItem.findViewById<TextView>(R.id.bronze_text)
}