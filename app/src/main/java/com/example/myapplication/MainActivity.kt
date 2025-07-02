package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        println("onCreate calıştı")
    }

    override fun onStart() {
        super.onStart()
        println("onStart calıştı")
    }

    override fun onResume() {
        super.onResume()
        println("onResume calıştı")
    }

    override fun onPause() {
        super.onPause()
        println("onPause calıştı")
    }

    override fun onStop() {
        super.onStop()
        println("onStop calıştı")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy calıştı")
    }

    fun sonrakiSayfa(view: View) {

        val intent = Intent(this,SecondActivity::class.java)
        val kullaniciGirdisi = binding.editTextText.text.toString()
        intent.putExtra("name",kullaniciGirdisi)
        startActivity(intent)
        /*
        val kullaniciGirdisi = binding.editTextText.text.toString()
        binding.textView.text = "İsim: $kullaniciGirdisi" */

    }

    fun alertM(view: View) {
        val intent = Intent(this,AlertDialog::class.java)
        startActivity(intent)
    }

    fun kayit(view: View) {
        val intent = Intent(this,SharedPref::class.java)
        startActivity(intent)
    }

    fun hesap(wiew: View){
       val intent = Intent(this, Calcutre::class.java)
        startActivity(intent)
    }

}