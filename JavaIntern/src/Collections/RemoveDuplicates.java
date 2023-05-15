package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Mysuru");
        arrayList.add("Iphone11");
        arrayList.add("Hello");
        System.out.println(arrayList);
        Set<String> setlist = new LinkedHashSet<String>(arrayList);
        System.out.println(setlist);
    }
}