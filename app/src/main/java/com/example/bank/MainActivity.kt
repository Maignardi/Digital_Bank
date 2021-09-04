package com.example.bank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bank.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigation()
    }

    private fun navigation(){
        binding.run{
            imgBalance.setOnClickListener {
                val intent = Intent(this@MainActivity, Balance::class.java)
                startActivity(intent)
                finish()
            }
            imgDebts.setOnClickListener {
                val intent = Intent(this@MainActivity, Debts::class.java)
                startActivity(intent)
                finish()
            }
            imgTransfer.setOnClickListener {
                val intent = Intent(this@MainActivity, Transfer::class.java)
                startActivity(intent)
                finish()
            }
            imgSavings.setOnClickListener {
                val intent = Intent(this@MainActivity, Savings::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}