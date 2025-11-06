package AtividadesLvFacil;

import java.util.Scanner;

//14 - Faça um algoritmo que receba um valor A e B, e troque
//o valor de A por B e o valor de B por A e imprima na tela os valores.
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor A: ");
        int valorA = sc.nextInt();

        System.out.println("Informe o valor B: ");
        int valorB = sc.nextInt();

        int troca = valorA;
        valorA = valorB;
        valorB = troca;

        System.out.println("Valor A: "+valorA);
        System.out.println("Valor B: "+valorB);

    }
}
