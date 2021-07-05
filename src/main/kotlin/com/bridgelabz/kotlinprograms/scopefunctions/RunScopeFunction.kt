package com.bridgelabz.kotlinprograms.scopefunctions

//Use Case: Used when the object lambda contains both initialization and the computation of the return value.
//          Using run we can perform null safety calls as well as other computations.

class Students() {
    lateinit var name: String
    lateinit var branch: String
    lateinit var objective: String
}

fun main(args: Array<String>) {
    println("The Details of Student : ")

    var student : Students? = null
    // body only executes if student is non-null
    student?.run {
        print(name)
    }

    // re-initialize student
    student = Students().apply {
        name = "Krishna"
        branch = "Mechanical"
        objective = "I am an Engineer"
    }

    println("The Details of Student : ")
    student?.run {
        println(name)
        println(branch)
        println(objective)
    }

}