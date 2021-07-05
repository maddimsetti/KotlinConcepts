package com.bridgelabz.kotlinprograms.higherorderfunctions

fun main(args: Array<String>) {
    val addition = Addition()
    var result = 0

    addition.addTwoNumbers(2, 7) {x, y -> result = x + y}
    println(result)
}

class Addition {
    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {  //High Level functions with Lambda
        action(a, b)
    }
}