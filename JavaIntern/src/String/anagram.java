package String;

import java.util.Arrays;

public class anagram
{
    public static void main(String[] args)
    {
        String str1 = "anoop";
        String str2 = "oonpa";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length())
        {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            boolean result = Arrays.equals(charArray1, charArray2);
            if(result)
            {
                System.out.println(str1 + " and " + str2 + " are String.anagram.");
            }
            else
            {
                System.out.println(str1 + " and " + str2 + " are not String.anagram.");
            }
        }
        else
        {
            System.out.println(str1 + " and " + str2 + " are not String.anagram.");
        }
    }
}
