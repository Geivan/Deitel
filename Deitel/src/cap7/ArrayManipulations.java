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
    }
}
