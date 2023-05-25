package com.example.aniskotlinjourney.maps

fun main(){

    // immutable map

    var immMap = mapOf("name" to "ani", "job" to "swe")
    print(immMap["job"])


    //mutable map

    var mutableMap = mutableMapOf("name" to "ani","house" to "maitama")
    print(mutableMap)

}