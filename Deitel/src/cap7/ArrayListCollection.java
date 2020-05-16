package cap7;
// Demonstração da coleção ArrayList<T> genérica.
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        // criar um novo ArrayList de strings com uma capacidade inicial de 10
        ArrayList<String> items = new ArrayList<String>();
        
        items.add("red"); // anexa um item à lista
        items.add(0, "yellow"); // insere "yellow" no índice 0
    }
}
