package com.example.aniskotlinjourney.coding_exercises

import java.util.*

fun main(){
 printAreaAndPerimeterOfACircle()
}

fun printAreaAndPerimeterOfACircle(){
    val reader = Scanner(System.`in`)

    val pi = 3.142

    println("enter a radius")
    val radius = reader.nextInt()

    val area = pi * (radius * radius)

    val perimeter = 2 * pi * radius

    println("the area of the circle is $area ")
    println("the perimeter of the circle is $perimeter")

}
