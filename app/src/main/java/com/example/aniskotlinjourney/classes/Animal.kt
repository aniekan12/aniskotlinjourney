package com.example.aniskotlinjourney.classes

fun main(){
//   var test = Musician("ani","drummer",12)
//    test.doesThisJob()

//    var test = BMW("i8","red","200")

var music  = RAndB(genre = "Soul")
    music.displayGenre()
    music.displayGenreNow()
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