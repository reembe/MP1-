import java.util.Scanner;


public class Main {
    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void main(String[] args)
    {

        Game g = new Game();

        boolean menuOption = false;
        boolean personOne = false;
        boolean personTwo = false;
        boolean personThree = false;



        Scanner s = new Scanner(System.in);


        Person1 charizz = new Person1();
        Person2 mew = new Person2();


        System.out.println("Welcome!");
        System.out.println(" ");


        while (!menuOption) {
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


        while (personOne)
        {
            charizz.chariz();
        }
//        while (personTwo)
//        {
//            mew.mew();
//        }
        while (personThree)
        {


        }


        System.out.print("exit");
    }
}


