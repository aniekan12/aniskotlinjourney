package com.example.aniskotlinjourney.coding_exercises

import java.util.*


fun main(){
    divideAndShowRemainder()
}

fun divideAndShowRemainder(){

    var reader = Scanner(System.`in`)



    println("please enter the first number")
    var firstNumber: Int = reader.nextInt()

    println("please enter the second number")
    var secondNumber: Int =  reader.nextInt()




    println(firstNumber / secondNumber)
    println(firstNumber % secondNumber)
}
