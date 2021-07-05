package com.bridgelabz.kotlinprograms.scopefunctions

//Use Case: As the name implies – “Apply these to the object".
//          It can be used to operate on members of the receiver object
//          mostly to initialize members.

class Student() {
    lateinit var name: String
    lateinit var branch: String
    lateinit var objective: String
}

fun main() {
    val bioData = Student().apply {
        name = "Krishna"
        branch = "Mechanical"
        objective = "I am an Engineer"
    }

    //Use case: Recommended use of ‘with’ for calling functions
    //          on context objects without providing the lambda result.
    with (bioData){
        println("The BioData of Student is ")
        println(name)
        println(branch)
        println(objective)
    }
}
