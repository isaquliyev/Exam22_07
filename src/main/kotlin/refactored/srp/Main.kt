package refactored.srp

import refactored.srp.data.Student
import refactored.srp.facade.StudentFacade
import refactored.srp.managers.GradeCalculatorManager
import refactored.srp.managers.StudentInformationPrintManager

fun main() {

    val studentFacade = StudentFacade(GradeCalculatorManager(), StudentInformationPrintManager())

    val student = Student("Isa", 18, 91 )

    studentFacade.calculateGrades(student)
    studentFacade.printStudentInformation(student)
}