public class Person
{
    private String name = null;
    private String nickName;
    private int age;
    private int charisma;
    private String eyeColor;
    private int money;
    private double groceries;
    private int greenFlags;
    private int redFlags;


    public Person(String n, String l, int a, int c, String e, int m, double g, int r)
    {
        name = n;
        nickName = l;
        age = a;
        charisma = c;
        eyeColor = e;
        money = m;
        groceries = g;
        redFlags = r;
    }
    public Person(String n, int a, int c, String e, int m, int r)
    {
        name = n;
        age = a;
        charisma = c;
        eyeColor = e;
        money = m;
        redFlags = r;
    }
    public Person(String n, String l, int a, int c, String e, int g, int m, int f)
    {
        name = n;
        nickName = l;
        age = a;
        charisma = c;
        eyeColor = e;
        groceries = g;
        money = m;
        greenFlags = f;
    }

    public void introduce() {
        System.out.println("Hi, My name is " + name + ".\nI am " + age   + " years old.");
        System.out.println("I think my charisma level is " + charisma + ".\nMy eyes are " + eyeColor + ".");
    }

    public String getName()
    {
        return name;
    }

    public int getMoney()
    {
        return money;
    }



    public void addGreenFlag(int n)
    {
        greenFlags+= n;
    }
    public void addRedFlag(int n)
    {
        redFlags+= n;
    }
    public int printFlag(){
        return redFlags;
    }
    public void addGroceries(int n)
    {
        groceries+= n;
    }


    public double total(){
        return (double)groceries;
    }
}






