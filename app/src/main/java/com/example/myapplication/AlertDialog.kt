package com.example.myapplication

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityAlertDiyalogBinding

class AlertDialog : AppCompatActivity() {

    private lateinit var binding: ActivityAlertDiyalogBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityAlertDiyalogBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)



        setContentView(R.layout.activity_alert_diyalog)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Toast.makeText(applicationContext, "Alert Sayfası", Toast.LENGTH_SHORT).show()
    }

    fun kaydet (view: View){
        val alert = AlertDialog.Builder(this@AlertDialog)
        alert.setTitle("Kaydet")
        alert.setMessage("Kaydetmek istediğinize emin misiniz?")

        alert.setPositiveButton("Evet")  { dialog, which ->
            Toast.makeText(applicationContext, "Kayıt Başarılı", Toast.LENGTH_SHORT).show()
        }

        alert.setNegativeButton("Hayır", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@AlertDialog, "Kayıt Başarısız", Toast.LENGTH_SHORT).show()

            }
        })

        alert.show()
    }

}