package com.example.algoritmos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_multiplicador_constante.*

class MultiplicadorConstanteAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplicador_constante)

        generarconstante.setOnClickListener() {
            val valora = aconstante.text.toString().toInt()
                var valorsemilla = semillaconstante.text.toString().toInt()

            for (num in 1..10) {

                var multiplicacion = (valora*valorsemilla)

                var metodosemilla = multiplicacion.toString()
                    var tam = metodosemilla.length

                if (metodosemilla.length % 2 != 0) {
                        metodosemilla = "0$metodosemilla"
                            tam++
                }

                metodosemilla = "${metodosemilla.substring((tam / 2) - 2, tam / 2 + 2)}"

                    var semillastring = metodosemilla
                        valorsemilla = semillastring.toInt()

                var ri = "0.$semillastring"

                    if(num <=5 ) {
                        mostrarconstante.append("R$num = $ri \n")
                    } else {
                            mostrarconstante2.append("R$num = $ri \n")
                    }
            }
        }
    }
}
