package com.example.apptienda.model

import android.media.MediaRouter.RouteCategory
import java.io.Serializable

class Producto (var image : String, var title : String, var price : Int, var category: String) :
    Serializable