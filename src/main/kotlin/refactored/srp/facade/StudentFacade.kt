package refactored.srp.facade

import refactored.srp.data.Student
import refactored.srp.managers.GradeCalculatorManager
import refactored.srp.managers.StudentInformationPrintManager

class StudentFacade(
    private var gradeCalculatorManager: GradeCalculatorManager,
    private var studentInformationPrintManager: StudentInformationPrintManager
) {
    fun calculateGrades(student : Student) {
        gradeCalculatorManager.calculateGrades(student)
    }
    fun printStudentInformation(student: Student){
        studentInformationPrintManager.printStudentInformation(student)
    }
}