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
}
