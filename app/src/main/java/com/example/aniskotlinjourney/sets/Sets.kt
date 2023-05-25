package com.example.aniskotlinjourney.sets

fun main(){

    var immutableSet = setOf("heyy","heyy",23,23,22,23,23,22)
    println(immutableSet)

    var mutableSet = mutableSetOf("hii","hii","hii")

    mutableSet.add("hiiy")

    for(item in mutableSet) {
        println(item)
    }

    for(item in immutableSet){
        println(item)
    }

}
