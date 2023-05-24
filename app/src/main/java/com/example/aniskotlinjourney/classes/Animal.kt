package com.example.aniskotlinjourney.classes

fun main(){
    var animal  = Animal("dog","red",200)
    println("this dog is ${animal.color} and it weighs ${animal.weight}kg")
    println(animal.barking())

}

class Animal( var type : String,
              var color : String,
              var weight : Int,) {

    //properties


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