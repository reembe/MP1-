import java.util.Scanner;

public class Main {
   public static void clearScreen()
   {
       System.out.print("\033[H\033[2J");
       System.out.flush();
   }


   public static void main(String[] args)
   {


       boolean menuOption = false;
       boolean personOne = false;
       boolean personTwo = false;
       boolean personThree = false;


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
       String MAGENTA_B = "\u001B[45m";
       String WHITE_B = "\u001B[47m";
       String BLACK_B = "\u001B[40m";


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
       while (personTwo)
       {
           mew.mew();
       }
       while (personThree)
       {


       }


       System.out.print("exit");
   }
}
