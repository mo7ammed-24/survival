package com.example.tokyoolympicresult.data

import com.example.tokyoolympicresult.data.domain.CountryResult

object DataManager {
    val countryList= mutableListOf<CountryResult>()
    val countryes:List<CountryResult>
    get()=countryList

    fun addCountry(countryDetails:CountryResult){
        countryList.add(countryDetails)
    }
}