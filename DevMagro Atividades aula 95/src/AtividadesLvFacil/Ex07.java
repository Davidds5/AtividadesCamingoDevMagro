package AtividadesLvFacil;

import java.util.Scanner;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos)
// e determine se ambos são VERDADEIRO ou FALSO.
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro valor boolean(True | False): ");
        boolean valor1 = sc.nextBoolean();

        System.out.println("Informe o segundo valor Boolean(True | False): ");
        boolean valor2 = sc.nextBoolean();

        boolean ambosVerdadeiros = valor1 & valor2;
        boolean ambosFalsos = !valor1 & !valor2;

        if (ambosVerdadeiros) {
            System.out.println("Ambos valores sao verdadeiros !!");
        } else if (ambosFalsos) {
            System.out.println("Ambos valores sao falsos !!");
        } else {
            System.out.println("Os valores sao diferentes um do outro !!");
        }
        sc.close();
    }

}
