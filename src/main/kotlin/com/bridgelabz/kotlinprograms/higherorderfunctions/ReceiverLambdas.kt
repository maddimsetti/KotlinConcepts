package com.bridgelabz.kotlinprograms.higherorderfunctions

class HTML {
    fun body() {
        println("Body called")
    }
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // create the receiver object
    html.init()        // pass the receiver object to the lambda
    return html
}

fun something() {

}

fun main() {
    html {       // lambda with receiver begins here
        body()   // calling a method on the receiver object
        Program().addTwoNumbers(1, 2) {a, b -> a + b}
    }
}

