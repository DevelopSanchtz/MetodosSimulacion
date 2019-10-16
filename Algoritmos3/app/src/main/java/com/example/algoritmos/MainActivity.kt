package com.example.algoritmos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        congruencialaditivo.setOnClickListener(){

            val algoritmo = Intent(this, CongruencialAditivoAct::class.java)
                startActivity(algoritmo)
                    Toast.makeText(this,"ALGORITMO CONGRUENCIAL ADITIVO", Toast.LENGTH_LONG).show()
        }

        congruencialcuadratico.setOnClickListener() {
            val algoritmo = Intent (this, CongruencialCuadraticoAct::class.java )
                startActivity(algoritmo)
                    Toast.makeText(this, "ALGORITMO CONGRUENCIAL CUADRATICO", Toast.LENGTH_LONG).show()
        }

        congruencialmultiplicador.setOnClickListener(){
            val algoritmo = Intent(this, CongruencialMultiplicadorAct::class.java)
                startActivity(algoritmo)
                    Toast.makeText(this, "ALGORIMO CONGRUENCIAL MULTIPLICATIVO", Toast.LENGTH_LONG).show()
        }

        cuadradosmedios.setOnClickListener() {
            val algoritmo = Intent(this, CuadradosMediosAct::class.java)
                startActivity(algoritmo)
                    Toast.makeText(this, "ALGORIMO CUADRADOS MEDIOS", Toast.LENGTH_LONG).show()
        }

        lineal.setOnClickListener(){
            val algoritmo = Intent(this, linealact::class.java)
                startActivity(algoritmo)
                    Toast.makeText(this,"ALGORITMO LINEAL", Toast.LENGTH_LONG).show()
        }

        multiplicadorconstante.setOnClickListener() {
            val algoritmo = Intent(this, MultiplicadorConstanteAct::class.java)
                startActivity(algoritmo)
                    Toast.makeText(this, "ALGORIMO MULTIPLICADOR CONSTANTE", Toast.LENGTH_LONG).show()
        }

        productosmedios.setOnClickListener(){
            val algoritmo = Intent(this, ProductosMediosAct::class.java)
                startActivity(algoritmo)
                    Toast.makeText(this, "ALGORIMO PRODUCTOS MEDIOS", Toast.LENGTH_LONG).show()
        }


    }
}
