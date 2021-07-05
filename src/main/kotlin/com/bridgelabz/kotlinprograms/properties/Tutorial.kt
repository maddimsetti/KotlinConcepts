package com.bridgelabz.kotlinprograms.properties

class Tutorial {

    lateinit var tutorialName : String

    fun initializeName(){
        //Without Initializing
        println(this::tutorialName.isInitialized)

        // initializing name
        tutorialName = "BridgeLabz Kotlin Program"
        println(this::tutorialName.isInitialized)
    }
}

fun main() {
    Tutorial().initializeName();
}
