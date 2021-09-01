package com.example.tokyoolympicresult.util

import com.example.tokyoolympicresult.data.domain.CountryResult

class CsvParser {
    fun parse(line:String):CountryResult{
    val tokens=line.split(",")
    return CountryResult(
        rank =tokens[Constant.columIndex.RANK].toInt(),
        countryName = tokens[Constant.columIndex.COUNTRY],
        goldMedal = tokens[Constant.columIndex.GOLD_MEDAL].toInt(),
        silverMedal = tokens[Constant.columIndex.SILVER_MEDAL].toInt(),
        bronzeMedal = tokens[Constant.columIndex.BRONZE_MEDAL].toInt()
    )
    }
}