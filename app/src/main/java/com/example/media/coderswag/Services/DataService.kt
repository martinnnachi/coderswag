package com.example.media.coderswag.Services

import com.example.media.coderswag.Model.Category
import com.example.media.coderswag.Model.Product
import java.util.*

object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "£23", "hat01"),
            Product("Devslopes Hat Black", "£20", "hat02"),
            Product("Devslopes Hat White", "£17", "hat03"),
            Product("Devslopes Hat Snapback", "£25", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Grey", "£27", "hoodie01"),
            Product("Devslopes Hoodie Red", "£30", "hoodie02"),
            Product("Devslopes Hoodie Black", "£29", "hoodie03"),
            Product("Devslopes Hoodie White", "£32", "hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Grey", "£20", "shirt01"),
            Product("Devslopes Badge Light Grey", "£22", "shirt02"),
            Product("Devslopes Shirt Black", "£17", "shirt03"),
            Product("Devslopes Shirt White", "£21", "shirt04"),
            Product("Devslopes Shirt White", "£21", "shirt05")
    )
}