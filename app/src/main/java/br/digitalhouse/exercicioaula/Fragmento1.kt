package br.digitalhouse.exercicioaula

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragmento1 : Fragment(R.layout.fragmento1) {

    companion object{
        fun criarFragmento () = Fragmento1()
    }

}