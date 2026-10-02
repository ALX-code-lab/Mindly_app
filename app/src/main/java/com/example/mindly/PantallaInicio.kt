package com.example.mindly

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class PantallaInicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.pantalla_inicio)

        val botonIniciarSesion =
            findViewById<android.view.View>(R.id.botonIniciarSesion)

        val botonCrearCuenta =
            findViewById<android.view.View>(R.id.botonCrearCuenta)
        botonCrearCuenta.backgroundTintList = null
        botonIniciarSesion.setOnClickListener {

            // Más adelante abriremos la pantalla de inicio de sesión

        }

        botonCrearCuenta.setOnClickListener {

            val intent = Intent(
                this,
                PantallaCrearCuenta::class.java
            )

            startActivity(intent)

        }
    }
}

