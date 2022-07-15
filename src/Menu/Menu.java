package Menu;


public class Menu {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {


        TryMenu menu = new TryMenu();


        System.out.println("----- O que estudar para ser um programador ----");
        System.out.println("1- Front-end");
        System.out.println("2- Back-end");
        System.out.println("3- Banco de Dados");
        System.out.println("4- Soft Skill");
        System.out.println("0- sair ");

        menu.TryMenu();

        System.out.println("Sistema finalizado ....");
        
    }
}
