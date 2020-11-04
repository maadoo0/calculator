
fun main(args: Array<String>) {
    println("Enter First Number : ")
    val num1: Double = readLine()!!.toDouble()
    println("Enter Second Number : ")
    val num2: Double = readLine()!!.toDouble()
    println("Enter an operator (+,-,*,/) : ")
    val op: String? = readLine()
    var result: Double = 0.0
    when (op) {
        "+" -> result = num1+num2
        "-" -> result = num1-num2
        "*" -> result = num1*num2
        "/" -> result = num1/num2
        else -> {
            println("invaild operator")}
    }
    println("$num1 , $op , $num2 = $result")

}