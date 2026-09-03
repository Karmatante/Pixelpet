package se.iths.katharina.pixelpet;

import java.util.Scanner;

public class Console {
    static void main() {

        String BOLD = "\u001B[1m";
        String RESET = "\u001B[0m";
        String BLUE = "\u001B[34m";
        String RED = "\u001B[31m";


        System.out.println(BOLD + BLUE + "+----------------+");
        System.out.println("|     PIXELPET   |");
        System.out.println("|      /\\_/\\     |");
        System.out.println("|     ( o.o )    |");
        System.out.println("|      > ^ <     |");
        System.out.println("+----------------+" + RESET);

        String petName;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Vad ska din PixelPet heta?");
        petName = userInput.nextLine();
        System.out.println("Du kan alltid ändra namnet senare.");
        System.out.println();

        System.out.println("Vad vill du göra?");
        int choice = 0;

        while (choice != 5) {
            System.out.println(BOLD + "\n--- HUVUDMENY ---" + RESET);
            System.out.println("1: Mata " + petName + " .");
            System.out.println("2: Lek med " + petName + ".");
            System.out.println("3: Låt " + petName + " sova.");
            System.out.println("4: Koll hur " + petName + " mår.");
            System.out.println(RED + "5: Avsluta PixelPet." + RESET);
            System.out.print("\nDitt val: ");
            choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Mata " + petName + ".");
                    break;

                case 2:
                    System.out.println("Lek med " + petName + ".");
                    break;

                case 3:
                    System.out.println("Låt " + petName + " sova.");
                    break;

                case 4:
                    System.out.println("Kolla hur " + petName + " mår.");
                    break;

                case 5:
                    System.out.println("Avsluta PixelPet");
                    break;

                default:
                    System.out.println("Inget giltigt val. Försök igen.");
                    break;

            }
        }
    }
}
