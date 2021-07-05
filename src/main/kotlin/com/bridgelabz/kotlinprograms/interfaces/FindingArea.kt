package com.bridgelabz.kotlinprograms.interfaces

class FindingArea : CalculateParameters {
    override  val length : Double
    get() = 10.0

    override val breadth : Double
    get() = 15.0

    override fun area() {
        println("Area is ${length * breadth}")
    }

    override fun perimeter() {
        println("Perimeter is ${2 * (length + breadth)}")
    }
}

fun main() {
    val obj = FindingArea()
    obj.area()
    obj.perimeter()
}