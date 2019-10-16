package com.example.algoritmos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_congruencial_multiplicador.*
import kotlinx.android.synthetic.main.activity_linealact.*
import kotlinx.android.synthetic.main.activity_linealact.semilla
import kotlinx.android.synthetic.main.activity_main.*

class CongruencialMultiplicadorAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congruencial_multiplicador)

        generarcm.setOnClickListener() {
            var valorsemilla = semillacm.text.toString().toDouble()
                val valork = kcm.text.toString().toDouble()
                    val valorg = gcm.text.toString().toDouble()
                        val valorm =  mcm.text.toString().toDouble()
                            val valora = 5 + (8*valork)


            for(num in 1..10){

         var equis = (valora * valorsemilla)
            valorsemilla = (equis%valorm)
                var ri = (valorsemilla / (valorm-1)).toFloat()

                    var ri4 = "%.4f".format(ri)

             if(num <= 5)
                 mostrarcm.append("R $num = $ri4 \n")
                    else
                        mostrar2cm.append("R $num = $ri4 \n")

            }

        }
    }
}
