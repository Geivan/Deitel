package cap7;
// casse GradeBook utilizando um array bidimensional para armazenar notas.

public class GradeBook1 {
    private String courseName; // nome do curso que essa GradeBook representa
    private int[][] grades; // array bidimentional de notas de aluno
    
    // construtor de dois argumentos inicializados CourseName e array de notas
    public GradeBook1(String courseName, int[][] grades){
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
        
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());
       
        // gera a saída de gráfico de distribuição de notas de todas as notas em todos os testes
        outputBarChart();
    }
    
    // localiza nota mínima
    public int getMinimum(){
        // supões que grades[0] é a menor nota
        int lowGrade = grades[0][0]; 
        
        // faz um loop pelas linhas do array de notas
        for(int[] studentGrades : grades){
            // faz um loop pelas colunas de linha atual
            for(int grade : studentGrades){
                // se a nota for menor que lowGrade, atribui a nota a lowGrade
                if(grade < lowGrade)
                    lowGrade = grade;
            }
        }
        
        return lowGrade;
    }
    
    // localiza nota máxima
    public int getMaximum(){
        // supõe que o primeiro elemento de array de notas é o maior
        int highGrade = grades[0][0]; 
        
        // faz um loop pelas linhas do array de notas
        for(int[] studentGrades : grades){
            // faz um loop pelas colunas da linha atual
            for(int grade : studentGrades){
                // se a nota for maior que highGrade, atribui essa nota a highGrade
                if(grade > highGrade)
                    highGrade = grade;
            }
        }        
        
        return highGrade;
    }
    
    // determina média do cojunto particular de notas
    public double getAverage(int[] setOfGrades){
        int total = 0;
        
        // soma notas de um aluno
        for(int grade : setOfGrades)
            total += grade;
        
        // retorna média de notas
        return (double) total / setOfGrades.length;
    }
    
    // gera a saída do gráfico de barras exibindo distribuição de notas
    public void outputBarChart(){
        System.out.println("Overall grade distribuition:");
        
        // armazena frequência de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];
        
        // para cada nota em GradeBook, incrementa a frequência apropriada
        for(int[] studentGrades : grades){
            for(int grade : studentGrades)
                ++frequency[grade / 10];
        }
            
        
        // para cada frequência de nota, imprime barra no gráfico
        for(int count = 0; count < frequency.length; count++){
            // gera saída do rótulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
            if(count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
            
            // imprime a barra de asteriscos
            for(int stars = 0; stars < frequency[count]; stars++)
                System.out.printf("*");
            
            System.out.println();                   
        }
    }
    
    // gera a saída do conteúdo do array de notas
    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        System.out.print("            "); // alinha títulos de coluna
        
        // cria um título de coluna para cada um dos testes
        for(int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d  ", test + 1);
        
        System.out.println("Avarage"); // título da coluna de média do aluno
        
        // cria linhas/colunas de texto que representam notas de array
        for(int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d", student + 1);
            
            for(int test : grades[student]) // gera saída de notas do aluno
                System.out.printf("%8d", test);
            
            // chama método getAvarage para calcular a média do aluno;
            // passa linha de notas como o argumento para getAvarage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
} // Fim da classe GradeBook1
