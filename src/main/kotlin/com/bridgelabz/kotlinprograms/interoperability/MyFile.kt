@file:JvmName("MyCustomKotlinFileName")

package com.bridgelabz.kotlinprograms.interoperability

import javaprograms.MyJavaFile

fun main(args: Array<String>) {

    var area = MyJavaFile.getArea(10,4)
    println("Printing the Area from Kotlin File $area" )
}

fun add(firstValue: Int, secondValue: Int) : Int {
    return firstValue + secondValue
}