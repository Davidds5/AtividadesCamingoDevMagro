package AtividadesLvFacil;

import java.util.Scanner;

//2 - Faça um algoritmo para receber um número qualquer e imprimir
//na tela se o número é par ou ímpar, positivo ou negativo.
public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero qualquer: ");
        int numero = sc.nextInt();

        System.out.println("-------Numero par ou impar-------");
        if (numero % 2 == 0){
            System.out.println("Numero par");
        }else {
            System.out.println("Numero Impar");
        }
        System.out.println("_______________________");

        System.out.println("------Numero negativo ou positivo------");
        if (numero < 0){
            System.out.println("Numero negativo");
        }else {
            System.out.println("Numero positivo");
        }
    }
}
