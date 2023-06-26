package com.example.contriler.model.gun_available_quantity

data class GunAvaible(
    val Amount: Double,
    val Card: String,
    val CardCode: String,
    val CardName: String,
    val ClientCode: String,
    val ClientName: String,
    val Discount: Double,
    val DiscountType: Int,
    val ErrorCode: Int,
    val ErrorMessage: String,
    val ExternalID: String,
    val PaymentType: Int
)