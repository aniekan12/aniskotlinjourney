package com.example.aniskotlinjourney.classes

class BMW : Car {
    //we inherit the car class using the super keyword
    constructor(name:String, color:String, mha:String) : super(name,color){

        println("the car moves at a speed of $mha")


    }
}