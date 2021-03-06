package BancoDados;

import Menu.TryMenu;

import java.util.Scanner;

public class BancoDados {
    public void BancoText() {

        System.out.println("---- O que é Banco de Dados ? ----");
        System.out.println();

        System.out.println("Banco de dados é um conjunto de informações organizadas, geralmente estruturadas");
        System.out.println("em linhas e colunas, em uma série de tabelas.\n");

        ListBanco();

    }

    public void ListBanco() {

        System.out.println(" --- O que estudar ? ---");
        System.out.println();

        System.out.println("* Matemática básica");
        System.out.println("* Lógicas de programação");
        System.out.println("* Arquitetura de computadores");
        System.out.println("* Estatística");
        System.out.println("* Cultura organizacional");
        System.out.println("* Modelagem de dados relacional");
        System.out.println("* Gerência de projetos");
        System.out.println("* Governança de Tecnologia da Informação");
        System.out.println("* Big Data");
        System.out.println("* Business Intelligence, entre outras\n");

        TipoBancos();
    }

    public void TipoBancos() {

        System.out.println("--- Principais Banco de dados ---");
        System.out.println();

        System.out.println("* SQL Server");
        System.out.println("* MySQL");
        System.out.println("* PostgreSQL");
        System.out.println("* MongoDB");
        System.out.println("* NoSQL");


        menuzinho();
    }

    public void menuzinho() {

        Scanner entrada = new Scanner(System.in);

        TryMenu menu = new TryMenu();


        System.out.println();
        System.out.print(" ° 1- Voltar ao menu | ");
        System.out.print(" ° 0- Sair  \n");
        int num = entrada.nextInt();


        switch (num) {
            case 1:
                menu.listMenu();
                break;
            case 0:
                break;
        }

    }
}
