
package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity  : AppCompatActivity (){
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val pass = binding.edtPass.text.toString()
        val cmfpass = binding.edtConfpass.text.toString()



        binding.btmSignup.setOnClickListener {

            if (pass != cmfpass)
            {
                Toast.makeText(this, "Confirm password and password are differant", Toast.LENGTH_LONG).show()

            }
            else
            {
                Toast.makeText(this, "Signed in successfully", Toast.LENGTH_LONG).show()
            }
        }

        binding.btmGoogle.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(intent)

        }
        binding.btmTwitter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://x.com/"))
            startActivity(intent)

        }
        binding.btmFacebook.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"))
            startActivity(intent)

        }

    }
}