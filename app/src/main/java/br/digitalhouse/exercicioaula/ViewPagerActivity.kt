package br.digitalhouse.exercicioaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        var adapter = TabsAdapter(supportFragmentManager)
        adapter.add(Fragmento1.criarFragmento())
        adapter.add(Fragmento2.criarFragmento())

        var pager = findViewById<ViewPager>(R.id.pager)
        pager.adapter = adapter

        var tabLayout = findViewById<TabLayout>(R.id.mytablayout)
        tabLayout.setupWithViewPager(pager)
    }
}