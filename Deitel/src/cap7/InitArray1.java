package cap7;
// Inicializando um array com argumentos de linha de comando.

public class InitArray1 {
    public static void main(String[] args) {
        // verifica número de argumentos de linha de comando
        if(args.length != 3)
            System.out.printf(
                "Error: Please re-enter the entire command, including\n" +
                "an array size, initial value and increment./n");
        
    }
}
