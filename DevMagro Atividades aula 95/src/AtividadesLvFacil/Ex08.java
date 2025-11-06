package AtividadesLvFacil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//8- Faça um algoritmo que leia três valores inteiros
//diferentes e imprima na tela os valores em ordem decrescente.
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o " + (i+1)+" Valor: ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }
        // colletions do java com o uso de sort para organiza em ordem crescente,
        // reverse para organiza em ordem descrecente
        Collections.sort(numeros);
        Collections.reverse(numeros);

        for (Integer numero : numeros){
            System.out.print(numero+", ");
        }
    }
}
