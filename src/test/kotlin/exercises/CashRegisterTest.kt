package exercises

import org.example.exercises.CashRegister
import org.example.exercises.Item
import org.example.exercises.Promo
import org.junit.jupiter.api.Test

class CashRegisterTest {

    @Test
    fun `checkout calculates price`() {
        // arrange
        val prices = mapOf(
            Item.MILK to 1.5,
            Item.EGGS to 1.0,
            Item.BREAD to 2.0,
        )

        val promotions = mapOf(
            Item.MILK to Promo(3, 2),
            Item.EGGS to Promo(8, 6),
            Item.BREAD to Promo(4, 3),
        )

        val shoppingList = listOf(Item.MILK)

        val sut = CashRegister(prices, promotions)

        // act
        val actual = sut.checkout(shoppingList)

        // assert
    }

//    @Test
//    fun `checkout calculates price with discount`() {
//        // arrange
//
//        // act
//
//        // assert
//    }
}