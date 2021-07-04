package com.bridgelabz.kotlinprograms.triple

fun main() {
    //Kotlin example of creating triple using the Constructor
    val (x, y, z) = Triple(1, "Krishna", 4.0)
    println(x)
    println(y)
    println(z)

    //Kotlin program to retrieve the values of Triple using properties
    var triple = Triple("Hello World", "I am Chitty The Robot", listOf(10, 20, 30))
    println(triple.first)
    println(triple.second)
    println(triple.third)

    //Kotlin program of using the function
    val friendsOfKrishna = Triple("Krishna", listOf("Praveen", "Gaurav", "Abhi"), 12345)
    print("The Friends of Krishna "+ friendsOfKrishna.toString())

    //kotlin program of using the extended function
    var numbers = Triple(4000, 2.0000 , listOf(10, 20, 30))
    val numbersList: List<Any> = numbers.toList()
    println("/n$numbersList")
}
