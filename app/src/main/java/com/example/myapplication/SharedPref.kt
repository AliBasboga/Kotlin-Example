package com.example.myapplication

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivitySharedPrefBinding

class SharedPref : AppCompatActivity() {

    private lateinit var binding: ActivitySharedPrefBinding
    lateinit var sharedPreferences: SharedPreferences
    var alinanVeri: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivitySharedPrefBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        sharedPreferences = this.getSharedPreferences("com.example.myapplication", Context.MODE_PRIVATE)

        alinanVeri = sharedPreferences.getString("kullanici","")
        if (alinanVeri == ""){
         binding.textView3.text = "Adın:"
        }else{
            binding.textView3.text = "Adın: $alinanVeri"
        }
    }


    fun kay(view: View) {
        val kullaniciAdi = binding.editTextText2.text.toString()

        if (kullaniciAdi == ""){
            Toast.makeText(this@SharedPref, "Lütfen Adınızı Giriniz", Toast.LENGTH_SHORT).show()
        }else{
           sharedPreferences.edit().putString("kullanici",kullaniciAdi).apply()
            binding.textView3.text = "Adın: $kullaniciAdi"
        }
    }

    fun sil(view: View) {
        alinanVeri = sharedPreferences.getString("kullanici","")
        if (alinanVeri != ""){
            sharedPreferences.edit().remove("kullanici").apply()
        }
        binding.textView3.text = "Adın:"
    }

}