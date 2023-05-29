package com.example.aniskotlinjourney.coding_exercises

fun main(){
    countTheNumberOfEvenAndOddNumbers()
}

fun countTheNumberOfEvenAndOddNumbers(){
    var numbers = listOf(1,3,5,2,8,10,9)
    var even = 0;
    var odd = 0;
    for(i in numbers){
        if(i%2 == 0){
            even++
        }else{
             odd++


        }

    }
    println("the number of even numbers is $even")
    println("the number of odd numbers is $odd")

}