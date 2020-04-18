package cap3;

public class Employee {
    private String nome;
    private String sobrenome;
    private double salario;
    
    public Employee(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salario > 0.0)
            this.salario = salario + salario * 0.1;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getSobrenome(){
        return sobrenome;
    }    
   
    public double getSalario(){
        return salario;
    }
}
