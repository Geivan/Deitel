package cap7;
// Passando arrays e elementos do arrays individuais aos métodos.

public class PassArray {
    // main cria array e chama modifyArray e modifyElement
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        
        System.out.printf(
                "Efeito de passar de referência para todo o array:%n" +
                "Os valores originais do array são:%n");
        
        // gera saída de elementos do array original
        for (int value : array)
            System.out.printf("   %d", value);
        
        modifyArray(array); // passa a referência do array
        System.out.printf("%n%nOs valores modificados do array são:%n");
        
        // gera saída de elementos do array modificado
        for (int value : array)
            System.out.printf("   %d", value);
        
        System.out.printf(
                "%n%nEfeitos da passagem do valor do elemento do array:%n" +
                "array[3] antes de modifyElement: %d%n", array[3]);
    
    
        modifyElement(array[3]); // tenta modificar o array[3]
        System.out.printf("array[3] depois de modifyElement: %d%n", array[3]);    
    }

    // multiplica cada elemento de um array por 2
    public static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++)
            array2[counter] *= 2;
    }
    
    // multiplica argumento por 2
    public static void modifyElement(int element) {
        element *= 2;
        System.out.printf("Valor do elemento em modifyElement: %d%n", element);
    }
} // Fim da classe PassArray
