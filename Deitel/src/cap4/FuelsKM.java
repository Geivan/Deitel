/*(Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista monitorou 
várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos como inteiros)
para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para cada viagem e imprimir a quilometragem
total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. Todos os cálculos de média devem produzir
resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela para obter os dados do usuário.*/

package cap4;

public class FuelsKM {
    private int kmDirigidos;
    private int gasolConsumida;
    private double kmpLitro;
    private int kmTotalDirigidos = 0;
    private int gasolTotal = 0;
    private int cont = 0;
    
    public FuelsKM() {
    }
    
    public void calculo(int kmDirigidos, int gasolConsumida) {        
        kmpLitro = (double) kmDirigidos/gasolConsumida;
        kmTotalDirigidos += kmDirigidos;
        gasolTotal += gasolConsumida; 
        cont++;
    }
        
    public int getKmDirigidos() {
        return kmDirigidos;
    }
    public void setKmDirigidos(int kmDirigidos) {
        this.kmDirigidos = kmDirigidos;
    }
    
    public int getGasolConsumida() {
        return gasolConsumida;
    }
    public void setGasolConsumida(int gasolConsumida) {
        this.gasolConsumida = gasolConsumida;
    }
    
    public double getKmpLitro() {
        return kmpLitro;
    }
    public void setKmpLitro(double kmpLitro) {
        this.kmpLitro = kmpLitro;
    }
    
    public int getKmTotalDirigidos() {
        return kmTotalDirigidos;
    }
    public void setKmTotalDirigidos(int kmTotalDirigidos) {
        this.kmTotalDirigidos = kmTotalDirigidos;
    }
    
    public int getGasolTotal() {
        return gasolTotal;
    }
    public void setGasolTotal(int gasolTotal) {
        this.gasolTotal = gasolTotal;
    }
    
    public int getCont() {
        return cont;
    }
    public void setCont(int cont) {
        this.cont = cont;
    }
} // Fim da classe FuelsKM
