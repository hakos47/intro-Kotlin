package ArrayAndObjets

import Student
import ClassRoom
fun ClassExec2() {
    val studentsA: ArrayList<Student> = arrayListOf()
    val studentsB: ArrayList<Student> = arrayListOf()

    studentsA.add(Student(1, "Manolo", 40))
    studentsA.add(Student(2, "Felipe", 18))
    studentsA.add(Student(3, "Pepe", 22))

    studentsB.add(Student(1, "Maria", 40))
    studentsB.add(Student(2, "Alba", 18))
    studentsB.add(Student(3, "Juan", 22))
    studentsB.add(Student(4, "Dani", 22))


    val classRoomA = ClassRoom(1, "Jueves", studentsA)
    val classRoomB = ClassRoom(2, "Viernes", studentsB)

    println("Class RoomA: ${classRoomA.students.filter { it.name.contains("a") }.map { it.name }}")
    println("Class RoomB: ${classRoomB.students.filter { it.name.contains("a") }.map { it.name }}")

}