package com.example.proyectofinal_noticias

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RawRes
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class informacion_obra : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_informacion_obra, container, false)

        //Obtengo referencia a los textviews
        val textView = view.findViewById<TextView>(R.id.textView)
        val parametro = informacion_obraArgs.fromBundle(requireArguments()).archivo

        var string: String? = ""
        val stringBuilder = StringBuilder()
        val inputStream = this.resources.openRawResource(parametro)
        val reader = BufferedReader(InputStreamReader(inputStream))

        string = reader.readText()
        var valores = string.split("\n")

        //Añado el texto correspondiente al textview

        textView.text = string

    return view;

    }




}