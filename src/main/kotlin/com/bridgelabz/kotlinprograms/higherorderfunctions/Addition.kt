package com.bridgelabz.kotlinprograms.higherorderfunctions

fun main(args: Array<String>) {
    val program = Program()
    val myLamba: (Int, Int) -> Int = {x, y -> x + y}    //Lambda Expressions [functions]
    program.addTwoNumbers(2, 7, myLamba)
    program.addTwoNumbers(2, 7, {x, y -> x + y})
    program.addTwoNumbers(2, 7) {x, y -> x + y}
}

class Program {
    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) {  //High Level functions with Lambda
        val result = action(a, b)
        println(result)
    }
}