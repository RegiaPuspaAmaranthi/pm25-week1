package com.pm.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pm.assignment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // binding objek pada UI XML
//        val edHello : EditText = findViewById(R.id.edHello)
//        val btnHello : Button = findViewById(R.id.btnHello)
//        val tvHello : TextView = findViewById(R.id.tvHello)

        binding.btnHello.setOnClickListener {
            var str : String = binding.edHello.text.toString()
            binding.tvHello.setText("Hello, $str")
        }
    }
}