package com.shweta.messageshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shweta.messageshareapp.databinding.ActivityMainBinding
import com.shweta.messageshareapp.view.SecondActivity

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.button.setOnClickListener {
            val msg = activityMainBinding.etMessage.text.toString()
            Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}