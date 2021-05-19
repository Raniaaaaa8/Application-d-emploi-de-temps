package com.example.mytimetableapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_blank.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_blank)
        textView5.text= intent.extras?.get("intitul").toString()
        textView6.text= intent.extras?.get("durée totale").toString()
        textView7.text= intent.extras?.get("enseignant").toString()

        textView7.setOnClickListener{
            if (intent.extras?.get("enseignant").toString()=="Mr.Baghdadi"){
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("n_enseignant", "Baghdadi Amine ")
                intent.putExtra("dn_enseignant", "08/04/1971 ")
                intent.putExtra("grade_enseignant", "Maitre assitant A ")
                intent.putExtra("spe_enseignant", "SI ")
                startActivity(intent)


             }

            if (intent.extras?.get("enseignant").toString()=="Mr.chergou"){
                val intent = Intent(this, Main3Activity::class.java)
                intent.putExtra("n_enseignant", "Chergou Badrtemam ")
                intent.putExtra("dn_enseignant", "05/09/1961 ")
                intent.putExtra("grade_enseignant", "Professeur")
                intent.putExtra("spe_enseignant", "SI ")
                startActivity(intent)


            }


        }

    }
}