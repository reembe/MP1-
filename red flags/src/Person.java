public class Person
{
    private String name = null;
    private int age;
    private int charisma;
    private String eyeColor;

    public Person(String n, int a, int c, String e)
    {
        name = n;
        age = a;
        charisma = c;
        eyeColor = e;
    }

    public void date(Person other)
    {

    }
    public String getName()
    {
        return name;
    }
}
