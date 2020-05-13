package cap7;
// Utilizando listas de argumentos de comprimento variável.

public class VarargsTest {
    // calcula a média
    public static double avarage(double... numbers){
        double total = 0.0;
        
        // calcula total utilizando a instrução for aprimorada
        for(double d : numbers)
            total += d;
        
        return total / numbers.length;
    }
    
    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;
        
        
    }
}
