package Menu;


import SobreNos.Sobre;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws InterruptedException {

        Scanner leia = new Scanner(System.in);

        String nome;
        String quemSomos01 = "Por trás da tela, nós somos estudantes da instituição de educação para o emprego Generation Brazil que visam e desejam";
        String quemSomos02 = "mergulhar nesse magnífico mundo da tecnologia e programação, com vastas e inúmeras possibilidades e oportunidades!";
        String oqueSomos01 = "Somos uma equipe que desenvolveu o BOT Easy Code, criado para auxiliar a inserção das pessoas dentro do mercado ";
        String oqueSomos02 = "da tecnologia, focado em expandir a diversidade e inclusão de todes nesse fantástico mundo da programação. ";
        String propostas01 = "Nossas propostas são:";
        String propostas02 = "1° Derrubar a barreira inicial, apresentando os conceitos da área de forma simples. ";
        String propostas03 = "2° Aumentar a diversidade na área da tecnologia, mostrando que ela é para todes.";
        String propostas04 = "3° Acessibilidade através de direcionamento em diversas plataformas de estudos.";

        int menu, sobreNos, apos = 0;

        Menu();

        leia.close();
    }

    public static void Menu() throws InterruptedException {

        Scanner leia = new Scanner(System.in);

        int menu;
        int sobreNos;

        String nome;


        System.out.println("Boas vindas, alune! Sou o BOT da Easy Code.\n");
        Thread.sleep(1500);
        System.out.print("Como você se chama..? ");
        nome = leia.nextLine();

        Thread.sleep(1500);
        System.out.println("\nUau, que lindo nome!");
        Thread.sleep(1000);
        System.out.print("\nÉ um prazer conhecê-lo, " + nome + "... ");
        Thread.sleep(1000);
        System.out.println("Irei lhe apresentar o nosso menu: ");

        MenuCondicao();

    }

    public static void MenuCondicao() {

        Scanner leia = new Scanner(System.in);

        int apos = 0;
        int menu;

        Sobre sobre = new Sobre();
        TryMenu estudoMenu = new TryMenu();


        try {

            do {
                Thread.sleep(1500);
                System.out.println("\nDigite um número para acessar os seguintes tópicos: \n° 1 - Sobre nós | ° 2 - O que estudar | ° 3 - Encerrar o sistema ");
                menu = leia.nextInt();

                if (menu == 1) {

                    sobre.sobreNos();

                    if (apos == 3) {
                        Thread.sleep(750);
                        System.out.println("\nEncerrando o sistema...");
                        break;
                    }


                } else if (menu == 2) {
                    //  oque estudar
                    estudoMenu.listMenu();


                } else if (menu == 3) {
                    Thread.sleep(750);
                    System.out.println("\nEncerrando o sistema...");
                    break;
                } else {
                    continue;
                }
            } while (menu >= 0);

        } catch (InterruptedException e) {
            System.out.println("\nPor favor, digite um número valido!");
        }

    }
}

