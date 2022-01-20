package com.example.loginpagebyintent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginpagebyintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnGo.setOnClickListener {
            val intent = Intent(this ,SecondActivity::class.java).apply {
                putExtra("name" , binding.edName1.text.toString())
                putExtra("code" , binding.edCode1.text.toString())
            }
            startActivityForResult(intent , 2000)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 2000 && resultCode == RESULT_OK){
            var result:String = data?.getStringExtra("Result")?:"Null"
            binding.tvResult.text = result
        }
    }
}