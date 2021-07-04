package com.bridgelabz.kotlinprograms.extensions

class Teacher(val name: String) {
    override fun toString(): String {
        return "Name is $name"
    }
}
fun main() {
    // An extension function as a nullable receiver
    fun Teacher?.output() {
        if (this == null) {
            println("Null")
        } else {
            println(this.toString())
        }
    }

    val person = Teacher("Pallavi")
    // Extension function called using an instance
    person.output()
    // Extension function called on null
    null.output()
}