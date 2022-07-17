package BancoDados;

import Menu.TryMenu;

import java.util.Scanner;

public class BancoDados {
    public void BancoText() throws InterruptedException {
    	/*
        System.out.println("---- O que é Banco de Dados ? ----");
        System.out.println();

        System.out.println("Banco de dados é um conjunto de informações organizadas, geralmente estruturadas");
        System.out.println("em linhas e colunas, em uma série de tabelas.\n");
		*/
    	System.out.println("\n");
    	Thread.sleep(750);
    	System.out.println("//=========================================================================================================================\\\\\n"
    			+ "|]       ___                                      ___                         _        ___         _            ___         [|\n"
    			+ "|]      | . |  ___  _ _  ___   ___   _ _ ._ _ _  | . > ___ ._ _  ___  ___   _| | ___  | . \\ ___  _| | ___  ___ <_. >        [|\n"
    			+ "|]      | | | / . || | |/ ._> / ._> | | || ' ' | | . \\<_> || ' |/ | '/ . \\ / . |/ ._> | | |<_> |/ . |/ . \\<_-<  /_/         [|\n"
    			+ "|]      `___' \\_  |`___|\\___. \\___. `___||_|_|_| |___/<___||_|_|\\_|_.\\___/ \\___|\\___. |___/<___|\\___|\\___//__/  <_>         [|\n"
    			+ "|]              |_|                                                                                                         [|\n"
    			+ "|]              |_|                                                                                                         [|\n"
    			+ "|]                                                                                                                          [|\n"
    			+ "|]                                                                                                                          [|\n"
    			+ "|]          Banco de dados é um conjunto de informações organizadas, geralmente estruturadas                                [|\n"
    			+ "|]	    em linhas e colunas, em uma série de tabelas.                                                                   [|\n"
    			+ "|]                                                                                                                          [|\n"
    			+ "|]                                                                                                                          [|\n"
    			+ " \\\\=========================================================================================================================//");
        ListBanco();

    }

    public void ListBanco() throws InterruptedException {
    	/*
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
		*/
    	System.out.println("\n");
    	Thread.sleep(750);
    	System.out.println("//========================================================================================================================\\\\\n"
    			+ "|]                            ___                              _          _             ___                                [|\n"
    			+ "|]                           | . |  ___  _ _  ___   ___  ___ _| |_ _ _  _| | ___  _ _  <_. >                               [|\n"
    			+ "|]                           | | | / . || | |/ ._> / ._><_-<  | | | | |/ . |<_> || '_>  /_/                                [|\n"
    			+ "|]                           `___' \\_  |`___|\\___. \\___./__/  |_| `___|\\___|<___||_|    <_>                                [|\n"
    			+ "|]                                   |_|                                                                                   [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   MATEMATICA BASICA                                                                                           [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   LOGICA DE PROGRAMACAO                                                                                       [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   ARQUITETURA DE COMPUTADORES                                                                                 [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   ESTATISTICA                                                                                                 [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   CULTURA ORGANIZACIONAL                                                                                      [|\n"
    			+ "|]       \\/                                                                                                                [| \n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   MODELAGEM DE DADOS RELACIONAIS                                                                              [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   GERENCIA DE PROJETOS                                                                                        [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   GOVERNANCA DE TECNOLOGIA DA INFORMACAO                                                                      [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   BIG DATA                                                                                                    [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   BUSINESS INTELLIGENCE                                                                                       [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ " \\\\=======================================================================================================================//");
        TipoBancos();
    }

    public void TipoBancos() throws InterruptedException {
    	/*
        System.out.println("--- Principais Banco de dados ---");
        System.out.println();

        System.out.println("* SQL Server");
        System.out.println("* MySQL");
        System.out.println("* PostgreSQL");
        System.out.println("* MongoDB");
        System.out.println("* NoSQL");
		*/
    	System.out.println("\n");
    	Thread.sleep(750);
    	System.out.println("//========================================================================================================================\\\\\n"
    			+ "|]        ___       _            _            _       ___                             _        ___         _               [|\n"
    			+ "|]       | . \\ _ _ <_>._ _  ___ <_> ___  ___ <_> ___ | . > ___ ._ _  ___  ___  ___  _| | ___  | . \\ ___  _| | ___  ___     [|\n"
    			+ "|]       |  _/| '_>| || ' |/ | '| || . \\<_> || |<_-< | . \\<_> || ' |/ | '/ . \\<_-< / . |/ ._> | | |<_> |/ . |/ . \\<_-<     [|\n"
    			+ "|]       |_|  |_|  |_||_|_|\\_|_.|_||  _/<___||_|/__/ |___/<___||_|_|\\_|_.\\___//__/ \\___|\\___. |___/<___|\\___|\\___//__/     [|\n"
    			+ "|]                                 |_|                                                                                     [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   SQL - SERVER                                                                                                [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   MYSQL                                                                                                       [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   POSTGRESQL                                                                                                  [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   MONGODB                                                                                                     [|\n"
    			+ "|]       \\/                                                                                                                [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]      _/\\_                                                                                                               [|\n"
    			+ "|]      >  <   NOSQL                                                                                                       [|\n"
    			+ "|]       \\/                                                                                                                [| \n"
    			+ "|]                                                                                                                         [|\n"
    			+ "|]                                                                                                                         [|\n"
    			+ " \\\\=======================================================================================================================//");

        menuzinho();
    }

    public void menuzinho() throws InterruptedException {

        Scanner entrada = new Scanner(System.in);

        TryMenu menu = new TryMenu();

        /*
        System.out.println();
        System.out.print(" ° 1- Voltar ao menu | ");
        System.out.print(" ° 0- Sair  \n");
        */
        System.out.println("\n");
        Thread.sleep(750);
        System.out.println(" //=========================================================================================================\\\\\n"
        		+ "|]                                                                                                           [|\n"
        		+ "|]                                                                                                           [|\n"
        		+ "|]                                          ___  _       _    _                                              [|\n"
        		+ "|]                                         | . \\<_> ___ <_> _| |_ ___                                        [|\n"
        		+ "|]                                         | | || |/ . || |  | | / ._>                                       [|\n"
        		+ "|]                                         |___/|_|\\_. ||_|  |_| \\___.                                       [|\n"
        		+ "|]                                                 <___'                                                     [|\n"
        		+ "|]                                          ___                    _                                         [|\n"
        		+ "|]                                         |   |                  / |                                        [|\n"
        		+ "|]                                         | / |                  | |                                        [|\n"
        		+ "|]                                         `___'                  |_|                                        [|\n"
        		+ "|]                                                                                                           [|\n"
        		+ "|]                                          Sair             Voltar ao menu                                  [|\n"
        		+ "|]                                                                                                           [|\n"
        		+ "|]                                                                                                           [|\n"
        		+ " \\\\==========================================================================================================//");
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
