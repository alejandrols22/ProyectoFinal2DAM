package com.example.myapplicationfinal

import android.view.MenuItem
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        toolbar.setNavigationIcon(R.drawable.ic_menu_icon)

        val fabChat: FloatingActionButton = findViewById(R.id.fab_chat)
        fabChat.setOnClickListener {
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu) // Use the menu you want to display
        return true
    }


    // Aquí manejarías los clics en los ítems del menú
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_inicio -> {
                // Haz algo cuando se presione Inicio
                return true
            }
            // Maneja otros casos aquí
        }
        return super.onOptionsItemSelected(item)
    }
}


