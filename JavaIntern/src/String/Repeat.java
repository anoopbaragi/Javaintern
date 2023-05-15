package String;

public class Repeat
{
    static String firstRepChar(String s)
    {
        int a[] = new int[20];

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (a[ch - 'a'] != 0)
                return Character.toString(ch);
            else
                a[ch - 'a']++;
        }
        return "-1";
    }
    public static void main(String[] args)
    {
        String str = "anoopbaragi";
        System.out.println(firstRepChar(str));
    }
}
