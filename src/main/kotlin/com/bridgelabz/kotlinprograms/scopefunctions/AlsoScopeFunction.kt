package com.bridgelabz.kotlinprograms.scopefunctions

//Use Case: It is used where we have to perform additional operations
//          when we have initialized the object members.

fun main() {
    // initialized
    val numberList = mutableListOf<Int>(1, 2, 3)

    // later if we want to perform multiple operations on this list
    numberList.also {
        it.add(4)
        it.remove(2)
        // more operations if needed
    }
    println(numberList)
}
