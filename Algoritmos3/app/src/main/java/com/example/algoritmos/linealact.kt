package com.example.algoritmos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_linealact.*

class linealact : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linealact)

        generar.setOnClickListener(){

            var semillavalor = semilla.text.toString().toDouble()
                val avalor = a.text.toString().toDouble()
                    val cvalor= c.text.toString().toDouble()
                        val mvalor = m.text.toString().toDouble()

            for(num in 1..10) {

                var primeraoperacion = ((avalor * semillavalor) + cvalor)
                    semillavalor = (primeraoperacion % mvalor)
                        var ri = (semillavalor / (mvalor-1)).toFloat()

                            var ri4 = "%.4f".format(ri)

                if(num <=5)
                    mostrar.append("R $num = $ri4 \n")
                        else
                            mostrar2.append("R $num = $ri4 \n")
            }
        }
    }
}
