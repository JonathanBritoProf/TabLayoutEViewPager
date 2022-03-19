package br.digitalhouse.exercicioaula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.tabs.TabLayout

class TabLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)
        var tabLayout = findViewById<TabLayout>(R.id.tablayout)
        gerenciartabs(tabLayout)


    }

    fun gerenciartabs (tabLayout: TabLayout){
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if(null != tab){
                    when(tab.position){
                        0 -> supportFragmentManager.beginTransaction().replace(R.id.mycontainer,Fragmento1.criarFragmento()).commit()
                        else -> supportFragmentManager.beginTransaction().replace(R.id.mycontainer,Fragmento2.criarFragmento()).commit()
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@TabLayoutActivity,"Saindo da Tab",Toast.LENGTH_SHORT).show()
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@TabLayoutActivity,"Reselecionando Tab",Toast.LENGTH_SHORT).show()
            }


        })
    }
}