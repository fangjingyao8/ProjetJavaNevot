


//Ceci importe la classe Scanner du package java.util
import java.util.Scanner;


public class main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot : ");
        String value = sc.nextLine();
        System.out.println("Vous avez saisi : " + value);
        switch (value){
            case "test":
                System.out.println("Test");
                break;
            default:
                
        }
    }
}

