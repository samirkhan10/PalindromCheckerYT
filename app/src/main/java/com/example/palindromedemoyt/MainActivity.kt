package com.example.palindromedemoyt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et = findViewById<EditText>(R.id.et)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {

            val getValue = et.text.toString()

            if (palindromeChecker(getValue)){
                Toast.makeText(this,"Palindrome Number ",Toast.LENGTH_LONG).show()
                et.setText("")
            }else{
                Toast.makeText(this,"Not a Palindrome Number ",Toast.LENGTH_LONG).show()
                et.setText("")

            }

        }

    }

    fun palindromeChecker(text:String):Boolean {
        val reverseString = text.reversed().toString()
        return text.equals(reverseString,ignoreCase = false)

    }
}