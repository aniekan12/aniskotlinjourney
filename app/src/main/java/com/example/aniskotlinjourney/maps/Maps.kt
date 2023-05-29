package com.example.aniskotlinjourney.maps

fun main(){

    // immutable map

    var immMap = mapOf("name" to "ani", "job" to "swe")
    print(immMap["job"])


    //mutable map

    var mutableMap = mutableMapOf<String, String>("name" to "ani","house" to "maitama")
    mutableMap.put("salary", 5000.toString())
    println(mutableMap["salary"])

    mutableMap.remove("salary")

    println(mutableMap)



}