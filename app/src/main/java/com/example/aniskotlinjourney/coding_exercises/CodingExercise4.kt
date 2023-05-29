package com.example.aniskotlinjourney.coding_exercises

import java.util.*

fun main(){
    countSpaces()
}

fun countSpaces(){
    println("please enter a word")

    var reader = Scanner(System.`in`)
    var usersInput = reader.next()


    if(usersInput.isEmpty()) {
        println("please enter a word")
    } else{
      var length =   usersInput.length
    println("the length of the string is $length")
    }
}