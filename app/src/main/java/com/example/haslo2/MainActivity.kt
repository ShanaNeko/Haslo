package com.example.haslo2

//1.Wprowadzenie hasła z podpowiedzią (hint)
//kontrolka checktext sprawdzające:
//2. czy hasła są zgodne
//3. czy jest duża litera
//4. czy jest mała litera
//5. czy jest cyfra
//6. czy jest znak specjalny
//7. ilość "commitów"
//Patrycja Kwiatkowska II pr

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aa = findViewById<TextInputEditText>(R.id.a2)
        val bb = findViewById<TextInputEditText>(R.id.b2)
        val spr = findViewById<Button>(R.id.sprawdź)
        val zgodne = findViewById<CheckBox>(R.id.zgodne)
        val wielka = findViewById<CheckBox>(R.id.duża)
        val mała = findViewById<CheckBox>(R.id.mała)
        val cyfra = findViewById<CheckBox>(R.id.cyfry)
        val znak = findViewById<CheckBox>(R.id.znak)

        spr.setOnClickListener{
            val a = aa.text.toString()
            val b = bb.text.toString()

            zgodne.isChecked = a == b
            wielka.isChecked = a.any { it.isUpperCase() }
            mała.isChecked = a.any { it.isLowerCase() }
            cyfra.isChecked = a.any { it.isDigit() }
            znak.isChecked = a.any { !it.isLetterOrDigit() }

        }

    }
}
