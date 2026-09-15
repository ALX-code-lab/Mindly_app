package com.example.mindly

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pantallaInicial = Intent(
            this,
            PantallaPrincipal::class.java
        )

        startActivity(pantallaInicial)
        finish()
    }
}