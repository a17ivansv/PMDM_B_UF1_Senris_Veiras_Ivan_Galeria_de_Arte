package com.example.proyectofinal_noticias

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView

import androidx.navigation.findNavController

class Fragmento_Inicio : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_fragmento__inicio, container, false)
        val botonVisualizar = view.findViewById<Button>(R.id.Boton_Inicio)
        val botoncreditos = view.findViewById<Button>(R.id.Boton_Creditos)

        botonVisualizar.setOnClickListener {
            //Nos devuelve el controlador
            view.findNavController().navigate(R.id.action_fragmento_Inicio_to_galeria_obras)
        }

        botoncreditos.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragmento_Inicio_to_creditos)
        }



        return view;
    }
}