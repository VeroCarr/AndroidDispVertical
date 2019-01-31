package org.unitec.dispisicionvertical

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Vamos a invocar el servicio del vibrador

            //***side note
                //getSystemService proviene del metodo AppCompatActivity
                //getSystemService: este metodo nos obtiene un servicio del sistema, el que le
                    //pasemos como argumento (.Vibrator_Service)

        var vibrador= getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibrador.vibrate(3000)

    }
}



