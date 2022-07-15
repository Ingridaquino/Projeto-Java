import BackEnd.BackEnd;
import BancoDados.BancoDados;
import FrontEnd.FrontEnd;
import SoftSkills.SoftSkills;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {

        FrontEnd front = new FrontEnd();
        BackEnd back = new BackEnd();
        BancoDados dados = new BancoDados();

        SoftSkills soft = new SoftSkills();

        Scanner entrada = new Scanner(System.in);
        int opcao;


        System.out.println("----- O que estudar para ser um programador ----");
        System.out.println("1- Front-end");
        System.out.println("2- Back-end");
        System.out.println("3- Banco de Dados");
        System.out.println("4- Soft Skill");
        System.out.println("0- sair ");

        System.out.println("Digite: ");
        opcao = entrada.nextInt();


        do {
            if (opcao == 1) {
                front.FrontText();
            } else if (opcao == 2) {
                back.Backtext();
            } else if (opcao == 3) {
                dados.BancoText();
            } else if (opcao == 4) {
                soft.SkillText();
            } else if ( opcao == 5) {
                //menu
            } else if (opcao == 0) {
                break;
            }

        }while (opcao >= 0);

        System.out.println("Sistema finalizado ....");

        entrada.close();
    }
}
