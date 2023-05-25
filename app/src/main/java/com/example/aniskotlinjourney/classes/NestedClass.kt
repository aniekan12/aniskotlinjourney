package com.example.aniskotlinjourney.classes

fun main(){
    var nestedNestedClass = NestedClass.NestedNestedClass()
   println( nestedNestedClass.salary)
}

abstract class NestedClass {

    var age = 30

    class NestedNestedClass{

        var salary = 500000000000

    }
}