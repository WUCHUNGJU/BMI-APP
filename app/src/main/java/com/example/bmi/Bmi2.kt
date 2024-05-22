package com.example.bmi

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmi.databinding.ActivityBmi2Binding

class Bmi2 : AppCompatActivity() {
    private lateinit var binding:ActivityBmi2Binding  //binding
    val cal=Bmical();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
     //   setContentView(R.layout.activity_bmi2)
        binding=ActivityBmi2Binding.inflate(layoutInflater)  //binding
        setContentView(binding.root) //binding
/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        binding.calbmi.setOnClickListener{
            if(!binding.weight.text.contains("") && binding.height.text.contains("")) {
                cal.weight = binding.weight.text.toString().toFloat()
                cal.height = binding.height.text.toString().toFloat()
                // val message=cal.fun
                AlertDialog.Builder(this)
                    .setMessage("${cal.bmi()}")
                    .setTitle("Your BMI")
                    .setPositiveButton("OK", null)
                    //.setNeutralButton("Cancel", null)
                    .show()
            }
            else Toast.makeText(this,"Please enter weight and height",Toast.LENGTH_LONG).show()
        }
    }
}