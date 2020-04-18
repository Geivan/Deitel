package cap4;

import java.util.Scanner;

public class FuelsKMTest {
    public static void main(String[] args) {
        FuelsKM fuelskm = new FuelsKM();
        while (fuelskm.getKmDirigidos() != -1){
//        while (fuelskm.getCont() < 5) {        
            System.out.println("Quantos quilômetros você percorreu?");
            Scanner km = new Scanner(System.in);
            int kmDirigidos = km.nextInt();
            System.out.println("Quanto de gasolina você gastou?");
            Scanner gas = new Scanner(System.in);
            int gasolConsumida = km.nextInt();
            fuelskm.calculo(kmDirigidos, gasolConsumida);

            System.out.printf("Seu veículo roda %.2f km/l de combustível%n", fuelskm.getKmpLitro());
            System.out.printf("Distância total percorrida: %d km.%n", fuelskm.getKmTotalDirigidos());
            System.out.printf("Combustível total consumido: %d litros.%n%n", fuelskm.getGasolTotal());                
        }
    }
}
