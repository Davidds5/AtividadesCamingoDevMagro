package AtividadesLvFacil;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorHoraAula;
        int numAulaNoMes;
        double percDescontoINSS;

        double salarioBruto;
        double valorDescINSS;
        double salarioLiquido;

        System.out.println("Calculo de Salario Liquido de Professor");
        System.out.println("Informe o valor da HORA_AULA: ");
        valorHoraAula = sc.nextDouble();

        System.out.println("Informe o numero de aulas no mes: ");
        numAulaNoMes = sc.nextInt();

        System.out.println("Informe o percentual de desconto do INSS: ");
        percDescontoINSS = sc.nextDouble();

        salarioBruto = valorHoraAula * numAulaNoMes;

        valorDescINSS = salarioBruto* (percDescontoINSS/ 100.0);

        salarioLiquido = salarioBruto - valorDescINSS;

        System.out.println("\n----Demonstracao do Salario----");
        System.out.printf("Salario Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Salario Liquido: R$ %.2f\n", salarioLiquido);
        System.out.printf("Desconto INSS (%.1f%%): R$ %.2f\n", percDescontoINSS, valorDescINSS);
        System.out.println("_________________________________________");

    }
}
