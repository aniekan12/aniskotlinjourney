package com.example.aniskotlinjourney.classes

class RAndB(genre:String) : Genres() {
    override fun displayGenreNow() {
      println("the $genre i'm listening to right now")
    }
}