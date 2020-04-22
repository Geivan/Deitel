package cap6;
// A casse Scope demonstra os escopos de um campo e de variável local.

public class Scope {
    // campo acessível para todos os métodos dessa classe
    private static int x = 1;

    // O método main cria e inicializa a variável local x
    // e chama os métodos useLocalVariable e useField
    public static void main(String[] args){
        int x = 5; // variável local x do método sombreia o campo x

        System.out.printf("local x em main é %d%n", x);

        useLocalVariable(); // useLocalVariable tem uma variável local x
        useField(); // useField utiliza o campo x da classe Scope
        useLocalVariable(); // useLocalVariable reinicializa a variável local x
        useField(); // campo x da classe Scope retém seu valor

        System.out.printf("%nLocal x em main é %d%n", x);
    }

    // cria e inicializa a variaável local x durante cada chamada
    public static void useLocalVariable() {
        int x = 25; // inicializada toda vez que useLocalVariable é chamado

        System.out.printf("%nLocal x no método de entrada useLocal é %d%n", x);
        ++x; // modifica a variável local x desse método
        System.out.printf("Local x antes de existir o método useLocalVariable is %d%n", x);
    }

    // modifica o campo x da classe Scope durante a chamada
}