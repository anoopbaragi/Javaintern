package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListArray
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Mysuru");
        arrayList.add("Iphone11");
        System.out.println(arrayList);
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);
    }
}
