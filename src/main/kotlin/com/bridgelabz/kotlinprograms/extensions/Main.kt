package com.bridgelabz.kotlinprograms.extensions

fun main() {
    // Extension function operate defined for A
    fun Calculation.operate():Int{
        return firstValue + secondValue
    }
    // Extension function operate defined for B
    fun Operations.operate():Int{
        return firstValue * secondValue
    }

    // Function to display static dispatch
    fun display(perform: Calculation){
        print(perform.operate())
    }

    // Calling display function
    display(Operations())

    // since class B inherits class A and the argument passed display function is an instance of class B.
    // The output should be 25 according to the concept of the dynamic method dispatch,
    //  but since the extension functions are statically resolved, so the operate function is called on type A.
    //  Hence the output is 10.
}