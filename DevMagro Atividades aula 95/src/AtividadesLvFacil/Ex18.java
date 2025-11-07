package AtividadesLvFacil;

public class Ex18 {
    public static void main(String[] args) {
        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;

        final double crescimentoFrancisco = 2;
        final double crescimentoSara = 3;

        int anos = 0;
        System.out.println("Inicio de Simulacao: ");
        System.out.printf("Francisco: %.2f cm | Sara: %.2f cm \n", alturaFrancisco, alturaSara);
        System.out.println("________________________________________________________-");

        while(alturaSara < alturaFrancisco){
            alturaFrancisco += crescimentoFrancisco;
            alturaSara += crescimentoSara;
            anos += 1;
        }
        System.out.println("\n---Resultado Final---");
        System.out.printf("Altura final de Francisco: %.2f \n", alturaFrancisco);
        System.out.printf("Altura final de Sara: %.2f\n", alturaSara);

        System.out.println("Foram necessarios: "+ anos+" anos");
    }
}
