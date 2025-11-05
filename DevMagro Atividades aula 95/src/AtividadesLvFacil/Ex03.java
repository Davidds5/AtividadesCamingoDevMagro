package AtividadesLvFacil;

import java.util.Scanner;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se
//os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B Ao final de
//qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//imprimir seu valor na tela.
public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Segundo valor: ");
        int valor2 = sc.nextInt();
        int C;

        if (valor1 == valor2){
            System.out.println("Somando ....");
            C = valor1 + valor2;

        }else {
            System.out.println("Multiplicando....");
            C = valor1 * valor2;
        }
        System.out.println(C);

    }
}
