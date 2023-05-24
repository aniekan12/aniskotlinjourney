package com.example.aniskotlinjourney.classes

fun main(){
    var dog  = Animal()
    dog.color = "green"
    dog.weight = 500
    println("this dog is ${dog.color} and it weighs ${dog.weight}kg")
    println(dog.barking())
}

class Animal {

    //properties
    var type = "dog"
    var color = "burgundy"
    var weight = 200

    //behaviors

    fun barking(){
        println("this dog dey bark o. aahahn")
    }

    fun drinking(){
        println("this dog dey drink o. ahahn")
    }

    fun sleeping(){
        println("this dog dey sleep o. ahahn")
    }

    fun running(){
        println("this dog dey rub o. ahahan ")
    }

}