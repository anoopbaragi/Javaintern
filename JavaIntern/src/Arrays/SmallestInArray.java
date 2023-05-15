package Arrays;

public class SmallestInArray
{
    public static int getSmallest(int[] a, int total)
    {
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }
    public static void main(String args[])
    {
        int a[]={10,2,55,68,35,26};
        System.out.println("Smallest: "+getSmallest(a,6));
    }
}
