package cap7;
// GradeBookTest1 cria o objeto GradeBook1 utilizando um array bidimensional
// das notas e, então, invoca o método processGrades para analisá-las.

public class GradeBookTest1 {
    // método main inicia a execução de programa
    public static void main(String[] args) {
        // array bidimensional de notas de aluno
        int[][] gradesArray = {{87, 96, 70}, {68, 87, 90}, {94, 100, 90},
                               {100, 81, 82}, {83, 65, 85}, {78, 87, 65},
                               {85, 75, 83}, {91, 94, 100}, {76, 72, 84},
                               {87, 93, 73}};        
        
        GradeBook1 myGradeBook1 = new GradeBook1(
                "CS101 Introduction to Java Programing", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",
                myGradeBook1.getCourseName());
        myGradeBook1.processGrades();
    }
}
