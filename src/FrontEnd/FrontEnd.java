package FrontEnd;

import Menu.TryMenu;

import java.util.Scanner;

public class FrontEnd {

    public  void FrontText() {

        System.out.println(" ---- O que é Front-End ?---- ");
        System.out.println("");

        System.out.println("Podemos classificar como a parte visual de um site, aquilo que conseguimos interagir.");
        System.out.println("Quem trabalha com Front End é responsável por desenvolver por meio do código uma interface gráfica\n");

        logica();
    }

    public  void logica() {

        System.out.println(" --- Lógica de Programação --- ");
        System.out.println();

        System.out.println("É comum para quem está começando como programador ouvir falar sobre isso, porém poucos dão a devida importância.");
        System.out.println("Aguçar seu entendimento e raciocínio lógico faz com que você resolva questões não apenas matemáticas, mas assuntos do cotidiano com mais facilidade.\n");

        System.out.println();

        listTech();
    }

    public  void listTech() {

        System.out.println(" --- Tecnologias para começar --- ");
        System.out.println();

        System.out.println(" -- Iniciante --");
        System.out.println("* HTML");
        System.out.println("* CSS");
        System.out.println("* JavaScript");

        System.out.println();

        System.out.println(" -- Avançado -- ");
        System.out.println("* Framework");
        System.out.println("* Bibliotecas");
        System.out.println("* API'S");

        menuzinho();
    }

    public void menuzinho() {

        Scanner entrada = new Scanner(System.in);

        TryMenu menu = new TryMenu();


        System.out.println();
        System.out.print(" ° 1- Voltar ao menu | ");
        System.out.print(" ° 0- Sair  \n");
        int num = entrada.nextInt();


        switch (num){
            case 1:
                menu.listMenu();
                break;
            case 0:
                break;
        }
    }
}
