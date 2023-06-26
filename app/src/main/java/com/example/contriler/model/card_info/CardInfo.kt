package com.example.contriler.model.card_info

data class CardInfo(
    val AllowedBalance: Double,
    val Assortiment: List<Assortiment>,
    val Balance: Double,
    val BlockedAmount: Double,
    val CardBarcode: String,
    val CardEnabled: Boolean,
    val CardName: String,
    val CardNumber: String,
    val CustomerEnabled: Boolean,
    val CustomerId: String,
    val CustomerName: String,
    val DailyLimit: Double,
    val DailyLimitConsumed: Double,
    val ErrorCode: Int,
    val ErrorMessage: String,
    val HasPIN: Boolean,
    val LimitType: Int,
    val MonthlyLimit: Double,
    val MonthlyLimitConsumed: Double,
    val Phone: String,
    val RefusedRefillClientAccount: Boolean,
    val TankCapacity: Double,
    val TaxFree: Boolean,
    val WeeklyLimit: Double,
    val WeeklyLimitConsumed: Double
)