package AtividadesLvFacil;

import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida
//imprima na tela a soma entre A e B é mostre se a soma é menor que C.
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe o valor de A: ");
        double valorA = sc.nextDouble();

        System.out.println("informe o valor de B: ");
        double valorB = sc.nextDouble();

        System.out.println("informe o valor de C: ");
        double valorC = sc.nextDouble();

        double soma =valorA + valorB;
        System.out.println(soma);
        if (soma < valorC){
            System.out.println("Soma menor que valor C");
        }else {
            System.out.println("Soma maior que valor C");
        }




    }
}
