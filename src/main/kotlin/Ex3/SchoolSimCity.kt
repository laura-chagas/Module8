package Ex3

fun main() {

    val gradeSystem = GradeSystem()

    gradeSystem.receiveGrade()

    for (i in 1 .. 3) {
        gradeSystem.menuOpc()
    }



}
