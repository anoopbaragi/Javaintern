package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file
{
    public static void main(String[] args)
    {
        try
        {
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("Mysuru");
            fw.close();
            System.out.println("\nFile write done");
        }
        catch (IOException e)
        {
            System.out.println("There are some IOException");
        }
    }
}
