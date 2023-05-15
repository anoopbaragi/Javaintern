package OOPS;

public class methodoverloading
{
    public static int cal(int x ,int y,int z,int q ,int w)
    {
        int add =x+y+z+q+w;
        return add;
    }

    public static int cal(int x ,int y,int z,int s)
    {
        int sub =x-y-z-s;
        return sub;
    }
    public static float cal(float x ,float y,float z)
    {
        float mul =x*y*z;
        return mul;
    }
    public static int cal(int x ,int y)
    {
        int div =x/y;
        return div;
    }

    public static void main(String[] args)
    {
        methodoverloading ob = new methodoverloading();
        System.out.println("Add");
        System.out.println(ob.cal(60,3,2,10,5));
        System.out.println("Sub");
        methodoverloading ob1 = new methodoverloading();
        System.out.println(ob1.cal(20,1,3,2));
        System.out.println("MUL");
        methodoverloading ob2 = new methodoverloading();
        System.out.println(ob2.cal((float) 2.2,1.0f,3.0f));
        System.out.println("DIV");
        methodoverloading ob3 = new methodoverloading();
        System.out.println(ob3.cal(40,2));
    }
}
