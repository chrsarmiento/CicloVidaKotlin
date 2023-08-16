package com.desafiolatam.ciclovidakotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import com.desafiolatam.ciclovidakotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("CICLO DE VIDA", "onCreate: Se ha ejecutado el método CREATE en el PRIMER ACTIVITY")

        binding.textView.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i("CICLO DE VIDA", "onStart: Se ha ejecutado el método START en el PRIMER ACTIVITY")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLO DE VIDA", "onResume: Se ha ejecutado el método RESUME en el PRIMER ACTIVITY")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLO DE VIDA", "onPause: Se ha ejecutado el método PAUSE en el PRIMER ACTIVITY")
    }

    override fun onStop(){
        super.onStop()
        Toast.makeText(applicationContext,"onStop: se ha ejecutado el método STOP",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLO DE VIDA", "onDestroy: Se ha ejecutado el método DESTROY en el PRIMER ACTIVITY")
    }

}