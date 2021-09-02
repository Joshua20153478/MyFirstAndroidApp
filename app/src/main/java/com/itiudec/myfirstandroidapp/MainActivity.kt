package com.itiudec.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


// Espacio para poner valores
        val valorA = findViewById<EditText>(R.id.txtValorA)
        val valorB = findViewById<EditText>(R.id.txtValorB)

// Espacio para el Resultado
        val res = findViewById<TextView>(R.id.Resultado)

//Boton
        val obtener = findViewById<Button>(R.id.obtener)
            .setOnClickListener() {

                //validacion que los campos no esten vacios
                if (valorA.text.isEmpty() || valorB.text.isEmpty()) {
                    res.text = "favor de rellenar los datos correctamente"
                }
                // validar si son dos digitos o uno
                else {
                    val a: String = valorA.text.toString()
                    val b: Int = (valorB.text.toString()).toInt()
                    var age1 = 0
                    var age2 = 0
                    var LuckNum = 0
                    var LuckNum1 = 0
                    var mul = 0
                    //verifica que tengas menos de 90
                    if (b > 90) {
                        res.text = "estas muy viejo"
                    }
                    //valida que sean 2 digitos
                    else if (b >= 10 && b <= 90) {
                        age1 = b / 10
                        age2 = b % 10
                        LuckNum = age1 + age2
                        //validar si volvio a ser dos digitos
                        if (LuckNum >= 10 && LuckNum <= 90) {
                            age1 = LuckNum / 10
                            age2 = LuckNum % 10
                            LuckNum1 = age1 + age2
                            res.text = "Bienvenido ${a} tu número de la suerte es ${LuckNum1}"
                        }
                        //si tiene un digito se imprime
                        else {
                            res.text = "Bienvenido ${a} tu número de la suerte es ${LuckNum}"
                        }
                    }
                    //valida que tenga un digito
                    else if (b > 0 && b <= 9) {
                        mul = b * 7
                        //valida que tenga 2 digitos
                        if (mul >= 10 && mul <= 90) {
                            age1 = mul / 10
                            age2 = mul % 10
                            LuckNum = age1 + age2
                            //valida de nuevo que tenga 2 digitos
                            if (LuckNum >= 10 && LuckNum <= 13) {
                                age1 = LuckNum / 10
                                age2 = LuckNum % 10
                                LuckNum1 = age1 + age2
                                res.text = "Bienvenido ${a} tu número de la suerte es ${LuckNum1}"
                            }
                            else {
                                res.text = "Bienvenido ${a} tu número de la suerte es ${LuckNum}"
                            }
                        }
                        //si solo tiene 1 digito imprime
                        else {
                            res.text = "Bienvenido ${a} tu número de la suerte es ${mul}"
                        }
                    }
                    //valida que el numero sea mayor a 0
                    else {
                        res.text = "todavía no naces"
                    }
                }
            }
    }
}
