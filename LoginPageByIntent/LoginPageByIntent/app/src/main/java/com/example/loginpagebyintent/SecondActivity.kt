package com.example.loginpagebyintent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpagebyintent.databinding.SecondActivityBinding

class SecondActivity: AppCompatActivity() {

    private lateinit var binding: SecondActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = intent.getStringExtra("name")
        var code = intent.getStringExtra("code")
        binding.tvTest.text = "Name = $name - Code = $code"

        binding.btnBack.setOnClickListener {
            val intent = Intent()
            intent.putExtra("Result" , "is Done")
            setResult(RESULT_OK , intent)
            this.finish()
        }
    }
}