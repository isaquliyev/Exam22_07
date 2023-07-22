fun isPrime(number : Int) : Boolean {
    var checker : Boolean = true
    for ( i in 2 until number) {
        if ( number % i == 0 ) {
            checker = false
            break
        }
    }
    return checker
}

fun main() {
    val a = 34
    print(sumOfTwoPrimeNumbers(a))
}

fun sumOfTwoPrimeNumbers(number: Int) {
    for ( i in 2 .. number / 2 ) {
        if ( isPrime(i) && isPrime(number - i)) {
            println("number = $i + ${number-i}")
        }
    }
}