package org.example.controllers

import models.Divide

fun activitat1(){
    var exit=false
    do {
        try {
            var myDivision= Divide()
            exit=true
        }catch (e:NumberFormatException){
            println("Incorrect value for number")
        }catch (e:ArithmeticException){
            println("Division can't be executet by 0")
        }
    }while (!exit)
}
//fent servir classe string crear un programa que si una frase introduina es un palindrom retorni true
fun activitatPalindrom(){
    var exit=false
    do {
        println("Write 1 to check is string is reversible, press another key to exit")
        var userOption= readln()
        if (userOption!="1") exit=true
        else{
            println("Write your string")
            var userString=readln()
            userString=userString.replace("[^a-zA-Z0-9]","").lowercase()
            println(userString)
        }

    }while (!exit)
}