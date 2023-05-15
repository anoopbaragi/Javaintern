package OOPS;
abstract class District
{
    public abstract void name();
}

class City extends District
{
    public void name()
    {
        System.out.println("Mysuru!");
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
        City ct = new City();
        ct.name();
    }
}