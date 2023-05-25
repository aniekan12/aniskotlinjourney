package com.example.aniskotlinjourney.classes

abstract class Genres {
    var genre : String = "soul"

    fun displayGenre(){
        println("the genre is $genre")
    }

    abstract  fun displayGenreNow()
}