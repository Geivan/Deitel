package cap5;
/*(Localize o menor valor) Escreva um aplicativo que localiza o menor de vários 
números inteiros. Suponha que o primeiro valor lido
especifica o número de valores a serem inseridos pelo usuário.*/
import java.util.Scanner;

public class Ex5_11 {
    public static void main(String[] args) {
        int quantidade, numero, menor = 0;
        
        // inicializa um Scanner para receber entrada do teclado
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual quantidade de números deseja comparar?");
        
        // recebe a quantidade de números que serão comparados
        quantidade = entrada.nextInt();
        
        int aux = entrada.nextInt();
        
        for(int i = 1; i < quantidade; i++){ 
            int j = entrada.nextInt();
            if(j > aux)
                menor = aux;
            else
                menor = j;
            aux = menor;
        }
        System.out.printf("O menor número digitado foi %d%n", menor);
    }
}
