package com.example.apptienda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.JsonRequest


import com.example.apptienda.databinding.ActivityMainBinding
import com.example.apptienda.model.Producto
import org.json.JSONArray

class MainActivity : AppCompatActivity()  {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.menuToolbar)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.carrito_compra -> {
                intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
        return true
    }

    fun rellenarLista(){
        var peticion : JsonObjectRequest = JsonObjectRequest("https://dummyjson.com/products/categories",
            {
                var products : JSONArray = it.getJSONArray("products")
                for (i in 0 until products.length()){
                   val product = products.getJSONObject(i)
                    val producto : Producto = Producto(
                        product.getString("thumbnail"),
                        product.getString("title"),
                        product.getInt("price"),
                        product.getString("category")
                    )
                }
            } , {

            })
    }

}









