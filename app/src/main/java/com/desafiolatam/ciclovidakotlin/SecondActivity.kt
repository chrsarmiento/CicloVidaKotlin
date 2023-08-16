package com.desafiolatam.ciclovidakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.desafiolatam.ciclovidakotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            //finish()
        }

        Log.i("CICLO DE VIDA", "onCREATE: Se ha ejecutado el método CREATE en el SEGUNDO ACTIVITY")
    }

    override fun onStart() {
        super.onStart()
        Log.i("CICLO DE VIDA", "onStart: Se ha ejecutado el método START en el SEGUNDO ACTIVITY")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLO DE VIDA", "onResume: Se ha ejecutado el método RESUME en el SEGUNDO ACTIVITY")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLO DE VIDA", "onPause: Se ha ejecutado el método PAUSE en el SEGUNDO ACTIVITY")
    }

    override fun onStop(){
        super.onStop()
        Toast.makeText(applicationContext,"onStop: se ha ejecutado el método STOP", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLO DE VIDA", "onDestroy: Se ha ejecutado el método DESTROY en el SEGUNDO ACTIVITY")
    }


}