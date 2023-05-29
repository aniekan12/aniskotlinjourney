package com.example.aniskotlinjourney.coding_exercises

import java.util.*

fun main(){
    swapNumbers()
}

fun swapNumbers(){
    val reader = Scanner(System.`in`)

    var c : Int

    println("enter the first number")
    var a = reader.nextInt()

    println("the value of a is $a")

    println("enter the second number")
    var b = reader.nextInt()

    c = a
    a = b
    b = c


    println("the value of b is $b")


    println("the value of a is $a")

    println("the value is b is $b")

}