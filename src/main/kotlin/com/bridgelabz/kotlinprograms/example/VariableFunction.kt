package com.bridgelabz.kotlinprograms.example

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    //Inside a function a vararg -parameter of type T is visible as an array of T,
    //i.e. the ts variable in the example above has type Array<out T>
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun main() {
    val list = asList(1, 2, 3)
    val a = arrayOf(1, 2, 3)
    //When you call a vararg -function, you can pass arguments one-by-one, for example asList(1, 2, 3).
    //If you already have an array and want to pass its contents to the function,
    // use the spread operator (prefix the array with * )
    val list1 = asList(-1, 0, *a, 4)

    println(list)
    println(a)
    println(list1)
}