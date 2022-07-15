package SobreNos;

import Menu.TryMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sobre {

    Scanner leia = new Scanner(System.in);

    String nome;
    String quemSomos01 = "Por trás da tela, nós somos estudantes da instituição de educação para o emprego Generation Brazil que visam e desejam";
    String quemSomos02 = "mergulhar nesse magnífico mundo da tecnologia e programação, com vastas e inúmeras possibilidades e oportunidades!";
    String oqueSomos01 = "Somos uma equipe que desenvolveu o BOT Easy Code, criado para auxiliar a inserção das pessoas dentro do mercado ";
    String oqueSomos02 = "da tecnologia, focado em expandir a diversidade e inclusão de todes nesse fantástico mundo da programação. ";
    String propostas01 = "\nNossas propostas são:";
    String propostas02 = "1° Derrubar a barreira inicial, apresentando os conceitos da área de forma simples. ";
    String propostas03 = "2° Aumentar a diversidade na área da tecnologia, mostrando que ela é para todes.";
    String propostas04 = "3° Acessibilidade através de direcionamento em diversas plataformas de estudos.";

    int menu, sobreNos, apos = 0;


    public void sobreNos() throws InterruptedException {


        do {
            Thread.sleep(750);
            System.out.println("Agora, digite um número para acessar um dos tópicos de Sobre Nós: \n ° 1 - O que somos | ° 2 - Quem somos | ° 3 - Propostas | ° 4 - Voltar ao Menu");
            sobreNos = leia.nextInt();


            if (sobreNos == 1) {
                Thread.sleep(750);
                System.out.println(oqueSomos01 + "\n" + oqueSomos02);
                System.out.println("\nAgora, o que deseja fazer? \n° 1 - Voltar ao Sobre Nós | ° 2 - Encerrar o sistema ");
                apos = leia.nextInt();


            } else if (apos == 2) {
                break;
            }


            if (sobreNos == 2) {
                Thread.sleep(750);
                System.out.println(quemSomos01 + "\n" + quemSomos02);
                System.out.println("\nAgora, o que deseja fazer? \n° 1 - Voltar ao Sobre Nós | ° 2 - Encerrar o sistema ");
                apos = leia.nextInt();


            } else if (apos == 2) {
                break;
            }

            if (sobreNos == 3) {
                Thread.sleep(750);
                System.out.println(propostas01 + "\n" + propostas02 + "\n" + propostas03 + "\n" + propostas04);
                System.out.println("\nAgora, o que deseja fazer? \n° 1 - Voltar ao Sobre Nós | ° 2 - Encerrar o sistema ");
                apos = leia.nextInt();


            } else if (apos == 2) {
                break;
            }

            if (sobreNos == 4) {
                break;
            }

        } while (apos == 1);
    }
}


