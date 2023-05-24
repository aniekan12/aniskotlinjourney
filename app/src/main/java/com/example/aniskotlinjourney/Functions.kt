package com.example.aniskotlinjourney

fun main(){
    myFirstFunctionWithParameters("hmmm",2, listOf("boy","girl"))
    myFirstFuntionWithParametersThatReturnsSomething("aniekan","we go soon know")
}

fun myFirstFunctionWithParameters(wife_name:String, childrenNumber: Int, houses:List<String>){
    println("your wifes name is $wife_name and i have $childrenNumber children and i have ${houses.first()}")

}

fun myFirstFuntionWithParametersThatReturnsSomething(husband:String, wife:String) : String{
    var plusing = "$husband + $wife"
    return plusing
}