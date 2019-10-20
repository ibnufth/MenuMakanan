package com.example.rcwvw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.io.Serializable
/*Ibnu Fathan
* A11.2017.10070*/

class MainActivity : AppCompatActivity() {
    private lateinit var rv_list :RecyclerView
    private var list :ArrayList<daftar> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_list=findViewById(R.id.rv_list)
        rv_list.setHasFixedSize(true)

        list.addAll(Isidaftar.listdata)
        showRecyclerList()
    }
    private fun showRecyclerList(){
        rv_list.layoutManager=LinearLayoutManager(this)
        val listAdapter=ListAdapter(list)
        rv_list.adapter=listAdapter

        listAdapter.setOnItemClickCallback(object :ListAdapter.OnItemClickCallback{
            override fun onitemClick(data: daftar) {
                showSelected(data)
            }
        })
    }
    private fun showSelected(daftar: daftar){
        val intent= Intent(this,Detail::class.java)
        intent.putExtra("daftar",daftar as Serializable)
        startActivity(intent)
    }
}
