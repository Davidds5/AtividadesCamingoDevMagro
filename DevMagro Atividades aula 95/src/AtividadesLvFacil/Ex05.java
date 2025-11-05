package AtividadesLvFacil;

import java.util.Scanner;

//5 - Faça um algoritmo que leia o valor do salário mínimo e
//o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double SALARIO_MINIMO = 1293.00;

        System.out.println("Informe o salario do usuario: ");
        double salarioUsuario = sc.nextDouble();

        double quantidadeSalariosMinimos = salarioUsuario / SALARIO_MINIMO;


        System.out.println("\n--- Resultado do Cálculo ---");
        System.out.printf("Valor do Salário Mínimo utilizado: R$ %.2f\n", SALARIO_MINIMO);
        System.out.printf("Seu salário é: R$ %.2f\n", salarioUsuario);

        System.out.printf("Você recebe o equivalente a %.2f salários mínimos.\n", quantidadeSalariosMinimos);

        sc.close();
    }
}
