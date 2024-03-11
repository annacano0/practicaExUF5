package models

class Divide {
    private var num1:Int
    private var num2:Int

    constructor(){
        println("Please, write the first number")
        this.num1= readln().toInt()
        println("Please, write the second number")
        this.num2 = readln().toInt()
        getResult()
    }

    fun getResult(){
        if (this.num2==0)throw ArithmeticException()
        println(num1/num2.toFloat())
    }
}