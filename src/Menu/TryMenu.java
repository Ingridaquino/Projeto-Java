package Menu;

import BackEnd.BackEnd;
import BancoDados.BancoDados;
import FrontEnd.FrontEnd;
import SoftSkills.SoftSkills;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryMenu {

    public void TryMenu() {

        FrontEnd front = new FrontEnd();
        BackEnd back = new BackEnd();
        BancoDados dados = new BancoDados();

        SoftSkills soft = new SoftSkills();

        Scanner entrada = new Scanner(System.in);
        int opcao;

        try {
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
                } else if (opcao == 5) {
                    //menu
                } else if (opcao == 0) {
                    break;
                }

            } while (opcao >= 0);

        } catch (InputMismatchException e) {
            System.out.println("Por favor digite de 0 a 4.");
        }
        entrada.close();
    }
}
