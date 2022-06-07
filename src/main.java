//Ceci importe la classe Scanner du package java.util
import animal.*;
import employe.Employe;
import enclos.*;
import zoo.Zoo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println('\n');
        System.out.println("############# MENU ###############");
        System.out.println("1 - Démarrer la simulation 1");
        System.out.println("2 - Démarrer la simulation 2");
        System.out.println("3 - Démarrer la simulation 3");
        System.out.println("4 - Démarrer la simulation 4");
        System.out.println("5 - Démarrer la simulation 5");
        System.out.println("Q - Quitter le terminal");
        System.out.println("##################################");
        String value = sc.nextLine();

        while(value != "q") {
            switch (value) {
                case "1":
                    launchSimulation1(); //lance la simulation 1
                    System.out.println("Vous avez lancé la simulation 1");
                    break;
                case "2":
                    launchSimulation2(); //lance la simulation 2
                    System.out.println("Vous avez lancé la simulation 2");
                    break;
                case "3":
                    launchSimulation3(); //lance la simulation 3
                    System.out.println("Vous avez lancé la simulation 3");
                    break;
                case "4":
                    launchSimulation4(); //lance la simulation 4
                    System.out.println("Vous avez lancé la simulation 4");
                    break;
                case "5":
                    launchSimulation5(); //lance la simulation 5
                    System.out.println("Vous avez lancé la simulation 5");
                    break;
                case "Q":
                case "q":
                    System.out.println("Merci vous allez quitter le terminal");
                    System.exit(0);
                    break;
                default:
                    System.out.println("le caractère tapé n'existe pas dans le menu");
                    break;
            }

            System.out.println('\n');
            System.out.println("############# MENU ###############");
            System.out.println("1 - Démarrer la simulation 1");
            System.out.println("2 - Démarrer la simulation 2");
            System.out.println("3 - Démarrer la simulation 3");
            System.out.println("4 - Démarrer la simulation 4");
            System.out.println("5 - Démarrer la simulation 5");
            System.out.println("Q - Quitter le terminal");
            System.out.println("##################################");

            value = sc.nextLine();
        }

    }
}

