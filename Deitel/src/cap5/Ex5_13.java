package cap5;
/*(Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. 
O fatorial de um inteiro positivo n (escrito como n! e pronunciado como “fatorial de n”) 
é igual ao produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que 
calcula os fatoriais de 1 a 20. Utilize o tipo long. Exiba os resultados em formato 
tabular. Que dificuldade poderia impedir você de calcular o fatorial de 100?*/
import java.text.NumberFormat;

public class Ex5_13 {
    public static void main(String[] args) {
        long fatorial = 1;
        NumberFormat inteiro = NumberFormat.getInstance();
        
        for(int i = 20; i > 1; i--){
            for(int j = i; j > 1; j--){
                fatorial *= j;
            }
            System.out.printf("Fatorial de %d é %s%n", i, inteiro.format(fatorial));
            fatorial = 1;
        }        
    }
}
