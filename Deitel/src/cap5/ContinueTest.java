package cap5;
// Instrução continue que termina uma iteração de uma instrução for.
public class ContinueTest {
    public static void main(String[] args){
        int c = 1;
        for(int count = 1; count <= 10; count++){ // faz o loop 10 vezes
            if(count == 5)
                continue; // pula o código restante no corpo do loop se a contagem for 5
            
            System.out.printf("%d ", count);
        }      
        
        System.out.printf("%nUsed continue to skip printing 5%n");        
    }
} // Fim da classe ContinueTest
