package cap7;
// Métodos da classe Arrays e System.arraycopy.
import java.util.Arrays;

public class ArrayManipulations {
    public static void main(String[] args) {
        // classifica doubleArray em ordem crescente
        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4 };
        Arrays.sort(doubleArray);
        System.out.printf("/ndoubleArray: ");
        
        for(double value : doubleArray)
            System.out.printf("%.1f ", value);
        
        // preenche o array de 10 elementos com 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray, "filledIntArray");
        
        // copia array intArray em array intArrayCopy
        int[] intArray = { 1, 2, 3, 4, 5, 6 };
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");
    }
}
