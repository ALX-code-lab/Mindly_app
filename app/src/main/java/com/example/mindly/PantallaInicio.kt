package com.example.mindly

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PantallaInicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.pantalla_inicio)

        val botonIniciarSesion =
            findViewById<android.view.View>(R.id.botonIniciarSesion)

        val botonCrearCuenta =
            findViewById<android.view.View>(R.id.botonCrearCuenta)

        botonIniciarSesion.setOnClickListener {

            // Más adelante abriremos la pantalla de inicio de sesión

        }

        botonCrearCuenta.setOnClickListener {

            // Más adelante abriremos la pantalla de registro

        }
    }
}

