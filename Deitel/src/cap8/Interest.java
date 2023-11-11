package cap8;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Interest {
    public static void main(String[] args){
        // quantidade principal inical antes dos juros
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal taxa = BigDecimal.valueOf(0.05);

        // exibe cabeçalhos
        System.out.printf("%s%20s%n", "Ano", "Valor em depósito");

        // calcula a quantidade de depósito para cada um dos 10 anos
        for(int ano = 1; ano <= 10; ano++){
            // calcula a nova quantidade durante o ano especificado
            BigDecimal valor = principal.multiply(taxa.add(BigDecimal.ONE).pow(ano));

            // exibe o ano e a quantidade
            System.out.printf("%3d%20s%n", ano, NumberFormat.getCurrencyInstance().format(valor));
        }
    }
}
