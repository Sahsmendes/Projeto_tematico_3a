package View;

import java.util.Scanner;

public class EtapaDeEnsino {

    Scanner scan = new Scanner(System.in);

    public int Etapas() {
        System.out.println("Defina a Etapa de Ensino:");
        System.out.println("1 - Infantil");
        System.out.println("2 - Fundamental Inicial");
        System.out.println("3 - Fundamental Final");
        System.out.println("4 - Médio");
        int opcao = scan.nextInt();
        return opcao;
    }
}
