package com.example.proyectofinal_noticias

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class creditos : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_creditos, container, false)

        val barravaloracion = view.findViewById<RatingBar>(R.id.Creditos_Valoracion)

        if (barravaloracion != null)
        {
            val botonvaloracion = view.findViewById<Button>(R.id.Creditos_Boton_Valorar)

            botonvaloracion.setOnClickListener {
                val msg = barravaloracion.rating.toString()
                Toast.makeText(this.getContext(),"Su valoración es de : "+msg,Toast.LENGTH_SHORT).show()
            }

        }


        return view
    }

}