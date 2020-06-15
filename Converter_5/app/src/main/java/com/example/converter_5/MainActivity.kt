package com.example.converter_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun convert(view: View) {
        val roubles = Roubles.text.toString()
        if (roubles != "") {
            val usd = BigDecimal(roubles.toDouble() / 74).setScale(2, RoundingMode.HALF_EVEN)
            USD.setText(usd.toString())
        }
    }
}