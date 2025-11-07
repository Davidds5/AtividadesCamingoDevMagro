package AtividadesLvFacil;
//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            System.out.println("-------------------");
            System.out.println("TABUADA DE: "+ i);
            System.out.println("-------------------");

            for (int j = 0; j <=10 ; j++) {
                int resultado = i * j;

                System.out.println(i+"x"+j+" = "+ resultado);
            }
            System.out.println();
        }
    }
}
