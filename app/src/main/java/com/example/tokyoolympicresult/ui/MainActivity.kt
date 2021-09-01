package com.example.tokyoolympicresult.ui


import android.view.LayoutInflater
import com.example.tokyoolympicresult.data.DataManager
import com.example.tokyoolympicresult.databinding.ActivityMainBinding
import com.example.tokyoolympicresult.util.CsvParser
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val Log_TAG: String="MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding=ActivityMainBinding::inflate

    override fun setUp() {
        parseFile()
        val adapter=CountryAdapter(DataManager.countryes)
        binding!!.recyclerCountry.adapter=adapter
    }


    private fun parseFile(){
        val inputStream=assets.open("tokyoOlympics.csv")
        val buffer=BufferedReader(InputStreamReader(inputStream))
        val parser=CsvParser()
        buffer.forEachLine {
            val currentCountry=parser.parse(it)
            DataManager.addCountry(currentCountry)
        }
    }

}