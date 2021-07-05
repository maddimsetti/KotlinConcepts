package com.bridgelabz.kotlinprograms.properties

import com.bridgelabz.kotlinprograms.scopefunctions.Student
import kotlin.properties.Delegates

class StudentHeavy {
    init {
        println("Student Heavy Initialized")
    }
}

class Student {
    val heavy by lazy { StudentHeavy() }

    var marks: Int by Delegates.observable(50) {
        property, oldValue, newValue ->
                 println("Old Value $oldValue")
                 println("New Value $newValue")

    }

    var age: Int by Delegates.vetoable(14) { property, oldValue, newValue ->
        println("New Age $newValue")
        println("Old Age $oldValue")
        newValue >= 14
    }
}


fun main(){
    val student = com.bridgelabz.kotlinprograms.properties.Student()

    //Delegation Properties - Lazy
    student.heavy
    student.heavy
    student.heavy

    //Delegation Properties - Observable
    student.marks = 80
    student.marks = 100

    //Delegation Properties - vetoable
    student.age = 12
    println(student.age)
    student.age = 18
    println(student.age)
}