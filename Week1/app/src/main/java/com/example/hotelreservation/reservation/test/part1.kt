package com.example.hotelreservation.reservation.test

val foodList = ArrayList<Food>()

fun main() {
    Icecream().displayInfo()
}

open class Food {
    var name: String = ""
    var price: Int = 0
    open fun displayInfo() {

    }
}

class Burger : Food() {
    override fun displayInfo() {

        val hamBurger = Burger()
        hamBurger.name = "햄버거"
        hamBurger.price = 3000
        foodList.add(hamBurger)

        val cheeseBurger = Burger()
        cheeseBurger.name = "치즈버거"
        cheeseBurger.price = 5000
        foodList.add(cheeseBurger)

        foodList.forEach { burger ->

            println(burger.name)

        }
    }
}

class Icecream : Food() {
    override fun displayInfo() {

        val choco = Icecream()
        choco.name = "초코맛"
        choco.price = 4000
        foodList.add(choco)

        val vanilla = Icecream()
        vanilla.name = "바닐라맛"
        vanilla.price = 4000
        foodList.add(vanilla)

        foodList.forEach { ice ->

            println(ice.name)

        }

    }
}

class Drink : Food() {
    override fun displayInfo() {

        val coke = Drink()
        coke.name = "콜라"
        coke.price = 2000
        foodList.add(coke)

        val milk = Drink()
        milk.name = "우유"
        milk.price = 2000
        foodList.add(milk)

        foodList.forEach { drink ->

            println(drink.name)

        }

    }
}