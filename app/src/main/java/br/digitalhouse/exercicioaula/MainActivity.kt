package br.digitalhouse.exercicioaula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btnTabLayout)
        btn.setOnClickListener {
            var intent = Intent(this, TabLayoutActivity :: class.java)
            startActivity(intent)
        }

        var btn2 = findViewById<Button>(R.id.btnViewPager)
        btn2.setOnClickListener {
            var intent2 = Intent(this,ViewPagerActivity :: class.java)
            startActivity(intent2)
        }
    }
}