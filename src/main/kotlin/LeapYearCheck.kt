fun leapYearChecker(number : Int) : Boolean {
    var checker = false
    if (number % 4 == 0 ) {
        checker = true
    }
    return checker
}

fun main() {
    val number : Int = 2020
    if (leapYearChecker(number)) {
        print("This year is leap year...")
    }
    else {
        print("This year is not leap year...")
    }
}