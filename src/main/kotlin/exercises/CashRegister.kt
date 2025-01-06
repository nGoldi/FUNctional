package org.example.exercises

class CashRegister(prices: Map<Item, Double>, promotions: Map<Item, Promo>) {
    fun checkout(shoppingList: List<Item>): Double {
        TODO("Not yet implemented")
    }
}

data class Promo(val pay: Int, val get: Int)

enum class Item {
    MILK,
    EGGS,
    BREAD
}
