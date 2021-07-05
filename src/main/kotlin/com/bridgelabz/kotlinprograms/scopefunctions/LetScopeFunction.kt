package com.bridgelabz.kotlinprograms.scopefunctions

//Use case: let function is often used to provide null safety calls.
            // Use safe call operator(?.) with ‘let’ for null safety.
           // It executes the block only with the non-null value.
fun main() {
    // nullable variable a with value as null
    var name: String? = null

    // using let function
    name?.let {
        // statement(s) will not execute as a is null
        print(it)
    }

    // re-initializing value of a to 2
    name = "Hello"
    val stringLength = name?.let {
        // re-initializing value of name to Hello
        println(it.reversed())
        println(it.capitalize())
        it.length
    }

    println(stringLength)
}

//Explanation : As you see when the value of "name" is ‘null’ let function simply avoid the code block.
                // Hence, solving the biggest nightmare of programmers – NullPointerException.