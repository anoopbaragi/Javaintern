package OOPS;
interface Greeting
{
    public void greet();
}
class EnglishGreeting implements Greeting
{
    public void greet()
    {
        System.out.println("Hello!");
    }
}
public class Interface
{
    public static void main(String[] args)
    {
        EnglishGreeting englishGreeting = new EnglishGreeting();
        englishGreeting.greet();
    }
}
