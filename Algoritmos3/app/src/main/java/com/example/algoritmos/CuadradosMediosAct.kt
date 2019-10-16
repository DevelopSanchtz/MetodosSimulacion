package com.example.algoritmos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cuadrados_medios.*

class CuadradosMediosAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuadrados_medios)

        generarcuadrada.setOnClickListener(){
            var semillavalor = semillacuadrada.text.toString().toInt()

        for (num in 1..10) {

            var cuadrada = (semillavalor*semillavalor)

                var metodosemilla = cuadrada.toString()
                    var tam = metodosemilla.length

            if (metodosemilla.length % 2 != 0) {
                    metodosemilla = "0$metodosemilla"
                        tam++
            }

            metodosemilla = "${metodosemilla.substring((tam / 2) - 2, tam / 2 + 2)}"

                var semillastring = metodosemilla

                    semillavalor = semillastring.toInt()

                        var ri = "0.$semillastring"

            if (num<=5)
                mostrarcuadrada.append("R$num = $ri \n")
                    else
                        mostrar2cuadrada.append("R$num = $ri \n")
            }
        }
    }
}
