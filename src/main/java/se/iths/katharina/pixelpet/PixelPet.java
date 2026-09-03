package se.iths.katharina.pixelpet;

import java.util.Scanner;

public class PixelPet {
    static void main() {

        String BOLD = "\u001B[1m";
        String RESET = "\u001B[0m";
        String BLUE = "\u001B[34m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";


        System.out.println(BOLD + BLUE + "+----------------+");
        System.out.println("|     PIXELPET   |");
        System.out.println("|      /\\_/\\     |");
        System.out.println("|     ( o.o )    |");
        System.out.println("|      > ^ <     |");
        System.out.println("+----------------+" + RESET);

        String petName;
        int fullness = 50;
        int energy = 50;
        int happiness = 50;
        int choice = 0;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Vad ska din PixelPet heta?");
        petName = userInput.nextLine();
        System.out.println("Du kan alltid ändra namnet senare.");
        System.out.println();
        System.out.println("Vilket PixelPet väljer du: ");
        showPetChoices();
        int animal = userInput.nextInt();
        System.out.println();


        System.out.println(GREEN + BOLD + "Vad vill du göra?" + RESET);


        while (choice != 5) {
            showMenu(petName);
            choice = userInput.nextInt();

            switch (choice) {
                case 1:
                    fullness = feedPet(petName, fullness);
                    break;

                case 2:
                    happiness = playWithPet(petName, happiness);
                    break;

                case 3:
                    energy = sleepPet(petName, energy);
                    break;

                case 4:
                    showStatus(petName, fullness, energy, happiness);
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

    private static void showMenu(String petName) {

        String BOLD = "\u001B[1m";
        String RESET = "\u001B[0m";
        String BLUE = "\u001B[34m";
        String RED = "\u001B[31m";

        System.out.println(BOLD + "1: Mata " + petName + " .");
        System.out.println("2: Lek med " + petName + ".");
        System.out.println("3: Låt " + petName + " sova.");
        System.out.println("4: Kolla hur " + petName + " mår.");
        System.out.println(BOLD + RED + "5: Avsluta PixelPet." + RESET);

    }

    private static void showPetChoices() {

        System.out.println("1. Katt          2. Kanin         3. Uggla");
        System.out.println(" /\\_/\\           (\\_/)             ,_,");
        System.out.println("( o.o )          (o.o)            (O,O)");
        System.out.println(" > ^ <           /|_|\\            (   )");
        System.out.println("                                   \"-\"");
        System.out.println();

        System.out.println("4. Pingvin       5. Gris          6. Groda");
        System.out.println("   _~_            ^---^            @..@");
        System.out.println("  (o o)          ( o o )          (----)");
        System.out.println("  / V \\          (  ^  )         ( >__< )");
        System.out.println(" /(   )\\          \\___/");
        System.out.println("  ^^ ^^");

    }

    private static int feedPet(String petName, int fullness) {
        System.out.println(petName + "s mättnad just nu: " + fullness);
        System.out.println();
        System.out.println(petName + " matas nu med sin favoritmat.");
        System.out.println();
        fullness = fullness + 20;
        System.out.println(petName + "s nya mättnad är: " + fullness);
        System.out.println();
        return fullness;
    }

    private static int playWithPet(String petName, int happiness) {
        System.out.println(petName + "s lycka just nu: " + happiness);
        System.out.println("Du och " + petName + "spelar med bollen.");
        System.out.println();
        happiness = happiness + 10;
        System.out.println(petName + "s nya lycka är: " + happiness);
        System.out.println();
        return happiness;
    }

    private static int sleepPet(String petName, int energy) {
        System.out.println(petName + "s energi just nu: " + energy);
        System.out.println(petName + " ligger i sin säng och somnar.");
        System.out.println();
        energy = energy + 20;
        System.out.println(petName + "s energi är nu: " + energy);
        System.out.println();
        return energy;
    }

    private static void showStatus(String petName, int fullness, int energy, int happiness) {
        System.out.println("Så mår " + petName + ": ");
        System.out.println();
        System.out.println(petName + " Mättnad: " + fullness);
        System.out.println();
        System.out.println(petName + " Lycka: " + happiness);
        System.out.println();
        System.out.println(petName + " Energi: " + energy);
        System.out.println();
    }

}
