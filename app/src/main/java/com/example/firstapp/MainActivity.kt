package com.example.firstapp

import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var Data= arrayOf<String>("Pakistan","India", "China","UAE")
        var ListView=findViewById<ListView>(R.id.mylist)
        ListView.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Data)
        ListView.setOnItemClickListener { parent, view, position, id ->
            var toast=Toast.makeText(this,"You clicked on ${Data[position]}",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.manu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       // val id=item.itemId
        if(item.itemId==R.id.Setting){
            Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()

        }
        if(item.itemId==R.id.NewContact){
            Toast.makeText(this, "Contact", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }


}