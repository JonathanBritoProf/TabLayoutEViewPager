package br.digitalhouse.exercicioaula

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabsAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var listaDeFragmentos : MutableList<Fragment> = mutableListOf()

    fun add(fragmento : Fragment){
        this.listaDeFragmentos.add(fragmento)
    }

    override fun getCount(): Int {
        return listaDeFragmentos.size
    }

    override fun getItem(position: Int): Fragment {
        return listaDeFragmentos.get(position)
    }

}