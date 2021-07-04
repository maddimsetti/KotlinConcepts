package com.bridgelabz.kotlinprograms.sealedclass

sealed class Fruits (val fruits: String) {
    // Two subclasses of sealed class defined within
    class Apple : Fruits("Apple")
    class Mango : Fruits("Mango")
}

// A subclass defined outside the sealed class
class Pomegranate: Fruits("Pomegranate")

// A function to take in an object of type Fruit
// And to display an appropriate message depending on the type of Fruit
fun display(fruit:Fruits) {
    when (fruit) {
        is Fruits.Apple -> println("${fruit.fruits} is good for iron")
        is Fruits.Mango -> println("${fruit.fruits} is delicious")
        is Pomegranate -> println("${fruit.fruits} is good for vitamin d")
    }
}
fun main() {
    // Objects of different subclasses created
    val obj = Fruits.Apple()
    val obj1 = Fruits.Mango()
    val obj2 = Pomegranate()

    // Function called with different objects
    display(obj)
    display(obj1)
    display(obj2)
}
