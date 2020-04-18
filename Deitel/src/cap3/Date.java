/*
 Crie uma classe chamada Date que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int).
Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método
set e um get para cada variável de instância. Apresente um método displayDate que exiba mês, dia e ano separados por barras normais
(/). Escreva um aplicativo de teste chamado DateTest que demonstre as capacidades da classe Date.
 */
package cap3;

public class Date {
    private int mes;
    private int dia;
    private int ano;
    
    public Date(int mes, int dia, int ano){
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getMes() {
        return mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getDia() {
        return dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }
    
    public void displayDate(){
        System.out.printf("%s/%s/%s%n", getMes(), getDia(), getAno());
    }
    
    
}
