package AtividadesLvFacil;

import java.util.Scanner;

//4 - Faça um algoritmo que receba um número
//inteiro e imprima na tela o seu antecessor e o seu sucessor.
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero inteiro: ");
        int numero = sc.nextInt();

        int numeroAntes = numero - 1;
        int numeroDepois = numero + 1;

        System.out.println("Numero informado: "+numero);
        System.out.println("Seu antecessor: "+numeroAntes);
        System.out.println("Seu sucessor: "+numeroDepois);
        }
    }

