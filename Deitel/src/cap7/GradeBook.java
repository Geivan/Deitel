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
    
    // localiza nota mínima
    public int getMinimum(){
        int lowGrade = grades[0]; // supões que grades[0] é a menor nota
        
        // faz um loop pelo array de notas
        for(int grade : grades){
            // se a nota for mais baixa que lowGrade, atribui essa nota a lowGrade
            if(grade < lowGrade)
                lowGrade = grade; // nova nota mais baixa
        }
        
        return lowGrade;
    }
    
    // localiza nota máxima
    public int getMaximum(){
        int highGrade = grades[0]; // supões que grades[0] é a maior nota
        
        // faz um loop pelo array de notas
        for(int grade : grades){
            // se a nota for maior que highGrade, atribui essa nota a highGrade
            if(grade > highGrade)
                highGrade = grade; // nova nota mais alta
        }        
        
        return highGrade;
    }
}
