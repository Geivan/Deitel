/*Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HeartRates e
imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade
da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.*/
package cap3;

public class HeartRatesTest {
    public static void main(String[] args){
        HeartRates hr = new HeartRates("Geivan", "Martins", 3, 1, 1992);
        
        System.out.printf("Nome: %s\nSobrenome: %s\nIdade: %d\nFrequência Cardíaca Máxima: %d\n"
                + "Frequência Cardíaca Alvo: ", hr.getNome(),hr.getSobrenome(), hr.idade(), hr.fcMax());
        hr.fcAlvo();
    }
}
