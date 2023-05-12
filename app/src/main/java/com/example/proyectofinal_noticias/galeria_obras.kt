package com.example.proyectofinal_noticias

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController

class galeria_obras : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_galeria_obras, container, false)

        val textviewelgrito = view.findViewById<TextView>(R.id.El_Grito)
        val textviewnocheestrellada = view.findViewById<TextView>(R.id.Noche_Estrellada)
        val textviewgotico = view.findViewById<TextView>(R.id.Gotico_EstadoUnidense)
        val textviewmeninas = view.findViewById<TextView>(R.id.Las_Meninas)
        val textviewguernica = view.findViewById<TextView>(R.id.Guernica)
        val textviewvenus = view.findViewById<TextView>(R.id.Nacimiento_Venus)


        textviewelgrito.setOnClickListener{
            //view.findNavController().navigate(R.id.action_galeria_obras_to_informacion_obra)
            val accion = galeria_obrasDirections.actionGaleriaObrasToInformacionObra(R.raw.elgrito)
            view.findNavController().navigate(accion)
        }

        textviewnocheestrellada.setOnClickListener{
            //view.findNavController().navigate(R.id.action_galeria_obras_to_informacion_obra)
            val accion = galeria_obrasDirections.actionGaleriaObrasToInformacionObra(R.raw.nocheestrellada)
            view.findNavController().navigate(accion)
        }

        textviewgotico.setOnClickListener{
            //view.findNavController().navigate(R.id.action_galeria_obras_to_informacion_obra)
            val accion = galeria_obrasDirections.actionGaleriaObrasToInformacionObra(R.raw.goticoestadounidense)
            view.findNavController().navigate(accion)
        }

        textviewmeninas.setOnClickListener{
            //view.findNavController().navigate(R.id.action_galeria_obras_to_informacion_obra)
            val accion = galeria_obrasDirections.actionGaleriaObrasToInformacionObra(R.raw.meninas)
            view.findNavController().navigate(accion)
        }

        textviewguernica.setOnClickListener{
            //view.findNavController().navigate(R.id.action_galeria_obras_to_informacion_obra)
            val accion = galeria_obrasDirections.actionGaleriaObrasToInformacionObra(R.raw.guernica)
            view.findNavController().navigate(accion)
        }

        textviewvenus.setOnClickListener{
            //view.findNavController().navigate(R.id.action_galeria_obras_to_informacion_obra)
            val accion = galeria_obrasDirections.actionGaleriaObrasToInformacionObra(R.raw.venus)
            view.findNavController().navigate(accion)
        }
        return view
    }

}