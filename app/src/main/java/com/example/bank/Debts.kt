package com.example.bank

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.bank.databinding.ActivityDebtsBinding

class Debts : AppCompatActivity() {

    private lateinit var binding: ActivityDebtsBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDebtsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar!!.hide()
        toolBar()
    }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun toolBar(){
        var toolbar = binding.tbDebts
        toolbar.run{
            title = "Debts"
            setTitleMargin(200,0,200,0)
            setTitleTextColor(getColor(R.color.white))
            setBackgroundColor(getColor(R.color.light_blue))
            setNavigationIcon(getDrawable(R.drawable.ic_back))
            setNavigationOnClickListener{
                val intent = Intent( this@Debts, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}