package AtividadesLvFacil;


import java.util.Scanner;

//10 - Faça um algoritmo que leia
//três notas obtidas por um aluno, e imprima na tela a média das notas.
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double notas[] = new double[3];

        System.out.println("-----Calculadora de Media-----");
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Informe a nota "+ (i+1)+": ");
            notas[i] = sc.nextDouble();
        }

        double soma = 0;
        System.out.println("----Somando as Notas----");
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        System.out.println("Soma da notas: "+ soma);
        double media = soma / notas.length;

        sc.close();
    }


}
