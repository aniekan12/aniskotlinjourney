package com.example.aniskotlinjourney.classes


//the open keyword makes this class available for inheritance
open class Person(var type:String, var name:String, var age:Int) {
    init {
        println("The Person is a $type")
        println("the person is $age year(s) old")
        println("the person's name is $name")
    }

    fun doesThisJob() = println("the person is a $type")
    fun hasThisName() = println("the person is a $name")

}