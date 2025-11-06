package AtividadesLvFacil;
//13 - Faça algoritmo que leia o nome e a idade de
//uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.


import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade <18){
            System.out.println("Menor de idade");
        }else {
            System.out.println("Maior de idade");

        }


    }
}