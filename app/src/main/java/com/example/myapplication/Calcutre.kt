package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityCalcutreBinding

class Calcutre : AppCompatActivity() {

    private lateinit var binding: ActivityCalcutreBinding
    var sayi1: Int? = null
    var sayi2: Int? = null
    var sonuc: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityCalcutreBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun toplama(view: View) {
        sayi1 = binding.editTextNumber2.text.toString().toIntOrNull()
        sayi2 = binding.editTextNumber3.text.toString().toIntOrNull()

        if (sayi1 != null && sayi2 != null) {
            sonuc = sayi1!! + sayi2!!
            binding.textView4.text = "Sonuç: $sonuc"
        }else{
            binding.textView4.text = "Sayı giriniz"
        }
    }

    fun cikarma(view: View) {
        sayi1 = binding.editTextNumber2.text.toString().toIntOrNull()
        sayi2 = binding.editTextNumber3.text.toString().toIntOrNull()

        if (sayi1 != null && sayi2 != null) {
            sonuc = sayi1!! - sayi2!!
            binding.textView4.text = "Sonuç: $sonuc"
        }else{
            binding.textView4.text = "Sayı giriniz"
        }
    }

    fun carpma(view: View) {
        sayi1 = binding.editTextNumber2.text.toString().toIntOrNull()
        sayi2 = binding.editTextNumber3.text.toString().toIntOrNull()

        if (sayi1 != null && sayi2 != null) {
            sonuc = sayi1!! * sayi2!!
            binding.textView4.text = "Sonuç: $sonuc"
        }else{
            binding.textView4.text = "Sayı giriniz"
        }
    }

    fun bolme(view: View) {
        sayi1 = binding.editTextNumber2.text.toString().toIntOrNull()
        sayi2 = binding.editTextNumber3.text.toString().toIntOrNull()

        if (sayi1 != null && sayi2 != null) {
            sonuc = sayi1!! / sayi2!!
            binding.textView4.text = "Sonuç: $sonuc"
        }else{
            binding.textView4.text = "Sayı Girniz"
        }
    }
}