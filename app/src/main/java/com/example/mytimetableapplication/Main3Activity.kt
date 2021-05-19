package com.example.mytimetableapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_blank2.*

class Main3Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_blank2)
        textView10.text= intent.extras?.get("n_enseignant").toString()
        textView11.text= intent.extras?.get("grade_enseignant").toString()
        textView12.text= intent.extras?.get("dn_enseignant").toString()
        textView13.text= intent.extras?.get("spe_enseignant").toString()

    }
}