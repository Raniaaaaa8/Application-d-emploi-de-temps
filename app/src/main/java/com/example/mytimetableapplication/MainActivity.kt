package com.example.mytimetableapplication

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 /*       var todolist = mutableListOf(
            Todo("Seance1"),
            Todo("Seance2"),
            Todo("Seance3"),
            Todo("Seance4"),
            Todo("Seance5")

        )
        val adopter =TodoAdapter(todolist)
        rvTodos.adapter= adopter
        rvTodos.layoutManager = LinearLayoutManager(this)
*/

       /* btnTodos.setOnClickListener{
            val title = etTodos.text.toString()
            val todo=Todo(title)
            todolist.add(todo)
            adopter.notifyItemInserted(todolist.size-1)

        }*/
        val orientation=resources.configuration.orientation
        if (orientation== Configuration.ORIENTATION_PORTRAIT) {
            textView2.setOnClickListener{

                val intent = Intent(this, Main2Activity::class.java)
                //intitulé, durée totale et enseignant
                intent.putExtra("intitul", "Math ")
                intent.putExtra("durée totale", "1h ")
                intent.putExtra("enseignant", "Mr.Baghdadi")

                startActivity(intent)
            }

            textView.setOnClickListener{

                val intent = Intent(this, Main2Activity::class.java)
                //intitulé, durée totale et enseignant
                intent.putExtra("intitul", "algo ")
                intent.putExtra("durée totale", "2h ")
                intent.putExtra("enseignant", "Mr.chergou")

                startActivity(intent)
            }

            textView3.setOnClickListener{

                val intent = Intent(this, Main2Activity::class.java)
                //intitulé, durée totale et enseignant
                intent.putExtra("intitul", "systeme")
                intent.putExtra("durée totale", "4h ")
                intent.putExtra("enseignant", "Mr.snouci")

                startActivity(intent)
            }

            textView2.setOnClickListener{

                val intent = Intent(this, Main2Activity::class.java)
                //intitulé, durée totale et enseignant
                intent.putExtra("intitul", "sig ")
                intent.putExtra("durée totale", "1h ")
                intent.putExtra("enseignant", "Mr.Belattar")

                startActivity(intent)
            }
        }

    }
}