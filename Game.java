import java.util.Scanner;
import java.util.InputMismatchException;

public class Game {

    public int menuTry()
    {
        final String RESETTER = "\u001B[0m";
        final String RED = "\u001B[31m";
        Clear c = new Clear();
        Pause pa = new Pause();
        Scanner s = new Scanner(System.in);
        boolean works = true;
        int choice = 0;
        try
        {
            choice = s.nextInt();
        }
        catch (InputMismatchException e)
        {
            c.clearScreen();
            System.out.println(RED + "Please insert a number only." + RESETTER);
            pa.pauseTime(2000);
            works = false;

        }
        if (works)
        {
            return choice;
        }
        return -1;
    }



    public Game() {

        boolean menuOption = false;
        boolean personOne = false;
        boolean personTwo = false;
        boolean personThree = false;

        Date d = new Date();


        final String RESETTER = "\u001B[0m";

        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String CYAN = "\u001B[36m";
        final String MAGENTA = "\u001B[35m";
        final String WHITE = "\u001B[37m";
        final String BLACK = "\u001B[30m";


        final String RED_B = "\u001B[41m";
        final String GREEN_B = "\u001B[42m";
        final String YELLOW_B = "\u001B[43m";
        final String BLUE_B = "\u001B[44m";
        final String CYAN_B = "\u001B[46m";
        final String MAGENTA_B = "\u001B[45m";
        final String WHITE_B = "\u001B[47m";
        final String BLACK_B = "\u001B[40m";


        Scanner s = new Scanner(System.in);
        Pause pa = new Pause();
        Clear c = new Clear();

        while (!menuOption) {
            System.out.println("Welcome to -");
            System.out.println(RED + "███▀███   █    ██  ███▄    █  ▐██▌");
            System.out.println("▓██ ▒ ██▒ ██  ▓██▒ ██ ▀█   █  ▐██▌");
            System.out.println("▓██ ░▄█ ▒▓██  ▒██░▓██  ▀█ ██▒ ▐██▌");
            System.out.println("▒██▀▀█▄  ▓▓█  ░██░▓██▒  ▐▌██▒ ▓██▒");
            System.out.println("░██▓ ▒██▒▒▒█████▓ ▒██░   ▓██░ ▒▄▄");
            System.out.println("░ ▒▓ ░▒▓░░▒▓▒ ▒ ▒ ░ ▒░   ▒ ▒  ░▀▀▒");
            System.out.println("░▒ ░ ▒░░░▒░ ░ ░ ░ ░░   ░ ▒░ ░  ░");
            System.out.println("░░   ░  ░░░ ░ ░    ░   ░ ░     ░");
            System.out.println(" ░        ░              ░  ░" + RESETTER);
            System.out.println("  ");
            System.out.println("The game where you learn to identify \n" + RED +"red " + RESETTER + "(or " + GREEN + "green" + RESETTER+ ") flags in different people \n(and learn how to run away from them)!");
            System.out.println("  ");


            System.out.println("Please Select Your Storyline:");
            System.out.println(BLUE + " 1) Charizztopher" + RESETTER);
            System.out.println(GREEN + " 2) Bertholomew" + RESETTER);
            System.out.println(MAGENTA + " 3) Gertrude" + RESETTER);
            System.out.println(YELLOW + " 4) Quit Game" + RESETTER);
            System.out.println(CYAN + " 5) ???" + RESETTER);
            System.out.println("(enter the corresponding number)");
            System.out.println("  ");
            int choice = menuTry();


            if (choice == 1) {
                menuOption = true;
                personOne = true;
            } else if (choice == 2) {
                menuOption = true;
                personTwo = true;
            } else if (choice == 3) {
                menuOption = true;
                personThree = true;
            } else if (choice == -1){
                c.clearScreen();
            } else if (choice == 4){
                menuOption = true;
            } else if(choice == 5)
            {
                c.clearScreen();


            System.out.println(MAGENTA +"  ▀█████████▄     ▄████████      ███▄▄▄▄    ▄██████▄   ▄█     █▄     ");  
            System.out.println("   ███    ███   ███    ███      ███▀▀▀██▄ ███    ███ ███     ███   ");   
            System.out.println("   ███    ███   ███    █▀       ███   ███ ███    ███ ███     ███   ");   
            System.out.println("  ▄███▄▄▄██▀   ▄███▄▄▄          ███   ███ ███    ███ ███     ███   ");   
            System.out.println(" ▀▀███▀▀▀██▄  ▀▀███▀▀▀          ███   ███ ███    ███ ███     ███   ");  
            System.out.println("   ███    ██▄   ███    █▄       ███   ███ ███    ███ ███     ███   ");   
            System.out.println("   ███    ███   ███    ███      ███   ███ ███    ███ ███ ▄█▄ ███  ");    
            System.out.println("   ▄█████████▀    ██████████      ▀█   █▀   ▀██████▀   ▀███▀███▀     ███ " + RESETTER);  
            System.out.println("");

            d.fufillingRequirements();

            
                                                                                   
               pa.pauseTime(2000);
                System.out.println(" ");
                c.clearScreen();
            } else {
                c.clearScreen();
                System.out.println(" ");
                System.out.println(RED + "Please enter a valid menu option!" + RESETTER);
                pa.pauseTime(2000);
                System.out.println(" ");
                c.clearScreen();
            }
        }

        c.clearScreen();

        while (personOne)
        {
            d.askInfo();
            d.dwC();

        }
        while (personTwo)
        {
            d.askInfo();
            d.dateWithBartholomew();

        }
        while (personThree)
        {
            d.askInfo();
            d.dwG();

        }


        System.out.println(" ");

        System.out.println(RED + "▄▄▄█████▓ ██░ ██  ▄▄▄      ███▄    █  ██ ▄█▀  ██████      █████▒▒█████   ██▀███      ██▓███   ██▓    ▄▄▄     ▓██   ██▓ ██▓ ███▄    █   ▄████ ");
        System.out.println("▓  ██▒ ▓▒▓██░ ██▒▒████▄    ██ ▀█   █  ██▄█▒ ▒██    ▒    ▓██   ▒▒██▒  ██▒▓██ ▒ ██▒   ▓██░  ██▒▓██▒   ▒████▄    ▒██  ██▒▓██▒ ██ ▀█   █  ██▒ ▀█▒");
        System.out.println("▒ ▓██░ ▒░▒██▀▀██░▒██  ▀█▄ ▓██  ▀█ ██▒▓███▄░ ░ ▓██▄      ▒████ ░▒██░  ██▒▓██ ░▄█ ▒   ▓██░ ██▓▒▒██░   ▒██  ▀█▄   ▒██ ██░▒██▒▓██  ▀█ ██▒▒██░▄▄▄░");
        System.out.println("░ ▓██▓ ░ ░▓█ ░██ ░██▄▄▄▄██▓██▒  ▐▌██▒▓██ █▄   ▒   ██▒   ░▓█▒  ░▒██   ██░▒██▀▀█▄     ▒██▄█▓▒ ▒▒██░   ░██▄▄▄▄██  ░ ▐██▓░░██░▓██▒  ▐▌██▒░▓█  ██▓");
        System.out.println("  ▒██▒ ░ ░▓█▒░██▓ ▓█   ▓██▒██░   ▓██░▒██▒ █▄▒██████▒▒   ░▒█░   ░ ████▓▒░░██▓ ▒██▒   ▒██▒ ░  ░░██████▒▓█   ▓██▒ ░ ██▒▓░░██░▒██░   ▓██░░▒▓███▀▒");
        System.out.println(" ▒  ░░    ▒ ░░▒░▒ ▒▒   ▓▒█░ ▒░   ▒ ▒ ▒ ▒▒ ▓▒▒ ▒▓▒ ▒ ░    ▒ ░   ░ ▒░▒░▒░ ░ ▒▓ ░▒▓░   ▒▓▒░ ░  ░░ ▒░▓  ░▒▒   ▓▒█░  ██▒▒▒ ░▓  ░ ▒░   ▒ ▒  ░▒   ▒ ");
        System.out.println("    ░     ▒ ░▒░ ░  ▒   ▒▒ ░ ░░   ░ ▒░░ ░▒ ▒░░ ░▒  ░ ░    ░       ░ ▒ ▒░   ░▒ ░ ▒░   ░▒ ░     ░ ░ ▒  ░ ▒   ▒▒ ░▓██ ░▒░  ▒ ░░ ░░   ░ ▒░  ░   ░ ");
        System.out.println(" ░       ░  ░░ ░  ░   ▒     ░   ░ ░ ░ ░░ ░ ░  ░  ░      ░ ░   ░ ░ ░ ▒    ░░   ░    ░░         ░ ░    ░   ▒   ▒ ▒ ░░   ▒ ░   ░   ░ ░ ░ ░   ░ ");
        System.out.println("        ░  ░  ░      ░  ░        ░ ░██▀███   █  ░ ██  ███▄    █  ▐██▌    ░                     ░  ░     ░  ░░ ░      ░           ░       ░ ");
        System.out.println("                                   ▓██ ▒ ██▒ ██  ▓██▒ ██ ▀█   █  ▐██▌                                       ░ ░                            ");
        System.out.println("                                   ▓██ ░▄█ ▒▓██  ▒██░▓██  ▀█ ██▒ ▐██▌                                                                      ");
        System.out.println("                                   ▒██▀▀█▄  ▓▓█  ░██░▓██▒  ▐▌██▒ ▓██▒                                                                      ");
        System.out.println("                                   ░██▓ ▒██▒▒▒█████▓ ▒██░   ▓██░ ▒▄▄                                                                       ");
        System.out.println("                                   ░ ▒▓ ░▒▓░░▒▓▒ ▒ ▒ ░ ▒░   ▒ ▒  ░▀▀▒                                                                      ");
        System.out.println("                                    ░▒ ░ ▒░░░▒░ ░ ░ ░ ░░   ░ ▒░ ░  ░                                                                      ");
        System.out.println("                                   ░░   ░  ░░░ ░ ░    ░   ░ ░     ░                                                                      ");
        System.out.println("                                     ░        ░              ░  ░                                                                         "+ RESETTER);

        System.exit(000);


    }
}
