package com.example.algoritmos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_productos_medios.*

class ProductosMediosAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos_medios)

        generarpm.setOnClickListener() {
            var valorsemilla = semillapm.text.toString().toInt()
                var valoruno = x1pm.text.toString().toInt()


            for(num in 1..10) {

            var multiplicacion = (valorsemilla * valoruno)
                var metodosemilla = multiplicacion.toString()
                var tam = metodosemilla.length

                if (metodosemilla.length % 2 != 0) {
                    metodosemilla = "0$metodosemilla"
                    tam++
                }

                metodosemilla = "${metodosemilla.substring((tam / 2) - 2, tam / 2 + 2)}"

                var semillastring = metodosemilla
                var semillasint = semillastring.toInt()

                var unonew = valoruno

                valorsemilla = unonew
                valoruno = semillasint



                var ri = "0.$semillastring"

                if(num<=5){
                   mostrarpm.append("R$num = $ri \n")
                } else {
                        mostrar2pm.append("R$num = $ri \n")
                }

            }
        }
    }
}
