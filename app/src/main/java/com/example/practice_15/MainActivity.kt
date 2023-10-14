package com.example.practice_15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        fun buttonSentClick(view: View){
            val nameEditText: EditText = findViewById(R.id.editText)
            val breedEditText: EditText = findViewById(R.id.editText2)
            val yearEditText: EditText = findViewById(R.id.editText3)
            val monthEditText: EditText = findViewById(R.id.editText4)

            val name = nameEditText.text.toString()
            val breed = breedEditText.text.toString()
            val year = yearEditText.text.toString().toInt()
            val month = monthEditText.text.toString().toInt()

            val animal: Animal = Animal(name, breed, year, month)

            val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra(animal.javaClass.simpleName, animal)
            startActivity(intent)

        }
    }
}