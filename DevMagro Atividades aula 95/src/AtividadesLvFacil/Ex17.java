package AtividadesLvFacil;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fohrenheit: ");
        double F = sc.nextDouble();

        double C = (5 * (F - 32)) / 9.0;

        System.out.println("Temperatura em Fohrenheit: "+ F);
        System.out.println("Temperatura em Celsius: "+ C);
    }
}
