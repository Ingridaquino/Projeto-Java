package SobreNos;

import Menu.TryMenu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sobre {

    Scanner leia = new Scanner(System.in);

    String nome;
    /*String quemSomos01 = "Por trás da tela, nós somos estudantes da instituição de educação para o emprego Generation Brazil que visam e desejam";
    String quemSomos02 = "mergulhar nesse magnífico mundo da tecnologia e programação, com vastas e inúmeras possibilidades e oportunidades!";
    String oqueSomos01 = "Somos uma equipe que desenvolveu o BOT Easy Code, criado para auxiliar a inserção das pessoas dentro do mercado ";
    String oqueSomos02 = "da tecnologia, focado em expandir a diversidade e inclusão de todes nesse fantástico mundo da programação. ";
    String propostas01 = "\nNossas propostas são:";
    String propostas02 = "1° Derrubar a barreira inicial, apresentando os conceitos da área de forma simples. ";
    String propostas03 = "2° Aumentar a diversidade na área da tecnologia, mostrando que ela é para todes.";
    String propostas04 = "3° Acessibilidade através de direcionamento em diversas plataformas de estudos.";
	*/
    int menu, sobreNos, apos = 0;


    public void sobreNos() throws InterruptedException {


        do {
        	System.out.println("\n");
            Thread.sleep(750);
            System.out.println(" //================================================================================================\\\\\n"
            		+ "|]                ___________                                                                      [|\n"
            		+ "|]      ____     /           |                                            ________                 [|\n"
            		+ "|]     /  __\\   /  VAMOS LA  |                                           |         \\   ____        [|\n"
            		+ "|]     \\( oo    \\  ESCOLHA!  |                                           | Escolha  \\ (___ \\       [|\n"
            		+ "|]     _\\_o/     \\___________|                                           |e veja!   /  oo~)/       [|\n"
            		+ "|]    / \\|/ \\                                                            | ________/  _\\O_/_       [|\n"
            		+ "|]   / / __\\ \\___                                                                    / \\|/  \\      [|\n"
            		+ "|]   \\ \\|   |__/_)                                                                  / / .- \\ \\     [|\n"
            		+ "|]    \\/_)  |                                                                       \\ \\ .  /_/     [|\n"
            		+ "|]     ||___|                                                                        \\/___(_/      [|\n"
            		+ "|]     | | |                                                                          | |  |       |]\n"
            		+ "|]     | | |                                                                          | |  |       [|\n"
            		+ "|]     |_|_|                                                                          |_|__|       [|\n"
            		+ "|]     [__)_)                                                                        (_(___]       [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ "|]                            _           ___           ____           __                          [|\n"
            		+ "|]                           / |         <_  >         <__ /          /. |                         [|\n"
            		+ "|]                           | |          / /           <_ \\         /_  .|                        [|\n"
            		+ "|]                           |_|         <___>         <___/           |_|                         [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ "|]                       Oque somos   Quem somos    Propostas    Voltar ao Menu                    [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ "|]                                                                                                 [|\n"
            		+ " \\\\================================================================================================//");
            sobreNos = leia.nextInt();


            if (sobreNos == 1) {
            	System.out.println("\n");
                Thread.sleep(750);
                //System.out.println(oqueSomos01 + "\n" + oqueSomos02);
                System.out.println("//===========================================================================================================\\\\\n"
                		+ "|]                           ___                                                                              [|\n"
                		+ "|]                          | . |  ___  _ _  ___   ___ ___ ._ _ _  ___  ___                                   [|\n"
                		+ "|]                          | | | / . || | |/ ._> <_-</ . \\| ' ' |/ . \\<_-<                                   [|\n"
                		+ "|]                          `___' \\_  |`___|\\___. /__/\\___/|_|_|_|\\___//__/                                   [|\n"
                		+ "|]                                  |_|                                                                       [|\n"
                		+ "|]                                                                                                            [|\n"
                		+ "|]  Somos uma equipe que desenvolveu o BOT Easy Code, criado para auxiliar a inserção das pessoas dentro      [|\n"
                		+ "|]  do mercado da tecnologia, focado em expandir a diversidade e inclusão de todes nesse fantástico mundo     [|\n"
                		+ "|]  da programação.                                                                                           [|\n"
                		+ "|]                                                                                                            [|\n"
                		+ " \\\\===========================================================================================================//");
                System.out.println("\n");
                Thread.sleep(750);
                System.out.println(" //====================================================================================================\\\\\n"
                		+ "|]               ___                    _                _        ___                                   [|\n"
                		+ "|]              | . | ___  _ _  ___   _| | ___  ___ ___ <_> ___  | | '___ .___ ___  _ _                 [|\n"
                		+ "|]              | | |/ . || | |/ ._> / . |/ ._><_-</ ._>| |<_> | | |-<_> | / // ._>| '_>                [|\n"
                		+ "|]              `___'\\_  |`___|\\___. \\___|\\___./__/\\___.|_|<___| |_| <___|/___\\___.|_|                  [|\n"
                		+ "|]                     |_|                                                                              [|\n"
                		+ "|]                                                            ___                                       [|\n"
                		+ "|]                                  ___  ___  ___  _ _  ___  <_. >                                      [|\n"
                		+ "|]                                 <_> |/ . |/ . \\| '_><_> |  /_/                                       [|\n"
                		+ "|]                                 <___|\\_. |\\___/|_|  <___|  <_>                                       [|\n"
                		+ "|]                                      <___'                                                           [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ "|]                                  _                       ___                                         [|\n"
                		+ "|]                                 / |                     <_  >                                        [|\n"
                		+ "|]                                 | |                      / /                                         [|\n"
                		+ "|]                                 |_|                     <___>                                        [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ "|]                         Voltar ao Sobre Nós       Voltar ao Menu                                     [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ " \\\\====================================================================================================//");
                apos = leia.nextInt();


            } else if (apos == 2) {
                break;
            }


            if (sobreNos == 2) {
            	System.out.println("\n");
                Thread.sleep(750);
                //System.out.println(quemSomos01 + "\n" + quemSomos02);
                System.out.println(" //===========================================================================================================\\\\\n"
                		+ "|]                            ___                                                                             [|\n"
                		+ "|]                           | . | _ _  ___ ._ _ _   ___ ___ ._ _ _  ___  ___                                 [|\n"
                		+ "|]                           | | || | |/ ._>| ' ' | <_-</ . \\| ' ' |/ . \\<_-<                                 [|\n"
                		+ "|]                           `___\\`___|\\___.|_|_|_| /__/\\___/|_|_|_|\\___//__/                                 [|\n"
                		+ "|]                                                                                                            [|\n"
                		+ "|] Por trás da tela, nós somos estudantes da instituição de educação para o emprego Generation Brazil         [|\n"
                		+ "|] que visam e desejam mergulhar nesse magnífico mundo da tecnologia e programação, com vastas e inúmeras     [|\n"
                		+ "|] possibilidades e oportunidades!.                                                                           [|\n"
                		+ "|]                                                                                                            [|\n"
                		+ " \\\\===========================================================================================================//");
                System.out.println("\n");
                Thread.sleep(750);
                System.out.println(" //====================================================================================================\\\\\n"
                		+ "|]               ___                    _                _        ___                                   [|\n"
                		+ "|]              | . | ___  _ _  ___   _| | ___  ___ ___ <_> ___  | | '___ .___ ___  _ _                 [|\n"
                		+ "|]              | | |/ . || | |/ ._> / . |/ ._><_-</ ._>| |<_> | | |-<_> | / // ._>| '_>                [|\n"
                		+ "|]              `___'\\_  |`___|\\___. \\___|\\___./__/\\___.|_|<___| |_| <___|/___\\___.|_|                  [|\n"
                		+ "|]                     |_|                                                                              [|\n"
                		+ "|]                                                            ___                                       [|\n"
                		+ "|]                                  ___  ___  ___  _ _  ___  <_. >                                      [|\n"
                		+ "|]                                 <_> |/ . |/ . \\| '_><_> |  /_/                                       [|\n"
                		+ "|]                                 <___|\\_. |\\___/|_|  <___|  <_>                                       [|\n"
                		+ "|]                                      <___'                                                           [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ "|]                                  _                       ___                                         [|\n"
                		+ "|]                                 / |                     <_  >                                        [|\n"
                		+ "|]                                 | |                      / /                                         [|\n"
                		+ "|]                                 |_|                     <___>                                        [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ "|]                         Voltar ao Sobre Nós       Voltar ao Menu                                     [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ " \\\\====================================================================================================//");
                apos = leia.nextInt();


            } else if (apos == 2) {
                break;
            }

            if (sobreNos == 3) {
            	System.out.println("\n");
                Thread.sleep(750);
                System.out.println("//=========================================================================================================\\\\\n"
                		+ "|]                      _ _                     ___                            _                            [|\n"
                		+ "|]                     | \\ | ___  ___ ___ ___  | . \\ _ _  ___  ___  ___  ___ _| |_ ___                      [|\n"
                		+ "|]                     |   |/ . \\<_-<<_-<<_> | |  _/| '_>/ . \\| . \\/ . \\<_-<  | | <_> |                     [|\n"
                		+ "|]                     |_\\_|\\___//__//__/<___| |_|  |_|  \\___/|  _/\\___//__/  |_| <___|                     [|\n"
                		+ "|]                                                            |_|                                           [|\n"
                		+ "|]                                                                                                          [|\n"
                		+ "|]  1° Derrubar a barreira inicial, apresentando os conceitos da área de forma simples.                     [|\n"
                		+ "|]  2° Aumentar a diversidade na área da tecnologia, mostrando que ela é para todes.                        [|\n"
                		+ "|]  3° Acessibilidade através de direcionamento em diversas plataformas de estudos.                         [|\n"
                		+ "|]                                                                                                          [|\n"
                		+ " \\\\========================================================================================================//");
                //System.out.println(propostas01 + "\n" + propostas02 + "\n" + propostas03 + "\n" + propostas04);
                System.out.println("\n");
                Thread.sleep(750);
                System.out.println(" //====================================================================================================\\\\\n"
                		+ "|]               ___                    _                _        ___                                   [|\n"
                		+ "|]              | . | ___  _ _  ___   _| | ___  ___ ___ <_> ___  | | '___ .___ ___  _ _                 [|\n"
                		+ "|]              | | |/ . || | |/ ._> / . |/ ._><_-</ ._>| |<_> | | |-<_> | / // ._>| '_>                [|\n"
                		+ "|]              `___'\\_  |`___|\\___. \\___|\\___./__/\\___.|_|<___| |_| <___|/___\\___.|_|                  [|\n"
                		+ "|]                     |_|                                                                              [|\n"
                		+ "|]                                                            ___                                       [|\n"
                		+ "|]                                  ___  ___  ___  _ _  ___  <_. >                                      [|\n"
                		+ "|]                                 <_> |/ . |/ . \\| '_><_> |  /_/                                       [|\n"
                		+ "|]                                 <___|\\_. |\\___/|_|  <___|  <_>                                       [|\n"
                		+ "|]                                      <___'                                                           [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ "|]                                  _                       ___                                         [|\n"
                		+ "|]                                 / |                     <_  >                                        [|\n"
                		+ "|]                                 | |                      / /                                         [|\n"
                		+ "|]                                 |_|                     <___>                                        [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ "|]                         Voltar ao Sobre Nós       Voltar ao Menu                                     [|\n"
                		+ "|]                                                                                                      [|\n"
                		+ " \\\\====================================================================================================//");
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


