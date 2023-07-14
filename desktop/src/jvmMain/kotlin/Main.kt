@file:JvmName("Main")

import com.example.SharedPrinter

fun main(args: Array<String>) {
    val sharedPrinter = SharedPrinter()
    print("Test: ${sharedPrinter.print()}")
}