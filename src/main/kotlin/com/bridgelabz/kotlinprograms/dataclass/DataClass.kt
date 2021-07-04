package com.bridgelabz.kotlinprograms.dataclass

fun main(args: Array<String>) {
    //Declaring a data class
    data class Student(val name: String, val rollNo: Int, val branch: String)

    //declaring a variable of the above data class and initializing values to all parameters
    val firstStudent = Student("Krishna", 147, "Mechanical")

    val (name, rollNo, branch) = firstStudent


    //printing all the details of the data class
    println(firstStudent.toString())

    //declaring a data class
    data class Person(val name: String, val age: Int)
    {
        //property declared in class body
        var height: Int = 0
    }
    val firstPerson = Person("BalaRama", 20)

    //copying details of firstPerson with change in name of person
    val secondPerson = firstPerson.copy(name = "Pallavi")

    //copying all details of firstPerson to thirdPerson
    val thirdPerson = firstPerson.copy()

    //declaring Heights of individual person
    firstPerson.height = 100
    secondPerson.height = 80
    thirdPerson.height = 70

    //man1 & man3 have different class body values, but same parameter values
    //printing info
    println("$firstPerson has ${firstPerson.height} cm height")
    println("$secondPerson has ${secondPerson.height} cm height")
    println("$thirdPerson has ${thirdPerson.height} cm height")

    val hash1 = firstPerson.hashCode()
    val hash2 = secondPerson.hashCode()
    val hash3 = thirdPerson.hashCode()

    //checking equality of  these hash codes
    println("hash1 == hash 2 ${hash1.equals(hash2)}")
    println("hash2 == hash 3 ${hash2.equals(hash3)}")
    println("hash1 == hash 3 ${hash1.equals(hash3)}")
    //Person1 and Person3 have same object contents, so they are equal, thus they have same hash code values.

}