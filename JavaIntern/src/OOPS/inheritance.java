package OOPS;

class mobile
{
    public void details()
    {
        System.out.println("Device:Iphone 6s plus");
    }
}
  class smartphone extends mobile
  {
      public void smartphone()
      {
          System.out.println("Storage :64GB");
      }
  }

public class inheritance
{
    public static void main(String[] args)
    {
       smartphone sp = new smartphone();
       sp.details();
       sp.smartphone();
    }
}
