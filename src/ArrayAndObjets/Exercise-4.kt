package ArrayAndObjets

import Student
import ClassRoom
fun ClassExec4() {
    val studentsA: ArrayList<Student> = arrayListOf()
    val studentsB: ArrayList<Student> = arrayListOf()

    studentsA.add(Student(1, "Manolo", 40))
    studentsA.add(Student(2, "Felipe", 18, isApproved = true))
    studentsA.add(Student(3, "Pepe", 22, isProgressing = true))

    studentsB.add(Student(1, "Maria", 40))
    studentsB.add(Student(2, "Alba", 18))
    studentsB.add(Student(3, "Juan", 22, isProgressing = true))
    studentsB.add(Student(4, "Dani", 22, isApproved = true))

    val classRoomA = ClassRoom(1, "Jueves", studentsA)
    val classRoomB = ClassRoom(2, "Viernes", studentsB)

    println("Class RoomA : $classRoomA")
    println("Class RoomB : $classRoomB")

    println("\nStudents needing help in Class Room A:")
    classRoomA.students.filter {it.needHelp}.forEach {  println("estudiante: " + it) }

    println("\nStudents needing help in Class Room B:")
    classRoomB.students.filter { it.needHelp }.forEach { println("estudiante: " +it) }
}