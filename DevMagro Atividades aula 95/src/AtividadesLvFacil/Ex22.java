package AtividadesLvFacil;

import java.util.Scanner;

//22 - Faça um algoritmo que leia dois valores inteiros A e B, imprima na
//tela o quociente e o resto da divisão inteira entre eles.
public class Ex22 {
    public static void main(String[] args) {
        int dividendo;
        int divisor;
        int quocinte, resto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero (Dividendo): ");
        dividendo = sc.nextInt();

        System.out.println("Informe outro numero (Divisor): ");
        divisor = sc.nextInt();

        if (divisor == 0){
            System.out.println("Erro, Divisor nao pode ser Zero(0)!");
        }else{
            quocinte = dividendo / divisor;

            resto = dividendo % divisor;

            System.out.println("Resultado da Divisao Inteira");
            System.out.println("Dividendo: "+ dividendo);
            System.out.println("Divisor: "+ divisor);
            System.out.println("Quociente: "+ quocinte);
            System.out.println("Resto: "+ resto);
            System.out.println("_____________________________");


        }
        sc.close();
    }
}
