package com.example.contriler.model.assortment

data class AssortmentX(
    val AssortimentID: String,
    val AssortmentCode: String,
    val Discount: Double,
    val DiscountedPrice: Double,
    val Name: String,
    val Price: Double,
    val PriceLineID: String,
    val VATPercent: Double
)