package AtividadesLvFacil;

import java.util.Random;

public class Ex21 {
    public static void main(String[] args) {
        System.out.println("-------Valor aleatorio-------");
        // para gera um numero aleatorio primeiro precisa se estancia o metodo
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101);

        int valorAleatorio = (int) (Math.random() * 101);

        System.out.println("Numero aleatorio (Radom): "+numeroAleatorio);
        System.out.println("Valor Aleatorio: "+ valorAleatorio);
    }
}
