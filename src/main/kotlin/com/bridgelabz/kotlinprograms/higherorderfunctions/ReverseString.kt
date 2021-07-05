package com.bridgelabz.kotlinprograms.higherorderfunctions

fun main() {
    val reserve = Reverse()
    val myLambda : (String) -> String = {s -> s.reversed()}
    reserve.reverseAndDisplay("Hello", myLambda)
//    reserve.reverseAndDisplay("Hello") { it.reversed() }
}

class Reverse {
    fun reverseAndDisplay(str:String, myFunc: (String) -> String) {

        var result = myFunc(str)  //it.reversed() ====> str.reversed() ===> Hello.reversed() ===> olleH
        println(result)
    }
}