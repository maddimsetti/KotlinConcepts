package com.bridgelabz.kotlinprograms.properties

class Company {
    var name: String = ""
        get() = field	 // getter
        set(value) {		 // setter
            field = value
        }
}
fun main(args: Array<String>) {
    val company = Company()
    company.name = "BridgeLabz" // access setter
    println(company.name)		 // access getter
}
