package cap5;
/*(Calculando o produto de números inteiros ímpares) Escreva um aplicativo que 
calcula o produto dos números inteiros ímpares de 1 a 15.*/
public class Ex5_12 {
    public static void main(String[] args){
        int produto = 1;
        for(int i = 1; i <= 15; i += 2){
            produto *= i;
        }
        System.out.println(produto);
    }
}
