package cap7;
// Inicializando arrays bidimensionais.

public class InitArray4 {
    // cria e gera saída de arrays bidimensionais
    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};
        
        System.out.println("Values in array1 by row are");
        outputArray(array1); // exibe array1 por linha
        
        System.out.printf("%nValues in array2 by row are%n");
    }
}
