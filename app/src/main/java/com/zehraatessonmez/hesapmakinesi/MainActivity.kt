package com.zehraatessonmez.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.zehraatessonmez.hesapmakinesi.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression
import java.lang.Exception
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {


    private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        tasarim.buttonAC.setOnClickListener {
            tasarim.islem.text = ""
            tasarim.sonuc.text = "0"
        }

        tasarim.buttonZero.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("0")
        }
        tasarim.buttonOne.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("1")
        }
        tasarim.buttonTwo.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("2")
        }
        tasarim.buttonThree.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("3")
        }
        tasarim.buttonFour.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("4")
        }
        tasarim.buttonFive.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("5")
        }
        tasarim.buttonSix.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("6")
        }
        tasarim.buttonSeven.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("7")
        }
        tasarim.buttonEight.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("8")
        }
        tasarim.buttonNine.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("9")
        }
        tasarim.buttonPlus.setOnClickListener {
            tasarim.islem.text = buttonNumberAsText("+")
        }
        tasarim.buttonResult.setOnClickListener {
            result()
        }
    }

    private fun result() {
        try {

            val deger = tasarim.islem.text.toString()
            val result = Expression(deger).calculate()

            if (result.isNaN()){

            }else{
                tasarim.sonuc.text = result.toString()
            }
        }catch (e: Exception){

        }

    }

    private fun buttonNumberAsText(btnValue:String): String {
        return "${tasarim.islem.text}$btnValue"
    }


}


