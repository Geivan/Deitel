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
        
        // chama método getAvarage para calcular a nota média
        System.out.printf("%nClass avarage is %.2f%n", getAvarage());
        
        // chama métodos getMinimum e getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %n=d%n%n", getMinimum(), getMaximum());
        
        // chama outputBarChar para imprimir gráfico de distribuição de nota
        outputBarChart();
    }
    
    
}
