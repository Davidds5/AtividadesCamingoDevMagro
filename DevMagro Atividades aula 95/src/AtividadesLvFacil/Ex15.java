package AtividadesLvFacil;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        final int DIAS_NO_ANO = 365;
        final int DIAS_NO_MES = 30;
        final int ANO_ATUAL = 2025;

        int anoNascimento;
        int anosCompletos;
        int diasTotal;

        int anosVividos;
        int mesesVividos;
        int diasRestantes;

        System.out.print("Informe o ano em que a pessoa nasceu (Ex: 1990): ");
        anoNascimento = sc.nextInt();


        anosCompletos = ANO_ATUAL - anoNascimento;

        diasTotal = anosCompletos * DIAS_NO_ANO;


        anosVividos = diasTotal / DIAS_NO_ANO;
        diasRestantes = diasTotal % DIAS_NO_ANO;
        mesesVividos = diasRestantes / DIAS_NO_MES;


        diasRestantes = diasRestantes % DIAS_NO_MES;


        System.out.println("\n--- Resultado Aproximado ---");
        System.out.println("Considerando o ano atual como: " + ANO_ATUAL);
        System.out.println("A pessoa viveu:");
        System.out.println(
                anosVividos + " anos, " +
                        mesesVividos + " meses e " +
                        diasRestantes + " dias de vida."
        );

        sc.close();
    }
}