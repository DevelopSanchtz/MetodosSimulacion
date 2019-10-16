package com.example.algoritmos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_congruencial_cuadratico.*

class CongruencialCuadraticoAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congruencial_cuadratico)

        generarcc.setOnClickListener(){
            val valora = acc.text.toString().toDouble()
                val valorb = bcc.text.toString().toDouble()
                    val valorc = ccc.text.toString().toDouble()
                        val valorm = mcc.text.toString().toDouble()
                            var valorsemilla = semillacc.text.toString().toDouble()

            for(num in 1..10) {
                var operacion = (((valora)*(valorsemilla*valorsemilla))*(valorb*valorsemilla))+valorc
                    valorsemilla = operacion%valorm
                        var ri = (valorsemilla/(valorm-1)).toFloat()

                        var ri4 = "%.4f".format(ri)

                if(num <= 5) {
                    mostrarcc.append("R$num = $ri4 \n")
                }else{
                        mostrarcc2.append("R$num = $ri4 \n")
                }
            }

        }
    }
}
