package com.bridgelabz.kotlinprograms.extensions

class MyClass {
    companion object {
        // member function of companion object
        fun display(str :String) : String{
            return str
        }
    }
}

fun MyClass.Companion.abc() {
    println("Extension function of Companion Object")
}

fun main() {
    val obj = MyClass.display("Function Declared in Companion Object")
    println(obj)

    // invoking the extension function
    MyClass.abc()
}