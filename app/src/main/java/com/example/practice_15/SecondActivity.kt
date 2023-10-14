@file:Suppress("DEPRECATION")

package com.example.practice_15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.textView2)
        var animal: Animal = Animal()

        val arguments: Bundle? = intent.extras
        if (arguments != null){
            animal = arguments.getParcelable<Animal>(animal.javaClass.simpleName) as Animal

            textView.text = "Month of birth: ${animal.getBirthMonth()}\nYear Of birth: ${animal.getBirthYear()}\n${animal.getBreed()}\n${animal.getName()}"
        }




    }
}