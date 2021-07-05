package com.bridgelabz.kotlinprograms.extensions

class Host(private val hostname: String) {
    fun printHostname() { print(hostname) }
}

class Connection(private val host: Host, private val port: Int) {
    private fun printPort() { print(port) }

    private fun Host.printConnectionString() {
        printHostname()   // calls Host.printHostname()
        print(":")
        printPort()   // calls Connection.printPort()
    }

    fun connect() {
        /*...*/
        host.printConnectionString()   // calls the extension function
    }
}

fun main() {
    Connection(Host("kotl.in"), 443).connect()
    //Host("kotl.in").printConnectionString(443)  // error, the extension function is unavailable outside Connection
}