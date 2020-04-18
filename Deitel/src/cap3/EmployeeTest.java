package cap3;

public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1 = new Employee("Geivan", "Martins", 2000.0);
        Employee emp2 = new Employee("Fulano", "Silva", 1000.0);
        
        System.out.printf("%s %s recebe R$ %.2f mensais.%n", emp1.getNome(), emp1.getSobrenome(), emp1.getSalario());
        System.out.printf("%s %s recebe R$ %.2f mensais.%n%n", emp2.getNome(), emp2.getSobrenome(), emp2.getSalario());
        
        double sn = emp1.getSalario() * 12;
        System.out.printf("%s %s recebe R$ %.2f anuais.%n", emp1.getNome(), emp1.getSobrenome(), sn);
        sn = emp2.getSalario() * 12;
        System.out.printf("%s %s recebe R$ %.2f anuais.%n%n", emp2.getNome(), emp2.getSobrenome(), sn);
    }
}
