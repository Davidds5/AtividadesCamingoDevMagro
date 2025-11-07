package AtividadesLvFacil;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor inteiro: ");
        int numero = sc.nextInt();

        System.out.println("---------------------");
        System.out.println("TABUADA DO "+ numero);
        System.out.println("---------------------");

        for (int i = 0; i <=10 ; i++) {
            System.out.println(numero+"x"+i+" = "+numero*i);

        }

    }

}
