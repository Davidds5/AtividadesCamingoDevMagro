package AtividadesLvFacil;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // Define a localização para garantir que a entrada de double funcione corretamente
        //sc.useLocale(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorProduto;
        int codigoPagamento;
        double valorFinal;

        // 1. Entrada de Dados
        System.out.println("Digite o valor normal do produto: R$ ");
        valorProduto = sc.nextDouble();

        System.out.println("\nEscolha a forma de pagamento (Digite o código):");
        System.out.println("1 - À Vista em Dinheiro/Pix (15% de desconto)");
        System.out.println("2 - À Vista no cartão de crédito (10% de desconto)");
        System.out.println("3 - Parcelado no cartão em duas vezes (Preço normal)");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais (10% de juros)");
        codigoPagamento = sc.nextInt();


        valorFinal = valorProduto;


        switch (codigoPagamento) {
            case 1:
                // 15% de desconto: 1.0 - 0.15 = 0.85
                valorFinal = valorProduto * 0.85;
                System.out.println("Você escolheu À Vista (Dinheiro/Pix). 15% de desconto aplicado.");
                break;
            case 2:
                // 10% de desconto: 1.0 - 0.10 = 0.90
                valorFinal = valorProduto * 0.90;
                System.out.println("Você escolheu À Vista no Cartão de Crédito. 10% de desconto aplicado.");
                break;
            case 3:
                // Preço normal
                valorFinal = valorProduto;
                System.out.println("Você escolheu Parcelado em 2 vezes. Preço normal.");
                System.out.printf("Valor de cada parcela: R$ %.2f\n", valorProduto / 2);
                break;
            case 4:
                // 10% de juros: 1.0 + 0.10 = 1.10
                valorFinal = valorProduto * 1.10;
                System.out.println("Você escolheu Parcelado em 3 vezes ou mais. 10% de juros aplicado.");
                break;
            default:
                System.out.println("Código de pagamento inválido. Valor final será o preço normal.");
                valorFinal = valorProduto;
                break;
        }


        System.out.println("\n--- Resultado ---");
        System.out.printf("Valor Normal do Produto: R$ %.2f\n", valorProduto);
        System.out.printf("Valor Final a ser Pago: R$ %.2f\n", valorFinal);

        sc.close();
    }
}