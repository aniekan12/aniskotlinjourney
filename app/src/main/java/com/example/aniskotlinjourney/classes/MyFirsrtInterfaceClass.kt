package com.example.aniskotlinjourney.classes


fun main(){
    var myFirstInterface = MyFirsrtInterfaceClass("2023-03-20")
    println(myFirstInterface.printMyFirstDate())
}

 class MyFirsrtInterfaceClass(override val myFirstDate: String) : MyFirstInterface {
     override fun printMyFirstDate(): String {
         return "$myFirstDate"
     }
 }