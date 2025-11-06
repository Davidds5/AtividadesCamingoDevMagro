package AtividadesLvFacil;

import java.util.Scanner;

//11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
//calcule a média das nota obtidas, imprima na tela o nome do aluno e
//se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média
//final deve ser maior ou igual a 7.
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[3];
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Informe a "+(i+1)+" nota: ");
            notas[i] = sc.nextDouble();
        }
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        double mediaNotas = soma / notas.length;

        if (mediaNotas < 7){
            System.out.println("Reprovado");
            System.out.printf("Media: %.2f", mediaNotas);
        }else {
            System.out.println("Aprovado");
            System.out.printf("Media: %.2f", mediaNotas);

        }
        sc.close();

    }
}
