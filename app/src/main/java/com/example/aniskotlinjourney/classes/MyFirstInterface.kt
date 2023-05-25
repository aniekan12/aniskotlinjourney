package com.example.aniskotlinjourney.classes

interface MyFirstInterface {
    val myFirstDate : String

    fun printMyFirstDate() : String
    fun printMyFirstDateTwice(){
        println("$myFirstDate")
        println("$myFirstDate")

    }
}