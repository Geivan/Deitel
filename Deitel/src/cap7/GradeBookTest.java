package cap7;
// GradeBookTest cria um objeto GradeBook utilizando um array de notas,
// e, então, invoca o método processGrades para analisá-las.

public class GradeBookTest {
    // método main inicia a execução de programa
    public static void main(String[] args) {  
        // array de notas de aluno
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        
        GradeBook mayGradeBook = new GradeBook(
            "CS101 Introduction to Java Programming", gradesArray);
        
    }
}
