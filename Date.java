import java.util.Scanner;

public class Date {

    private Person user;
    private Person date;
    private Person dateChris = new Person("Charizztopher", "Charizz", 17, 0, "Brown", 50, 10.0, 0);
    private Person dGertrude;

    private String RESETTER = "\u001B[0m";

    private String RED = "\u001B[31m";
    private String GREEN = "\u001B[32m";
    private String YELLOW = "\u001B[33m";
    private String BLUE = "\u001B[34m";
    private String CYAN = "\u001B[36m";
    private String MAGENTA = "\u001B[35m";
    private String WHITE = "\u001B[37m";
    private String BLACK = "\u001B[30m";


    private String RED_B = "\u001B[41m";
    private String GREEN_B = "\u001B[42m";
    private String YELLOW_B = "\u001B[43m";
    private String BLUE_B = "\u001B[44m";
    private String CYAN_B = "\u001B[46m";
    final String MAGENTA_B = "\u001B[45m";
    private String WHITE_B = "\u001B[47m";
    private String BLACK_B = "\u001B[40m";

    private Scanner s = new Scanner(System.in);
    int red;
    boolean anotherDate = false;
    boolean guessFlags = false;

    public void printObject()
    {
        System.out.print(dateChris);
    }


    public int rfc() {
        System.out.println("How many red flags have you spotted?");
        int red = s.nextInt();
        return red;
    }


    public void newDate() {
        Clear c = new Clear();
        c.clearScreen();
        Scanner s = new Scanner(System.in);
        System.out.println("Would you like to go on another date?");
        String answer = s.nextLine();
        if (answer.equals("yes")) {
            c.clearScreen();
            anotherDate = true;
            while (anotherDate) {
                Game g = new Game();
                anotherDate = false;
            }
        }
        else{
            c.clearScreen();
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


    public void askInfo() {
        Pause pa = new Pause();
        Clear c = new Clear();
        System.out.println("Welcome!");
        System.out.println("  ");
        System.out.println("Hello! What is your name?");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        c.clearScreen();
        System.out.println("Hello " + name + ". How old are you?");
        int userAge = s.nextInt();
        c.clearScreen();
        System.out.println("On a scale of 1-10, how charismatic are you?");
        int rizz = s.nextInt();
        if (rizz >= 10) {
            System.out.println("Finally, someone worth our time!");
            pa.pauseTime(1500);
            c.clearScreen();
        }
        System.out.println("Ok now, what color are your eyes?");
        String eyes = s.nextLine();
        c.clearScreen();
        System.out.println("How much money do you have?");
        String money1 = s.nextLine();
        int money = Integer.parseInt(money1);
        user = new Person(name, userAge, rizz, eyes, money, 0);
        c.clearScreen();
    }

    public void dateWithBartholomew() {
        System.out.println("\n Nice to meet you, " + user.getName() + ". My name is Bartholemew, but people call me Barty! Do you want to go on a museum date (1) or a restaurant date (2)?");
        Pause pa = new Pause();
        pa.pauseTime(2000);
        date.addGreenFlag(1);
        Scanner s = new Scanner(System.in);
        String whichDate = s.nextLine();
        if (whichDate.equals("1")) {
            System.out.println("Wonderful, the museum is a great choice. And don't worry about the fees, enjoy your time. \nWould you like to get some food before we go?");
            date.addGreenFlag(1);
            String food = s.nextLine();
            int groceries = 0;
            if (food.equals("sure") || food.equals("yes")) {
                System.out.println("Alright, I'll get us 2 sandwiches and 2 drinks");
                groceries += 4;
            } else {
                System.out.println("Okay. I'll get something for myself; I'm a bit famished.");
                groceries += 2;
            }
            System.out.println("Ok. I want a chicken parmesan wrap. $17, pretty cheap huh! \nAnd done!");
            System.out.println("*Suddenly you hear the thunk of metal hit the floor, startling you*");
            System.out.println("Oh my gosh, I'm so sorry, my American Express unlimited spending bank card can be quite loud.");
            date.addGreenFlag(3);
            groceries += 17;
            System.out.println("Are you ready?");
            String ready = s.nextLine();
            if (ready.equals("yes")) {
                System.out.println("Great, let's head out.");
            } else {
                s.nextLine();
                System.out.println("I'll wait, take your time.");
                date.addGreenFlag(1);
            }
            groceries = (int) (Math.round(groceries * 10) / 10);
            System.out.println("\n The total is " + groceries + ". That's much less than I expected.");
            date.addGreenFlag(2);
            System.out.println("*You and Bart have arrived at the museum, and he pays for both of your entrance fees*");
            System.out.println("So...do you have any favorite art piece you'd like to see?");
            Scanner q = new Scanner(System.in);
            String whichArt = s.nextLine();
            System.out.println("Oh cool, that's such a significant art piece, i'd love to look at it with you. The " + whichArt + ".");
            System.out.println("*You and Bart go to your art piece and as the day goes on, you fall more and more in love with him*");
            System.out.println("*You and Bart finish the night on a high note. \n He gives you a warm hug (WITH CONSENT) and asks you \n \"Can I see you again beautiful\"");
            String response = s.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Bart smiles warmly and suggests another date to the aquarium. The evening ends and he sends you home in an Uber lux with a bouquet of fresh flowers.");
            } else if (response.equalsIgnoreCase("no")) {
                {
                    System.out.println("I understand. It was lovely meeting you. Take care.");
                    System.out.println("*Bart smiles warmly and sends you home in an Uber lux.*");
                }


            }


        }
        if (whichDate.equals("2")) {
            System.out.println("A restaurant date it is! I've heard there's a lovely Italian restaurant nearby. Would you like to go there?");
            String resturantDate = s.nextLine();
            if (resturantDate.equals("yes")) {
                System.out.println("*You walk there and once seated, Barty starts a conversation about your favorite Italian dishes.*");
                System.out.println("*Throughout the meal, Bart continues to be charming and engaging, making the date enjoyable.*");
                System.out.println("*After a delightful dinner, Barty insists on covering the bill.*");
                System.out.println("It was a pleasure spending this evening with you. Can I see you again?");
                String response = s.nextLine();
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

    public void dwC() {
        Pause pa = new Pause();
        Clear c = new Clear();
        c.clearScreen();
        System.out.println("Nice to meet you, " + user.getName() + ". My name is Charizztopher, but people call me " + dateChris.getName().substring(3, 7) + "\n! Do you want to go on a picnic date(1) or an amusement park date(2)?");
        dateChris.addRedFlag(1);
        Scanner date = new Scanner(System.in);
        String choice = date.nextLine();
        c.clearScreen();
        if (choice.equals("1")) {
            System.out.println("Let's go to the grocery store then! I only have " + dateChris.getMoney() + " dollars though, so you can pay the rest of what I can't lol. \n\nDo you want Arizona?");
            dateChris.addRedFlag(1);
            String ari = date.nextLine();
            if (ari.equals("yes")) {
                c.clearScreen();
                System.out.print("Okay, I'll get 2 for me and 1 for you.");
                dateChris.addGroceries(3);
            } else {
                c.clearScreen();
                System.out.println("Okay. I'll get 2 for myself then.");
                dateChris.addGroceries(2);
            }
            pa.pauseTime(1500);
            c.clearScreen();
            System.out.println("\nI want lunchables, which is only 10 dollars! What a steal! \n\nooooh I want some chocolates, but it's 50 dollars omg. \nYou wouldn't mind paying, right? \n\nLol, why am I even asking? Of course, you wouldn't mind.");
            dateChris.addRedFlag(3);
            dateChris.addGroceries(10 + 50);
            pa.pauseTime(3000);
            c.clearScreen();
            System.out.println("Do we need any more food?");
            String needs = date.nextLine();
            if (needs.equals("no")) {
                c.clearScreen();
                System.out.println("Ok fire! Let's go pay now!, you got the bill right?");
            } else {
                c.clearScreen();
                System.out.println("What other food do we need?");
                date.nextLine();
                c.clearScreen();
                System.out.println("Are you really going to eat all that? \nYeah, we are not getting that. Let's go pay now.");
                dateChris.addRedFlag(1);
            }
            double lol = dateChris.total();
            lol *= 1.18;
            pa.pauseTime(1500);
            c.clearScreen();
            System.out.println("The total is " + lol + ". Thanks for paying for us babe! \nI had a feeling you were a generous person when I met you!");
            dateChris.addRedFlag(1);
            System.out.println("\n*You and Rizz arrive at the park and sit down at your pre-prepared picnic setting. You guys eat for 50 minutes*\n");
            System.out.println("Soooo..... I weigh 250 lb. How much do you weigh?");
            dateChris.addRedFlag(1);
            int weight = date.nextInt();
            if (weight > 100) {
                c.clearScreen();
                System.out.println("oh.");
                System.out.println("*Gets up, packs his things and leaves* \n Bye fatty, I'll text you my gym location before I block you.");
                dateChris.addRedFlag(1);
            } else {
                c.clearScreen();
                System.out.println("Ok cutie patoots! I'll call you later pook.");
                dateChris.addRedFlag(2);
            }
            pa.pauseTime(1500);


        } else if (choice.equals("2")) {

        }


        c.clearScreen();
        System.out.println("Congratulations! You have survived your date! \nNow its time for the entire purpose of the game!!!!!");
        int red = rfc();
        System.out.println(dateChris.printFlag());
        if (red == dateChris.printFlag()) {
            c.clearScreen();
            guessFlags = true;
            System.out.println("That's the correct number of red flags!");
            newDate();
        } else {
            while (!guessFlags) {
                c.clearScreen();
                System.out.println("That's wrong. Try again!");
                red = rfc();
                if (red == dateChris.printFlag()) {
                guessFlags = true;
                System.out.println("That's the correct number of red flags!");
                newDate();
                c.clearScreen();
                }
            }
        }

    }
public void dwG() {
    Pause  pa = new Pause();
        date.introduce();
        Scanner s = new Scanner(System.in);
        System.out.println("Hey where do you want to go eat? Applebee's or Olive Garden, im a little short on money.");
        dGertrude.addRedFlag(1);
        pa.pauseTime(1500);
        System.out.print("(A) for Applebee's or (O) for Olive Garden: ");
        String choice = s.nextLine();
        switch (choice.toUpperCase()) {
            case "A":
                System.out.println("Isn't Applebee's for kids... whatever lets go.");
                dGertrude.addRedFlag(1);

                break;
            case "O":
                System.out.println("Olive Garden it is! I love me a cheap Italian dinner.");
                dGertrude.addRedFlag(1);
                break;
            default:
                System.out.println("Ugh so indecisive...I'll pick Olive Garden then, since you cant decide.");
                dGertrude.addRedFlag(1);
                break;
        }
        if (choice.equals("A")) {
            System.out.println("So what do you want to eat?");
            System.out.println("(A) a salad (B) Sirloin steak (C) Chicken Tenders");
        }
        else{
            System.out.println("So what do you want to eat?");
            System.out.println("(A) House Salad (B) Never Ending Pasta (C) Herb-Grilled Salmon ");
            switch (choice.toUpperCase()) {
                case "A":
                    System.out.println("Good choice, seems like you need it.");
                    dGertrude.addRedFlag(1);
                    break;
                case "B":
                    System.out.println("You're going to eat all of that?!");
                    dGertrude.addRedFlag(1);
                    break;
                case "C":
                    System.out.println("You chose Herb-Grilled Salmon.");
                    System.out.println("You're paying the whole bill if you want to spend 30 dollars on that...");
                    dGertrude.addRedFlag(1);
                    break;
                default:
                    System.out.println("I think you'll get the salad. Looks like you need that");
                    dGertrude.addRedFlag(1);
            }
            }



        String food = s.nextLine();
        switch(food.toUpperCase()){
            case "A":

        }
        System.out.println("*After the food has arrived*");
        pa.pauseTime(1500);
        System.out.println("So, let's talk about me. I'm amazing. What do you think about me?");
        pa.pauseTime(1500);
        dGertrude.addRedFlag(1);
        System.out.println("(A) You are amazing....ly annoying. (B) I've always wanted to meet someone who's humble enough to admit that. (C) You seem like a nice person.");
        pa.pauseTime(1500);
        String amz = s.nextLine();
        switch (amz.toUpperCase()) {
            case "A":
                System.out.println("Of course small-minded people would say that.");
                pa.pauseTime(1500);
                dGertrude.addRedFlag(1);
                break;
            case "B":
                System.out.println("I know right, I'm such a humble and kind person.");
                pa.pauseTime(1500);
                dGertrude.addRedFlag(1);
                break;
            case "C":
                System.out.println("Omg, thank youu!!");
                pa.pauseTime(1500);
                break;
            default:
                System.out.println("*Ignores what you said*");
                pa.pauseTime(1500);
                dGertrude.addRedFlag(1);
        }
        System.out.println(" ");
        System.out.println("Sorry, can we make this quick. I have another date in 3 hours.");
        pa.pauseTime(1500);
        dGertrude.addRedFlag(1);
        System.out.println("(A) Excuse me?. (B) Me too!");
        String yn = s.nextLine();
        if (yn.equalsIgnoreCase("A")) {
            System.out.println("Damn, sorry, can you not take a joke? Just ignore what I said...");
            pa.pauseTime(1500);
            dGertrude.addRedFlag(1);
        } else if (yn.equalsIgnoreCase("B")) {
            System.out.println("Umm.. What did you just say? You can't be doing that to me??");
            pa.pauseTime(1500);
            dGertrude.addRedFlag(1);

        }
    }
}
