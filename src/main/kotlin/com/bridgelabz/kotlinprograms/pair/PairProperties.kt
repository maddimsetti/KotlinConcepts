package com.bridgelabz.kotlinprograms.pair

fun main() {
    //Kotlin Program to retrieve the values of pair using properties
    var pair = Pair("This Is Krishna", "I am studying")
    println(pair.first)
    println(pair.second)

    //Kotlin program using the Function - toString()
    val obj = Pair(5 , 54)
    println("String representation is $obj")

    val friends= Pair("Krishna", listOf("Praveen", "Gaurav", "Balarama"))
    println("The Friends List of Krishna is "+friends.toString())

    //Kotlin program of using the Extended Function
    var number = Pair(1, 2)
    val numberList: List<Any> = number.toList()
    println(numberList)

    var words = Pair("Hello", "World")
    val wordList : List<Any> = words.toList()
    println(wordList)
}
