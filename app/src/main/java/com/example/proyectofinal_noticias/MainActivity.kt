package com.example.proyectofinal_noticias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
           R.id.Calendario ->  Toast.makeText(this,"Calendario",Toast.LENGTH_SHORT).show()
            R.id.perfil -> Toast.makeText(this,"Perfil",Toast.LENGTH_SHORT).show()
            R.id.salir -> finish();

        }
        return super.onOptionsItemSelected(item)
    }
}