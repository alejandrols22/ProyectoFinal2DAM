package com.example.myapplicationfinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    // Maneja las selecciones del menú aquí
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Aquí puedes manejar las acciones de los submenús
        return when (item.itemId) {
            R.id.nav_inicio -> { true }
            // Maneja más casos aquí
            else -> super.onOptionsItemSelected(item)
        }
    }
}

