package com.example.bank

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.bank.databinding.ActivitySavingsBinding

class Savings : AppCompatActivity() {

    private lateinit var binding: ActivitySavingsBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavingsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()
        toolBar()
    }
    @RequiresApi(Build.VERSION_CODES.M)
    private fun toolBar(){
        var toolbar = binding.tbSavings
        toolbar.run{
            title = "Savings"
            setTitleMargin(200,0,200,0)
            setTitleTextColor(getColor(R.color.white))
            setBackgroundColor(getColor(R.color.light_blue))
            setNavigationIcon(getDrawable(R.drawable.ic_back))
            setNavigationOnClickListener{
                val intent = Intent( this@Savings, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}