package com.example.mindly

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.DecelerateInterpolator
import androidx.appcompat.app.AppCompatActivity

class PantallaPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.pantalla_principal)

        val logo = findViewById<View>(R.id.logoMindly)
        val nombre = findViewById<View>(R.id.nombreMindly)
        val eslogan = findViewById<View>(R.id.esloganMindly)

        // Aparece primero el logo
        aparecer(logo, 300)

        // Luego aparece el nombre
        aparecer(nombre, 1100)

        // Finalmente aparece el eslogan
        aparecer(eslogan, 1750)

        // Pasamos a la siguiente pantalla
        Handler(Looper.getMainLooper()).postDelayed({

            val siguientePantalla = Intent(
                this,
                PantallaInicio::class.java
            )

            startActivity(siguientePantalla)

            overridePendingTransition(
                android.R.anim.fade_in,
                android.R.anim.fade_out
            )

            finish()

        }, 4300)
    }

    private fun aparecer(
        elemento: View,
        retraso: Long
    ) {
        elemento.postDelayed({

            val animacion = AlphaAnimation(0f, 1f)

            animacion.duration = 900
            animacion.interpolator = DecelerateInterpolator()

            elemento.startAnimation(animacion)

            elemento.alpha = 1f

        }, retraso)
    }
}