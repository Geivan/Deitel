/*(Calculadora de frequência cardíaca alvo) Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver
se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. Segundo a American Heart Association (AHA) 
(www.americanheart.org/presenter.jhtml?identifier=4736), a fórmula para calcular a frequência cardíaca
máxima por minuto é 220 menos a idade em anos. Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca
máxima. [Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar com
base na saúde, capacidade física e sexo da pessoa. Sempre consulte um médico ou profissional de saúde qualificado antes de começar
ou modificar um programa de exercícios físicos.] Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome,
sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um
construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get. A classe também deve incluir um método
que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência
cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HeartRates e
imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade
da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.*/

package cap3;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private int dia, mes, ano;
    
    public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(ano > 1900 && ano < 2019){
            this.ano = ano;
            if(mes >= 1 && mes <= 12){
                this.mes = mes;
                if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    if(dia >= 1 && dia <= 31)
                        this.dia = dia;
                } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    if(dia >= 1 && dia <= 30)
                        this.dia = dia;                    
                } else if(mes == 2 && ano % 4 == 0){
                    if(dia <= 1 && dia <= 29)
                        this.dia = dia;
                } else if(mes == 2 && ano % 4 != 0)
                    this.dia = dia;
            }
        }       
    }
    
    public int idade(){
        return 2019 - ano;
    }
    
    public int fcMax(){
        return 220 - idade();
    }
    public void fcAlvo(){
        float fcAlvo1 = 50 * fcMax() / 100;
        float fcAlvo2 = 85 * fcMax() / 100;
        System.out.printf("%.2f - %.2f\n\n", fcAlvo1, fcAlvo2);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
