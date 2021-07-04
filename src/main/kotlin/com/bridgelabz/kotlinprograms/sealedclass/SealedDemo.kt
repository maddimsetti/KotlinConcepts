package com.bridgelabz.kotlinprograms.sealedclass

sealed class Demo {
    class A : Demo() {
        fun display()
        {
            println("Subclass A of sealed class Demo")
        }
    }
    class B : Demo() {
        fun display()
        {
            println("Subclass B of sealed class Demo")
        }
    }
}
fun main()
{
    val object1 = Demo.B()
    object1.display()

    val object2 = Demo.A()
    object2.display()
}