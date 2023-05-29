package com.example.aniskotlinjourney.coding_exercises

fun main(){
    compareTheGreatest(firstNumber = 13, secondNumber = 12, thirdNumber = 12 )
}

fun compareTheGreatest(firstNumber:Int,secondNumber: Int, thirdNumber:Int){
    var greatest = 0;
    if(firstNumber > secondNumber && firstNumber > thirdNumber){
        println("first number is the greatest")
    }else if(secondNumber > thirdNumber && secondNumber > firstNumber){
        print("second number is the greatest")
    }else if(thirdNumber > firstNumber && thirdNumber > secondNumber){
        print("third number is the greatest")
    }else{
        print("equal numbers")
    }
}
