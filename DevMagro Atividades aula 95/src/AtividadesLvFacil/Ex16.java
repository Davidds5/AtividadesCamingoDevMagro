package AtividadesLvFacil;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ladoA, ladoB, ladoC;


        System.out.println("--- Classificador de Triângulos ---");
        System.out.print("Digite o valor do Lado A: ");
        ladoA = sc.nextDouble();
        System.out.print("Digite o valor do Lado B: ");
        ladoB = sc.nextDouble();
        System.out.print("Digite o valor do Lado C: ");
        ladoC = sc.nextDouble();

        System.out.println("------------------------------------");


        boolean ehTriangulo =
                (ladoA < ladoB + ladoC) &&
                        (ladoB < ladoA + ladoC) &&
                        (ladoC < ladoA + ladoB);

        if (ehTriangulo) {
            System.out.println("Os valores informados FORMAM um triângulo.");


            if (ladoA == ladoB && ladoB == ladoC) {
                // Todos os lados são iguais
                System.out.println("O triângulo é: EQUILÁTERO (três lados iguais).");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                // Pelo menos dois lados são iguais
                System.out.println("O triângulo é: ISÓSCELES (dois lados iguais).");
            } else {
                // Nenhum lado é igual
                System.out.println("O triângulo é: ESCALENO (três lados diferentes).");
            }

        } else {

            System.out.println("Os valores informados NÃO FORMAM um triângulo.");
            System.out.println("Motivo: A soma de dois lados deve ser maior que o terceiro lado.");
        }

        sc.close();
    }
}