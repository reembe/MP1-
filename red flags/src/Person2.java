import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Person2 {
    private Person user;  // Assuming Person class is defined elsewhere
    private final int age = 17;
    private String eyecolor = "brown";
    private String dateName = "Bartholemew";
    private String nickname = dateName.substring(0, 4);
    private int money = Integer.MAX_VALUE;
    private double cost;
    private double groceries;
    private int greenFlags;

    public void chariz() {
        // Assuming Person class is defined elsewhere
        Person bartholemew = new Person("Bartholemew", 17, Integer.MIN_VALUE, "Brown");
        askInfo();
        date();
    }


    public void askInfo() {
        System.out.println("Hello! What is your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Hello " + name + ". How old are you?");
        int userAge = s.nextInt();  // Use a different variable for user age
        System.out.println("On a scale of 1-10, how charismatic are you?");
        int rizz = s.nextInt();
        if (rizz >= 10) {
            System.out.println("I totally see that *smirk*");
        } else {
            System.out.println("No, definitely higher, you're stunning!");
        }
        System.out.println("Ok now, what color are your eyes?");
        s = new Scanner(System.in);
        String eyes = s.nextLine();
        System.out.println("Such a beautiful color, mine are " + eyecolor);
        user = new Person(name, userAge, rizz, eyes);
    }

    public void date() {
        Pause p = new Pause();
        p.pauseTime(2000);
        System.out.println("\n Nice to meet you, " + user.getName() + ". My name is Bartholemew, but people call me " + nickname + "! Do you want to go on a museum date (1) or a restaurant date (2)?");
//        Pause p = new Pause();
//        p.pauseTime(10000);
        greenFlags++;
        Scanner date = new Scanner(System.in);
        String whichDate = date.nextLine();
        if (whichDate.equals("1")) {
            System.out.println("Wonderful, the museum is a great choice. And don't worry about the fees; enjoy your time. \nWould you like to get some food before we go?");
            greenFlags++;
            String food = date.nextLine();
            if (food.equals("sure") || food.equals("yes")) {
                System.out.print("Alright, I'll get us 2 sandwiches and 2 drinks");
                groceries += 4;
            } else {
                System.out.println("Okay. I'll get something for myself; I'm a bit famished.");
                groceries += 2;
            }
            System.out.println("Ok. I want a chicken parmesan wrap. $17, pretty cheap huh! \nAnd done!");
            System.out.println("*Suddenly you hear the thunk of metal hit the floor, startling you*");
            System.out.println("Oh my gosh, I'm so sorry, my American Express unlimited spending bank card can be quiet loud");
            greenFlags += 3;
            groceries += 17;
            System.out.println("Are you ready?");
            String ready = date.nextLine();
            if (ready.equals("yes")) {
                System.out.println("Great, let's head out.");
            } else {
                date.nextLine();
                System.out.println("I'll wait, take your time.");
                greenFlags++;
            }
            groceries = Math.round(groceries * 10.0) / 10.0;
            System.out.println("\n The total is " + groceries + ". That's much less than I expected.");
            greenFlags += 2;
            System.out.println("*You and Bart have arrived at the museum, and he pays for both of your entrance fees*");
            System.out.println("So...do you have any favorite art piece you'd like to see?");

        } else if (whichDate.equals("2")) {
            System.out.println("A restaurant date it is! I've heard there's a lovely Italian restaurant nearby. Would you like to go there?");
            String restaurantChoice = date.nextLine();
            if (restaurantChoice.equals("yes")) {
                System.out.println("Excellent choice! Let's head to the Italian restaurant.");
                System.out.println("*You walk there and once seated, Bart starts a conversation about your favorite Italian dishes.*");
                System.out.println("*Throughout the meal, Bart continues to be charming and engaging, making the date enjoyable.*");
                System.out.println("*After a delightful dinner, Bart insists on covering the bill.*");
                System.out.println("It was a pleasure spending this evening with you. Can I see you again?");
                String response = date.nextLine();
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Bart smiles warmly and suggests another date to the aquarium. The evening ends and he sends you home in an Uber lux with a bouquet of fresh flowers.");
                } else {
                    System.out.println("I understand. It was lovely meeting you. Take care.");
                    System.out.println("Bart smiles warmly and sends you home in an Uber lux.");

                }
            } else {
                System.out.println("No worries! We can choose another restaurant or activity. We can decide that next time we meet. Have a great night beautiful.");
            }
        }
    }
}
