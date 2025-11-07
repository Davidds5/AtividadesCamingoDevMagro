package AtividadesLvFacil;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double CONSUMO_POR_LITRO = 12.0;

        double tempoGasto;
        double velocidade;
        double distancia;
        double litrosGastos;

        System.out.println("---Calculo de combustivel de Viagem---");
        System.out.println("informe o tempo gasto das viagens em horas: ");
        tempoGasto = sc.nextDouble();

        System.out.println("Informe a velocidade media durante a viagem(Km): ");
        velocidade = sc.nextDouble();

        distancia = tempoGasto * velocidade;

        litrosGastos = distancia / CONSUMO_POR_LITRO;

        System.out.println("\n Resumo Da Viagem");
        System.out.printf("Tempo Gasto: %.2f horas\n", tempoGasto);
        System.out.printf("Velocidade Media: %.2f Km\n", velocidade);

        System.out.printf("Distancia Pecorrida: %.2f km\n", distancia);
        System.out.printf("Litros Gastos: %.2f L\n", litrosGastos);
        System.out.println("_____________________________________________________");
    }
}
