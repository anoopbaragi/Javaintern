package Collections;

public class Occurrences
{
    public static void main(String args[])
    {
        String str = "Anoop Baragi";
        char ch = 'a';
        int freq = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(ch == str.charAt(i))
            {
                ++freq;
            }
        }
        System.out.println("Frequency of " + ch + " = " + freq);
    }
}