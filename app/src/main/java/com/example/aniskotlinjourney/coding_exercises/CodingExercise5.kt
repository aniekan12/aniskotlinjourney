package com.example.aniskotlinjourney.coding_exercises


fun main(){
//reverseString("ani")
    multiplyNumbersOfDifferentArrays()
}

fun reverseString(text:String){
    var stringToReverse = text.toCharArray()
    var reverse = ""
    for(c in stringToReverse.size -1 downTo 0){
        reverse += stringToReverse[c]
    }

    print(reverse)
}

fun multiplyNumbersOfDifferentArrays(){
    var firstArray = listOf(1,3,5,7,9)
    var secondArray = listOf(2,3,4,9,7)
    var multiply = " "

    for (i in firstArray.withIndex()){
           multiply +=   (firstArray[i.index] * secondArray[i.index])
        }
        print(multiply)

}