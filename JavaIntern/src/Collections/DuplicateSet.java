package Collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateSet
{
    public static void main(String[] args)
    {
        String string = "Welcome to Mysuru";
        System.out.println("The given string is: " + string);
        char s[] = string.toCharArray();
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        for(char c: s)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c) + 1);
            }
            else
            {
                map.put(c , 1);
            }
        }
        System.out.println();
        System.out.print("The duplicate characters in the string are: ");
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
            {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}