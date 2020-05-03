package cap7;
// classe GradeBook utilizando um array para armazenar notas de testes.

public class GradeBook {
    private String courseName; // nome do curso que essa GradeBook representa
    private int[] grades; // array de notas de aluno
    
    // construtor
    public GradeBook(String courseName, int[] grades){
        this.courseName = courseName;
        this.grades = grades;
    }
    
    // método para configurar o nome do curso
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    
    // método para recuperar o nome do curso
    public String getCourseName(){
        return courseName;
    }
    
    // realiza várias operações de dados
    public void processGrades(){
        // gera saída de array de notas
        outputGrades();
    }
}
