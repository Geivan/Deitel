package cap7;
// Inicializando os elementos de um array como valores padrão de zero.
public class InitArray {
    public static void main(String[] args) {
        // delcara array variável e o inicializa com um objeto array
        int[] array = new int[10]; // cria o objeto array
        
        System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna
        
        // gera saída do valor de cada elemento do array
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
    }
} // Fim da classe InitArray
