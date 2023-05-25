package com.example.aniskotlinjourney.classes

fun main(){
    //immutable lists
    val immutableList = listOf ("ani","anie","aniek","anieka","aniekan")

    val mutableList = mutableListOf("ani","john",23)

    //tweaking the mutable list
    //adding elements to the list

mutableList.add(3,"wifeyyy")
    for (words in immutableList){
        println(words)
    }

    for (item in mutableList){
        println(item)
    }
}