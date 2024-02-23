package com.example.apptienda.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apptienda.R
import com.example.apptienda.model.Producto

class ProductoAdapter(var listaProducto : ArrayList<Producto>, var context: Context)
    : RecyclerView.Adapter<ProductoAdapter.MyHolder>() {

    private lateinit var listaFiltra : ArrayList<Producto>


    class MyHolder(item: View) : RecyclerView.ViewHolder(item) {
        lateinit var image : ImageView
        lateinit var title : TextView
        lateinit var price : TextView
        lateinit var botonCarrito : Button
        //lateinit var category : String
        init {
            image = item.findViewById(R.id.imag_rellena)
            title = item.findViewById(R.id.text_nombre)
            price = item.findViewById(R.id.text_precio)
            botonCarrito = item.findViewById(R.id.boton_carrito)

        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view : View = LayoutInflater.from(context).inflate(R.layout.item_main, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return listaFiltra.size

    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val



    }
    fun addProducto(producto: Producto){
        listaProducto.add(producto)
        listaFiltra.add(producto)
        notifyItemInserted(listaFiltra.size - 1)
    }
}