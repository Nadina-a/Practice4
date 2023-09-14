fun main(args: Array<String>) {
    //1
    fun printFullName(firstName: String, lastName: String) {
        println("$firstName $lastName")
    }

    printFullName("Ашихмина", "Надежда")

    //2
    fun printFullName (firstName: String, lastName: String){
        println("$firstName $lastName")
    }

    val firsName: String = "Надежда"
    val lastName: String = "Ашихмина"
    printFullName(firsName,lastName)
}
//3
fun calculateFullName (firstName: String, lastName: String): String{
    return "$firstName $lastName"
}
val fullName = calculateFullName("Ашихмина", "Надежда")
println(fullName)
//4
fun calculateFullName (firstName: String, lastName: String): Pair< String, Int> {
    val fullName="$firstName $lastName"
    return Pair (fullName, fullName.length)
}
val fullName = calculateFullName("Ашихмина", "Надежда")
println(fullName)
//5
fun primeNumber(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2 until number) {//функция проверяет делятся ли числа от 2 до number на number
        if (number % i == 0) {
            return false
        }
    }
    return true
}
println(primeNumber(7))

}

