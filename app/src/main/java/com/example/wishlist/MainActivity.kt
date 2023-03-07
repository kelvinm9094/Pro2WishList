package com.example.wishlist
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
private val main_list= mutableListOf<list>()
private lateinit var List : RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val List = findViewById<RecyclerView>(R.id.recyclerView)
            val wish = listAdp(main_list)


            List.adapter = wish
            List.layoutManager = LinearLayoutManager(this)


            val itemname = findViewById<EditText>(R.id.name)
            val pricenum = findViewById<EditText>(R.id.price)
            val urlsearch = findViewById<EditText>(R.id.url)

            findViewById<Button>(R.id.button).setOnClickListener {
                var item: list = list(
                    itemname.text.toString(),
                    urlsearch.text.toString(),
                    pricenum.text.toString().toDouble()
                )
                main_list.add(item)
                findViewById<EditText>(R.id.price).text.clear()
                findViewById<EditText>(R.id.name).text.clear()
                findViewById<EditText>(R.id.url).text.clear()
                wish.notifyDataSetChanged()
            }


        }
    }
