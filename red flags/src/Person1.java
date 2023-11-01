import java.util.Scanner;

public class Person1 {
    private Person user;  // Assuming Person class is defined elsewhere
    private final int age = 17;
    private String eyecolor = "blue";
    private String dateName = "Charizztopher";
    private String nickname = dateName.substring(3, 7);
    private int money = 30;
    private double cost;
    private double groceries;
    private int redFlags;

    public void chariz() {
        // Assuming Person class is defined elsewhere

        askInfo();
        date();
    }



    public void date() {
        System.out.println("Nice to meet you, " + user.getName() + ". My name is Charriztopher, but people call me " + nickname + "! Do you want to go on a picnic date(1) or an amusement park date(2)?");
        redFlags++;
        Scanner date = new Scanner(System.in);
        String whichDate = date.nextLine();
        if (whichDate.equals("1")) {
            System.out.println("Let's go to the grocery store then! I only have " + money + " dollars though, so you can pay the rest of what I can't lol. \nDo you want Arizona?");
            redFlags++;
            String ari = date.nextLine();
            if (ari.equals("yes")) {
                System.out.print("Okay, I'll get 2 for me and 1 for you.");
                groceries++;
                groceries += 2;
            } else {
                System.out.println("Okay. I'll get 2 for myself then.");
                groceries += 2;
            }
            System.out.println("Ok. I want Lunchables, which is only 10 dollars! What a steal! \n\nI want some chocolates, but it's 50 dollars omg. \nYou wouldn't mind paying, right? Lol, why am I even asking? Of course, you wouldn't mind.");
            redFlags += 2;
            groceries += 10 + 50;
            System.out.println("Do we need any more food?");
            String needs = date.nextLine();
            if (needs.equals("no")) {
                System.out.println("Ok fire! Let's go pay now!");
            } else {
                System.out.println("What other food do we need?");
                date.nextLine();
                System.out.println("Are you really going to eat all that? \nYeah, we are not getting that. Let's go pay now.");
                redFlags++;
            }
            groceries *= 1.18;
            System.out.println("The total is " + groceries + ". Thanks for paying for us babe! \nI had a feeling you were a generous person when I met you!");
            redFlags += 3;
            System.out.println("*You and Rizz arrive at the park and sit down at your pre-prepared picnic setting*");
            System.out.println("Soooo..... I weigh 250 lb. How much do you weigh?");

            int weight = date.nextInt();
            if (weight > 127) {
                System.out.println("oh.");
            }
        } else if (whichDate.equals("2")) {
            // Code for amusement park date
        }
    }
}
