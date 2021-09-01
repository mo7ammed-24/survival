package com.example.tokyoolympicresult.data.domain

data class CountryResult(
    val rank:Int,
    val countryName:String,
    val goldMedal:Int,
    val silverMedal:Int,
    val bronzeMedal:Int)