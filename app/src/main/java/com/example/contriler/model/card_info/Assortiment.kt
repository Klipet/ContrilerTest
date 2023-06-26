package com.example.contriler.model.card_info

data class Assortiment(
    val AdditionalLimit: Double,
    val AssortimentID: String,
    val AssortmentCode: String,
    val CardBalance: Double,
    val DailyLimit: Double,
    val DailyLimitConsumed: Double,
    val Discount: Double,
    val DiscountedPrice: Double,
    val Limit: Double,
    val MonthlyLimit: Double,
    val MonthlyLimitConsumed: Double,
    val Name: String,
    val Price: Double,
    val PriceLineID: String,
    val VATPercent: Double,
    val WeeklyLimit: Double,
    val WeeklyLimitConsumed: Double
)