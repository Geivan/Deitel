package cap7;
// Demonstração da coleção ArrayList<T> genérica.
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        // criar um novo ArrayList de strings com uma capacidade inicial de 10
        ArrayList<String> items = new ArrayList<String>();
        
        items.add("red"); // anexa um item à lista
        items.add(0, "yellow"); // insere "yellow" no índice 0
        
        // cabeçalho
        System.out.print("Display list contents with couter-contrelled loop:");
        
        // exibe as cores na lista
        for(int i = 0; i < items.size(); i++)
            System.out.printf(" %s", items.get(i));
        
        // exibe as cores usando for aprimorada no método display
        display(items, "\nDisplay list contents with enhanced for statement:");
    }
}
