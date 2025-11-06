package AtividadesLvFacil;

import java.util.Scanner;
//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe uim valor qualquer: ");
        double valor = sc.nextDouble();

        double reajuste = valor + valor * 0.05;
        System.out.println("Valor digitado: "+valor);
        System.out.println("Valor reajuste: "+reajuste);
    }
}
