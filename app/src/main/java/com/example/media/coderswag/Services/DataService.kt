package com.example.media.coderswag.Services

import com.example.media.coderswag.Model.Category
import com.example.media.coderswag.Model.Product
import java.util.*

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "£23", "hat1"),
            Product("Devslopes Hat Black", "£20", "hat2"),
            Product("Devslopes Hat White", "£17", "hat3"),
            Product("Devslopes Hat Snapback", "£25", "hat4"),
            Product("Devslopes Graphic Beanie", "£23", "hat1"),
            Product("Devslopes Hat Black", "£20", "hat2"),
            Product("Devslopes Hat White", "£17", "hat3"),
            Product("Devslopes Hat Snapback", "£25", "hat4"),
            Product("Devslopes Graphic Beanie", "£23", "hat1"),
            Product("Devslopes Hat Black", "£20", "hat2"),
            Product("Devslopes Hat White", "£17", "hat3"),
            Product("Devslopes Hat Snapback", "£25", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Grey", "£27", "hoodie1"),
            Product("Devslopes Hoodie Red", "£30", "hoodie2"),
            Product("Devslopes Hoodie Black", "£29", "hoodie3"),
            Product("Devslopes Hoodie White", "£32", "hoodie4"),
            Product("Devslopes Hoodie Grey", "£27", "hoodie1"),
            Product("Devslopes Hoodie Red", "£30", "hoodie2"),
            Product("Devslopes Hoodie Black", "£29", "hoodie3"),
            Product("Devslopes Hoodie White", "£32", "hoodie4"),
            Product("Devslopes Hoodie Grey", "£27", "hoodie1"),
            Product("Devslopes Hoodie Red", "£30", "hoodie2"),
            Product("Devslopes Hoodie Black", "£29", "hoodie3"),
            Product("Devslopes Hoodie White", "£32", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Grey", "£20", "shirt1"),
            Product("Devslopes Badge Light Grey", "£22", "shirt2"),
            Product("Devslopes Shirt Black", "£17", "shirt3"),
            Product("Devslopes Shirt White", "£21", "shirt4"),
            Product("Devslopes Shirt White", "£21", "shirt5"),
            Product("Devslopes Shirt Grey", "£20", "shirt1"),
            Product("Devslopes Badge Light Grey", "£22", "shirt2"),
            Product("Devslopes Shirt Black", "£17", "shirt3"),
            Product("Devslopes Shirt White", "£21", "shirt4"),
            Product("Devslopes Shirt White", "£21", "shirt5"),
            Product("Devslopes Shirt Grey", "£20", "shirt1"),
            Product("Devslopes Badge Light Grey", "£22", "shirt2"),
            Product("Devslopes Shirt Black", "£17", "shirt3"),
            Product("Devslopes Shirt White", "£21", "shirt4"),
            Product("Devslopes Shirt White", "£21", "shirt5")
    )


    val digitalGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> {

      return when (category) {
            "SHIRTS" ->  shirts
            "HATS" ->  hats
            "HOODIES" -> hoodies
            else ->  digitalGoods
        }
    }


}