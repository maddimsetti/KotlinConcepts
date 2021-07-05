package com.bridgelabz.kotlinprograms.example

fun printHello(name: String?) {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}

fun main() {
    printHello(name = null)
    printHello("Krishna")
}