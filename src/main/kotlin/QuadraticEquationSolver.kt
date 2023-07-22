import kotlin.math.sqrt

fun quadraticEquationSolver(a : Double, b : Double, c: Double) {

    val discriminant = b * b - 4.0 * a * c

    if (discriminant > 0) {
        val root1 = (-b + sqrt(discriminant)) / (2 * a)
        val root2 = (-b - sqrt(discriminant)) / (2 * a)

        println("root1 = $root1 ")
        println("root2 = $root2")
    }

    else if (discriminant == 0.0) {
        val root1 = -b / (2 * a)

        println("root1 = root2 = $root1")
    }

    else {
        var rP= -b / (2 * a)
        var iP = sqrt(-discriminant) / (2 * a)

        println("root1 = ${(rP * 100).toInt().toDouble()/100}+i${(iP * 100).toInt().toDouble()/100}")
        println("root2 = ${(rP * 100).toInt().toDouble()/100}-i${(iP * 100).toInt().toDouble()/100}")

    }
}

fun main() {
    val a = 2
    val b = 4
    val c = 7

    quadraticEquationSolver(a.toDouble(),b.toDouble(),c.toDouble())
}