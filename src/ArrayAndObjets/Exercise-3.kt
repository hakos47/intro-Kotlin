package ArrayAndObjets

import Student
import ClassRoom
fun ClassExec3() {
    val studentsA: ArrayList<Student> = arrayListOf()
    studentsA.add(Student(1, "Manolo", 40, false, false))
    studentsA.add(Student(2, "Felipe", 18, true, true))
    studentsA.add(Student(3, "Pepe", 22, false, true))
    studentsA.add(Student(4, "Maria", 22, false, true))
    studentsA.add(Student(5, "Jeremy", 22, false, false))
    studentsA.add(Student(6, "Daniel", 22, false, false))
    studentsA.add(Student(7, "Alfredo", 22, true, true))
    studentsA.add(Student(8, "Ismael", 22, true, true))

    val classRoomA = ClassRoom(1, "Jueves", studentsA)
    println("Class RoomA: ${classRoomA.students.filter { !it.isApproved && !it.isProgressing }.map { it.name }}")

}