import java.util.Scanner;

public class Game {
    Person user;
    Person charizzztopher = new Person("Charizztopher", 17, Integer.MIN_VALUE, "Blue");
    Person barth

    String RESETTER = "\u001B[0m";


    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String BLUE = "\u001B[34m";
    String CYAN = "\u001B[36m";
    String MAGENTA = "\u001B[35m";
    String WHITE = "\u001B[37m";
    String BLACK = "\u001B[30m";


    String RED_B = "\u001B[41m";
    String GREEN_B = "\u001B[42m";
    String YELLOW_B = "\u001B[43m";
    String BLUE_B = "\u001B[44m";
    String CYAN_B = "\u001B[46m";
    final String MAGENTA_B = "\u001B[45m";
    String WHITE_B = "\u001B[47m";
    String BLACK_B = "\u001B[40m";


    public Game()
    {
        askInfo();
        selectCharacter();
    }
    public void selectCharacter()
    {
        Scanner s = new Scanner(System.in);
        System.out.println(MAGENTA_B + BLACK + "Please Select Your Character: \n 1) Person 1 \n 2) Person 2 \n 3) Person 3 \n(enter the corresponding number)" + RESETTER);
            int choice = s.nextInt();
            if (choice == 1) {
                System.out.print("1");
                menuOption = true;
                personOne = true;
            } else if (choice == 2) {
                System.out.print("2");
                menuOption = true;
                personTwo = true;
            } else if (choice == 3) {
                System.out.print("3");
                menuOption = true;
                personThree = true;
            } else {
                clearScreen();
                System.out.println(" ");
                System.out.println("Please enter a valid menu option!");
                System.out.println(" ");
            }
        }
    }
    public void askInfo() {
        System.out.println("Hello! What is your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello " + name + ". How old are you?");
        int userAge = s.nextInt();
        System.out.println("On a scale of 1-10, how charismatic are you?");
        int rizz = s.nextInt();
        if (rizz >= 10) {
            System.out.println("Finally, someone worth my time!");
        }
        System.out.println("Ok now, what color are your eyes?");
        s = new Scanner(System.in);
        String eyes = s.nextLine();
        user = new Person(name, userAge, rizz, eyes);
    }
}
