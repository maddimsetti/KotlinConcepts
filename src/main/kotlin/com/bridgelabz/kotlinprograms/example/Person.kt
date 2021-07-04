package com.bridgelabz.kotlinprograms.example

class Person(val name: String) {




    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val firstPerson = Person("Krishna")
            val secondPerson = Person("Krishna")

            println(firstPerson == secondPerson)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}