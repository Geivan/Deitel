package cap6;
// Declarações de métodos sobrecarregados.

public class MethodOverload {
    // teste de métodos square sobrecarregados
    public static void main(String[] args) {
        System.out.printf("Quadrado do inteiro 7 é %d%n", square(7));
        System.out.printf("Quadrado do double 7,5 é %f%n", square(7.5));
    }

    // método square com argumento de int
    public static int square(int intValue) {
        System.out.printf("%nChamada de raíz quadrada com argumento de int: %d%n", intValue);
        return intValue * intValue;
    }

    // método square com argumento double
    public static double square(double doubleValue) {
        System.out.printf("%nChamada de raíz quadrada com argumento double: %f%n", doubleValue);
        return doubleValue *doubleValue;
    }
}
