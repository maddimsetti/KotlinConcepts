package com.bridgelabz.kotlinprograms.extensions

fun main() {
    // Extension function defined for Int type
    fun Int.abs() : Int {
        return if(this < 0) -this else this
    }
    println((-4).abs())
    println(4.abs())
}