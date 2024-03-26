package View;

import java.util.Scanner;

public class EtapaDeEnsino {

    Scanner scan = new Scanner(System.in);

    public int Etapas() {
        System.out.println("Defina a Etapa de Ensino:");
        System.out.println("1 - Infantil"); // idade menor que 6 anos
        System.out.println("2 - Fundamental Inicial"); // entre 6 e 11 anos
        System.out.println("3 - Fundamental Final"); // entre 11 e 15 anos
        System.out.println("4 - Médio"); // entre 15 e 18 anos
        int opcao = scan.nextInt();
        return opcao;
    }
}
