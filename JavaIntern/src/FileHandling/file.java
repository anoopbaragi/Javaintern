package FileHandling;

import java.io.*;

public class file
{
    String st;
    public  void WriteFile() throws IOException
    {
        try
        {
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("Mysuru!!!!!");
            fw.close();
            System.out.println("\nFile write done");
        }
        catch (IOException e)
        {
            System.out.println("There are some IOException");
        }
    }
    public  void ReadFile() throws IOException
    {
        File file = new File("C:\\Users\\HP\\IdeaProjects\\JavaIntern\\Read.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
    public static void main(String[] args) throws IOException
    {
        file f = new file();
        f.WriteFile();
        f.ReadFile();
    }
}