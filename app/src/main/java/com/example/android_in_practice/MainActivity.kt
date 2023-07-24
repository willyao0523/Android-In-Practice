package com.example.android_in_practice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
//            Toast.makeText(this, "You clicked Button", Toast.LENGTH_SHORT).show()

//            finish()

//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)

//            val intent = Intent("com.example.android_in_practice.ACTION_START")
//            intent.addCategory("com.example.android_in_practice.My_CATEGORY")
//            startActivity(intent)

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.baidu.com")
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show()
        }
        return true
    }
}